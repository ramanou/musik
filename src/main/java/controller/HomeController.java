package controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import model.Music;
import model.MusicComment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import service.MusicService;
import service.PersonService;
import service.UserService;
import wrapper.SearchMusicWrapper;
import ws.AboutWebService;

@Controller
public class HomeController {

	@Autowired
	private MusicService musicService;

	@Autowired
	private PersonService personService;

	@Autowired
	private UserService userService;

	public HomeController() {
		super();
	}

	/**
	 * A propos
	 */
	@RequestMapping("/about")
	public ModelAndView about() {
		ModelAndView mav = new ModelAndView("apropos");
		return mav;
	}

	@RequestMapping(value = "/comment", method = RequestMethod.POST)
	public ModelAndView commentMusic(
			@ModelAttribute("musicComment") MusicComment musicComment,
			HttpServletRequest request) {
		musicComment.setInetAdress(request.getRemoteAddr());
		musicService.addComment(musicComment);
		List<Music> musics = musicService.findAllMusicsWithComments();
		ModelAndView mav = new ModelAndView("list");
		mav.addObject("musics", musics);
		mav.addObject("musicComment", new MusicComment());
		return mav;
	}

	@ModelAttribute("markValues")
	public int[] getMarkValues() {
		int[] values = { 1, 2, 3, 4, 5 };
		return values;
	}

	@ModelAttribute("musicComment")
	public MusicComment getMusicComment() {
		return new MusicComment();
	}

	@ModelAttribute("music")
	public Music getMusiqueModel() {
		return new Music();
	}

	@ModelAttribute("searchMusicWrapper")
	public SearchMusicWrapper getSearchMusicWrapper() {
		return new SearchMusicWrapper();
	}

	@ModelAttribute("technologies")
	public String[] getTechnologies() {
		return AboutWebService.TECHNOLOGIES;
	}

	@RequestMapping("/")
	public ModelAndView homePage(Model model) {
		ModelAndView mav = new ModelAndView("index");
		List<Music> lastMusics = musicService.findLastMusic(3);
		mav.addObject("musics", lastMusics);
		return mav;
	}

	/**
	 * Liste
	 */
	@RequestMapping("/list")
	public ModelAndView listMusic() {
		ModelAndView mav = new ModelAndView("list");
		mav.addObject("musics", musicService.findAllMusicsWithComments());
		return mav;
	}

	@RequestMapping(value = "/search", method = RequestMethod.POST)
	public ModelAndView searchMusic(
			@ModelAttribute("searchMusicWrapper") SearchMusicWrapper wrapper) {
		List<Music> musics = musicService.search(wrapper);
		ModelAndView mav = new ModelAndView("list");
		mav.addObject("musics", musics);
		return mav;
	}

}

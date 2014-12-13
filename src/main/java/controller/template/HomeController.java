package controller.template;

import model.Music;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import service.MusicService;
import service.PersonService;
import service.UserService;


@Controller
public class HomeController {

	@Autowired
	private UserService userService;
	
	@Autowired
	private PersonService personService;
	
	@Autowired
	private MusicService musicService;

	public HomeController() {
		super();
	}
	
	@RequestMapping("/")
	public ModelAndView homePage(Model model) {
		ModelAndView mav = new ModelAndView("index");
		mav.addObject("musics", musicService.findAllMusics());
		return mav;
	}
	
	/**
	 * Liste
	 */
	@RequestMapping("/liste")
	public ModelAndView liste() {
		ModelAndView mav = new ModelAndView("liste");
		mav.addObject("musics", musicService.findAllMusics());
		return mav;
	}
	
	@ModelAttribute("music")
	public Music getMusiqueModel() {
		return new Music();
	}

}

package controller.template;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import model.Person;
import service.PersonService;

import model.Music;
import service.MusicService;

import model.UserAdmin;
import service.UserService;

@Controller
@RequestMapping("/admin")
public class AdminController {

	@Autowired
	private PersonService artistService;
	
	@Autowired
	private MusicService musicService;
	
	@Autowired
	private UserService useradminService;
	
	@RequestMapping("/manage")
	public String index() {
		return "admin/index";
	}

	@RequestMapping(value = "/artist", method = RequestMethod.POST)
	public ModelAndView addArtist(@ModelAttribute("person") @Valid Person person, BindingResult results) {
		ModelAndView mav = new ModelAndView("/admin/artist/index");
		if (!results.hasErrors()) {
			artistService.createPerson(person);
		}
		mav.addObject("persons", artistService.findAllPersons());
		return mav;
	}

	@RequestMapping(value = "/artist/delete/{id}", method = RequestMethod.GET)
	public String deleteArtist(@PathVariable("id") int id) {
		artistService.deletePersonByKey(id);
		return "redirect:/admin/artist";
	}

	@RequestMapping(value = "/artist", method = RequestMethod.GET)
	public ModelAndView getArtists() {
		ModelAndView mav = new ModelAndView("admin/artist/index");
		mav.addObject("persons", artistService.findAllPersons());
		mav.addObject("person", new Person());
		return mav;
	}
	
	//Mapping de la Music
	
	@RequestMapping(value = "/music", method = RequestMethod.POST)
	public ModelAndView addMusic(@ModelAttribute("music") @Valid Music music, BindingResult results) {
		ModelAndView mav = new ModelAndView("/admin/music/index");
		if (!results.hasErrors()) {
			musicService.createMusic(music);
		}
		mav.addObject("musics", musicService.findAllMusics());
		return mav;
	}

	@RequestMapping(value = "/music/delete/{id}", method = RequestMethod.GET)
	public String deleteMusic(@PathVariable("id") int id) {
		musicService.deleteMusicByKey(id);
		return "redirect:/admin/music";
	}

	@RequestMapping(value = "/music", method = RequestMethod.GET)
	public ModelAndView getMusics() {
		ModelAndView mav = new ModelAndView("admin/music/index");
		mav.addObject("musics", musicService.findAllMusics());
		mav.addObject("music", new Music());
		return mav;
	}
	
	// MAPPING DE USER ADMIN
	
	@RequestMapping(value = "/useradmin", method = RequestMethod.POST)
	public ModelAndView addUseradmin(@ModelAttribute("useradmin") @Valid UserAdmin useradmin, BindingResult results) {
		ModelAndView mav = new ModelAndView("/admin/useradmin/useradmin");
		if (!results.hasErrors()) {
			useradminService.createUser(useradmin);
		}
		mav.addObject("useradmins", useradminService.findAllUsers());
		return mav;
	}

	@RequestMapping(value = "/useradmin/delete/{id}", method = RequestMethod.GET)
	public String deleteUseradmin(@PathVariable("id") int id) {
		useradminService.deleteUserByKey(id);
		return "redirect:/admin/useradmin";
	}

	@RequestMapping(value = "/useradmin", method = RequestMethod.GET)
	public ModelAndView getuseradmins() {
		ModelAndView mav = new ModelAndView("admin/useradmin/useradmin");
		mav.addObject("useradmins", useradminService.findAllUsers());
		mav.addObject("useradmin", new UserAdmin());
		return mav;
	}
}

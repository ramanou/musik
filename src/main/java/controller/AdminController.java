package controller;

import java.util.List;

import javax.validation.Valid;

import org.hibernate.Hibernate;
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
	private PersonService personService;
	
	@Autowired
	private UserService useradminService;
	
	@RequestMapping("/manage")
	public String index() {
		return "admin/index";
	}

	@RequestMapping(value = "/artist", method = RequestMethod.POST)
	public String addArtist(@ModelAttribute("person") @Valid Person person, BindingResult results) {
		ModelAndView mav = new ModelAndView("/admin/artist/index");
		if (!results.hasErrors()) {
			artistService.createPerson(person);
		}
		return "redirect:/admin/artist";
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
	public String addMusic(@ModelAttribute("music") @Valid Music music, BindingResult results) {
		ModelAndView mav = new ModelAndView("/admin/music/index");
		if (!results.hasErrors()) {
			musicService.createMusic(music);
		}
		return "redirect:/admin/music";
	}

	@RequestMapping(value = "/music/delete/{id}", method = RequestMethod.GET)
	public String deleteMusic(@PathVariable("id") int id) {
		musicService.deleteMusicByKey(id);
		return "redirect:/admin/music";
	}

	@RequestMapping(value = "/music", method = RequestMethod.GET)
	public ModelAndView getMusics() {
		ModelAndView mav = new ModelAndView("admin/music/index");
		List<Person> persons = personService.findAllPersonsWithMusics();
		mav.addObject("personsWithMusics", persons);
		return mav;
	}
	
	// MAPPING DE USER ADMIN
	
	@RequestMapping(value = "/useradmin", method = RequestMethod.POST)
	public ModelAndView addUseradmin(@ModelAttribute("useradmin") @Valid UserAdmin useradmin, BindingResult results) {
		ModelAndView mav = new ModelAndView("/admin/useradmin/useradmin");
		if (!results.hasErrors()) {
			useradminService.createUser(useradmin);
		}
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
		return mav;
	}
	
	@ModelAttribute("music")
	public Music getMusic() {
		return new Music();
	}
	@ModelAttribute("persons")
	public List<Person> getPersons() {
		return personService.findAllPersons();
	}
	
	@ModelAttribute("useradmin")
	public UserAdmin getUserAdmin() {
		return new UserAdmin();
	}
	
	@ModelAttribute("usersadmin")
	public List<UserAdmin> getUsersAdmin() {
		return useradminService.findAllUsers();
	}
}

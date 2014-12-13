package controller.template;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import service.UserService;

@Controller
public class LoginController {

	@Autowired
	private UserService userService;

	public LoginController() {
		super();
	}

	/**
	 * Login
	 */
	@RequestMapping("/login")
	public String login() {
		return "login";
	}

	/**
	 * Login failed
	 */
	@RequestMapping("/loginfailed")
	public String loginFailed(Model model) {
		model.addAttribute("isLoginError", true);
		return "forward:/login";
	}

	/**
	 * Logout
	 */
	@RequestMapping("/logout")
	public String logout() {
		return "logout";
	}

}

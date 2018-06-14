package vn.poly.sof302.doannvph04705.homepage;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import vn.poly.sof302.doannvph04705.common.entities.Users;

@Controller
@RequestMapping("/homepage")
public class IndexController {

	@GetMapping
	public String Index() {
		return "/homepage/index";
	}

	@GetMapping("/login")
	public String showLogin(ModelMap model) {
		model.addAttribute("account", new Users());
		return "/homepage/login";
	}
}

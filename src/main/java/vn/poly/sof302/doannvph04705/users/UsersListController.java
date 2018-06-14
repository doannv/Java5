package vn.poly.sof302.doannvph04705.users;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import vn.poly.sof302.doannvph04705.common.bases.BaseController;
import vn.poly.sof302.doannvph04705.common.entities.Users;
import vn.poly.sof302.doannvph04705.users.service.impl.UsersServiceImpl;

@Controller
@RequestMapping("/homepage")
public class UsersListController extends BaseController {

	@Autowired
	UsersServiceImpl usersService;

	@PostMapping("login")
	public String submnit(HttpSession session, @ModelAttribute Users users, RedirectAttributes redirectAttributes) {
		if (users.getUsername() == null || users.getPassword() == null) {
			redirectAttributes.addFlashAttribute("message", "Đăng nhập thất bại");
			return "redirect:/login";
		} else if (usersService.checkAuth(users.getUsername(), users.getPassword())) {
			session.setAttribute("Username", users.getUsername());
			session.setAttribute("Password", users.getPassword());
			return "redirect:/staffs";
		}
		redirectAttributes.addFlashAttribute("message", "Đăng nhập thất bại");
		return "redirect:/homepage/login";
	}

	@GetMapping("logout")
	public String logout(@RequestParam("action") String enter) {
		enter.equals("logout");
		return "/homepage/index";
	}
}

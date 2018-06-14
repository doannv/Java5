package vn.poly.sof302.doannvph04705.users;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class UsersRemoveController {

    @GetMapping("/remove")
    public String confirm() {

        return "department/remove";
    }

    
    @PostMapping("/remove")
    public String submit() {

        return "redirect:/department";
    }
}

package vn.poly.sof302.doannvph04705.staffs;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import vn.poly.sof302.doannvph04705.common.entities.Staffs;
import vn.poly.sof302.doannvph04705.staffs.service.impl.StaffServiceImpl;

@Controller
@RequestMapping("/staffs")
public class StaffListController {
	@Autowired
	private StaffServiceImpl staffsService;

	@GetMapping
	public String showStaffs(ModelMap model) {
		model.addAttribute("st", new Staffs());
		model.addAttribute("staffs", staffsService.ListAllStaffs());
		return "/staffs/index";
	}

	
}

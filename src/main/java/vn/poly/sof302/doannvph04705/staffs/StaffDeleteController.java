package vn.poly.sof302.doannvph04705.staffs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import vn.poly.sof302.doannvph04705.staffs.service.impl.StaffServiceImpl;

@Controller
@RequestMapping("/staffs")
public class StaffDeleteController {
	@Autowired
	private StaffServiceImpl staffsService;

	// xóa nhân viên
	@GetMapping("delete-staffs={id}")
	public String deleteStaffs(@PathVariable("id") String id) {
		staffsService.deleteStaffs(id);
		return "redirect:/staffs";
	}
}

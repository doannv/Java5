package vn.poly.sof302.doannvph04705.department;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import vn.poly.sof302.doannvph04705.department.service.impl.DepartmentServiceImpl;

@Controller
@RequestMapping("/department")
public class DepartmentRemoveController {
	@Autowired
	DepartmentServiceImpl departmentService;
	
	@GetMapping("/delete-departs={id}")
	public String deleteDeparts(@PathVariable("id") String id) {
		departmentService.deleteDeparts(id);
		return "redirect:/department";
	}
}

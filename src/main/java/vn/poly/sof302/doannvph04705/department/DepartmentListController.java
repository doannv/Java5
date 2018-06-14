package vn.poly.sof302.doannvph04705.department;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import vn.poly.sof302.doannvph04705.department.service.impl.DepartmentServiceImpl;
import vn.poly.sof302.doannvph04705.common.bases.BaseController;
import vn.poly.sof302.doannvph04705.common.entities.Departs;

@Controller
@RequestMapping("/department")
public class DepartmentListController extends BaseController {

	@Autowired
	DepartmentServiceImpl departmentService;

	@GetMapping
	public String listDeparts(ModelMap model) {
		model.addAttribute("dp", new Departs());
		model.addAttribute("departs", departmentService.list());
		return "/department/index";

	}
}

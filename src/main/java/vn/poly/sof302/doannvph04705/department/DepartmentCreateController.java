package vn.poly.sof302.doannvph04705.department;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import vn.poly.sof302.doannvph04705.department.dto.DepartmentDto;
import vn.poly.sof302.doannvph04705.department.form.DepartmentCreateForm;
import vn.poly.sof302.doannvph04705.department.service.DepartmentService;
import vn.poly.sof302.doannvph04705.common.bases.BaseController;
import vn.poly.sof302.doannvph04705.common.utils.DataTransformUtil;

@Controller
@RequestMapping("/department/")
public class DepartmentCreateController extends BaseController {

	@Autowired
	DepartmentService departmentService;

	@GetMapping("/create")
	public String addDeparts(ModelMap model) {
		model.addAttribute("dp", new DepartmentCreateForm());
		return "department/create";

	}

	@PostMapping("create")
	public String addDeparts(ModelMap model, DepartmentCreateForm formDeparts) {
		DepartmentDto departmentDto = (DepartmentDto) DataTransformUtil.transform(formDeparts, DepartmentDto.class);
		departmentService.insertDeparts(departmentDto);
		return "redirect:/department";
	}
}

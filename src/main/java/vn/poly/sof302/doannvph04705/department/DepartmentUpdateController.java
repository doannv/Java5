package vn.poly.sof302.doannvph04705.department;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import vn.poly.sof302.doannvph04705.common.utils.DataTransformUtil;
import vn.poly.sof302.doannvph04705.department.form.DepartmentUpdateForm;
import vn.poly.sof302.doannvph04705.department.service.impl.DepartmentServiceImpl;
import vn.poly.sof302.doannvph04705.department.dto.DepartmentDto;

@Controller
@RequestMapping("/department")
public class DepartmentUpdateController {

	@Autowired
	DepartmentServiceImpl departmentService;

	@GetMapping("/edit-departs={id}")
	public String editDeparts(ModelMap model, @PathVariable String id) {
		DepartmentDto departmentDto = departmentService.getDepartId(id);
		DepartmentUpdateForm form = (DepartmentUpdateForm) DataTransformUtil.transform(departmentDto,
				DepartmentUpdateForm.class);
		model.addAttribute("itemDeparts", form);
		return "department/edit";
	}

	@PostMapping("edit-departs={id}")
	public String editDepart(ModelMap model, DepartmentUpdateForm form) {
		// Cast form dto
		DepartmentDto departmentDto = (DepartmentDto) DataTransformUtil.transform(form, DepartmentDto.class);
		// Call service to update department
		departmentService.editDeparts(departmentDto);
		return "redirect:/department";
	}
}

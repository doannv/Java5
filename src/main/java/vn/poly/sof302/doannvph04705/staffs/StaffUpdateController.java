package vn.poly.sof302.doannvph04705.staffs;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import vn.poly.sof302.doannvph04705.common.utils.DataTransformUtil;
import vn.poly.sof302.doannvph04705.department.dto.DepartmentDto;
import vn.poly.sof302.doannvph04705.department.service.DepartmentService;
import vn.poly.sof302.doannvph04705.staffs.dto.StaffDto;
import vn.poly.sof302.doannvph04705.staffs.form.StaffUpdateForm;
import vn.poly.sof302.doannvph04705.staffs.service.StaffService;

@Controller
@RequestMapping("/staffs")
public class StaffUpdateController {
	@Autowired
	private StaffService staffsService;
	@Autowired
	private DepartmentService departService;

	// danh sách phòng ban
	@ModelAttribute("listDeparts")
	public List<DepartmentDto> listDeparts() {
		return departService.list();
	}

	@GetMapping("/edit-staffs={id}")
	public String editStaffs(ModelMap model, @PathVariable String id) {
		StaffDto staffDto = staffsService.getStaffsId(id);
		StaffUpdateForm form = (StaffUpdateForm) DataTransformUtil.transform(staffDto, StaffUpdateForm.class);
		model.addAttribute("itemStaffs", form);
		return "staffs/edit";
	}

	@PostMapping("edit-staffs={id}")
	public String editStaff(ModelMap model, StaffUpdateForm form) {
		// Cast form dto
		StaffDto staffDto = (StaffDto) DataTransformUtil.transform(form, StaffDto.class);
		// Call service to update staffs
		staffsService.editStaffs(staffDto);
		return "redirect:/staffs";
	}

}

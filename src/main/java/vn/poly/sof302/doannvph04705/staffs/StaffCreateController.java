package vn.poly.sof302.doannvph04705.staffs;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import vn.poly.sof302.doannvph04705.common.bases.BaseController;
import vn.poly.sof302.doannvph04705.common.utils.DataTransformUtil;
import vn.poly.sof302.doannvph04705.department.dto.DepartmentDto;
import vn.poly.sof302.doannvph04705.department.service.DepartmentService;
import vn.poly.sof302.doannvph04705.staffs.dto.StaffDto;
import vn.poly.sof302.doannvph04705.staffs.form.StaffCreateForm;
import vn.poly.sof302.doannvph04705.staffs.service.impl.StaffServiceImpl;

@Controller
@RequestMapping("/staffs/")
public class StaffCreateController extends BaseController {
	@Autowired
	StaffServiceImpl staffsService;

	@Autowired
	DepartmentService departService;

	@GetMapping("/create")
	public String showStaffs(ModelMap model) {
		model.addAttribute("st", new StaffCreateForm());
		return "staffs/create";

	}

	// danh sách phòng ban
	@ModelAttribute("listDeparts")
	public List<DepartmentDto> listDeparts() {
		return departService.list();
	}

	// thêm phòng ban
	@PostMapping("/create")
	public String createStaffs(ModelMap model, StaffCreateForm formStaffs) {
		StaffDto staffsdto = (StaffDto) DataTransformUtil.transform(formStaffs, StaffDto.class);
		staffsService.createStaffs(staffsdto);
		return "redirect:/staffs";
	}
}

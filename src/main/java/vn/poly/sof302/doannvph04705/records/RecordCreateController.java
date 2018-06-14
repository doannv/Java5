package vn.poly.sof302.doannvph04705.records;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import vn.poly.sof302.doannvph04705.records.dto.RecordDto;
import vn.poly.sof302.doannvph04705.records.form.RecordCreateForm;
import vn.poly.sof302.doannvph04705.records.service.RecordService;
import vn.poly.sof302.doannvph04705.staffs.dto.StaffDto;
import vn.poly.sof302.doannvph04705.staffs.service.StaffService;
import vn.poly.sof302.doannvph04705.common.bases.BaseController;
import vn.poly.sof302.doannvph04705.common.utils.DataTransformUtil;

@Controller
@RequestMapping("/records/")
public class RecordCreateController extends BaseController {
	@Autowired
	private RecordService recordsService;

	@Autowired
	private StaffService staffsService;

	@GetMapping("/create")
	public String showRecords(ModelMap model) {
		model.addAttribute("rc", new RecordCreateForm());
		return "records/create";
	}

	@ModelAttribute("staffs")
	public List<StaffDto> listStaffs() {
		return staffsService.ListAllStaffs();

	}

	@PostMapping("/create")
	public String createRecords(ModelMap model, RecordCreateForm recordsForm) {
		RecordDto recordsDto = (RecordDto) DataTransformUtil.transform(recordsForm, RecordDto.class);
		recordsService.insertRecords(recordsDto);
		return "redirect:/records";
	}
}

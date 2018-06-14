package vn.poly.sof302.doannvph04705.records;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import vn.poly.sof302.doannvph04705.records.service.RecordService;
import vn.poly.sof302.doannvph04705.common.bases.BaseController;
import vn.poly.sof302.doannvph04705.common.entities.Records;

@Controller
@RequestMapping("/records")
public class RecordtListController extends BaseController {

	@Autowired
	RecordService recordsService;

	@GetMapping
	public String listDeparts(ModelMap model) {
		model.addAttribute("rc", new Records());
		model.addAttribute("records", recordsService.list());
		return "/records/index";

	}
}

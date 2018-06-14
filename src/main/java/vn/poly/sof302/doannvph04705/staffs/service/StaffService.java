package vn.poly.sof302.doannvph04705.staffs.service;

import java.util.List;

import vn.poly.sof302.doannvph04705.common.bases.BaseServiceInterface;
import vn.poly.sof302.doannvph04705.staffs.dto.StaffDto;

public interface StaffService extends BaseServiceInterface {
	
	public List<StaffDto> ListAllStaffs();

	public boolean createStaffs(StaffDto staffsdto);

	public boolean deleteStaffs(String id);

	public boolean editStaffs(StaffDto staffs);

	public StaffDto getStaffsId(String id);

	public boolean checkId(String id);
}

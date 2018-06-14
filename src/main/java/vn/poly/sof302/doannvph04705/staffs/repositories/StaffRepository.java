package vn.poly.sof302.doannvph04705.staffs.repositories;

import java.util.List;

import vn.poly.sof302.doannvph04705.common.entities.Staffs;

public interface StaffRepository {


	public List<Staffs> ListAllStaffs();

	public boolean insertStaffs(Staffs staffs);

	public boolean deleteStaffs(String id);

	public boolean editStaffs(Staffs staffs);

	public Staffs getStaffsId(String id);

	public boolean checkId(String id);

	
}

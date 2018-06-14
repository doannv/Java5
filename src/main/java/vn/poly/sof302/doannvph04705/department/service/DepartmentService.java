package vn.poly.sof302.doannvph04705.department.service;

import java.util.List;

import vn.poly.sof302.doannvph04705.common.bases.BaseServiceInterface;
import vn.poly.sof302.doannvph04705.department.dto.DepartmentDto;

public interface DepartmentService extends BaseServiceInterface {

	public List<DepartmentDto> list();

	public boolean checkId(String id);

	public boolean insertDeparts(DepartmentDto departs);

	public boolean deleteDeparts(String id);

	public boolean editDeparts(DepartmentDto departs);

	public DepartmentDto getDepartId(String id);
}

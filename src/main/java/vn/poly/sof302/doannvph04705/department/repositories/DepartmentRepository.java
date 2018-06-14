package vn.poly.sof302.doannvph04705.department.repositories;

import java.util.List;

import vn.poly.sof302.doannvph04705.common.entities.Departs;

public interface DepartmentRepository {

	public List<Departs> ListAllDeparts(int offset, int limit);

	public boolean insertDeparts(Departs departs);

	public boolean deleteDeparts(String id);

	public boolean editDeparts(Departs departs);

	public Departs getDepartId(String id);

	public boolean checkId(String id);
}

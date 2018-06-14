package vn.poly.sof302.doannvph04705.staffs.repositories.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import vn.poly.sof302.doannvph04705.common.bases.BaseRepository;
import vn.poly.sof302.doannvph04705.common.entities.Staffs;
import vn.poly.sof302.doannvph04705.staffs.repositories.StaffRepository;

@Repository
public class StaffRepositoryImpl extends BaseRepository implements StaffRepository {
	
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Staffs> ListAllStaffs() {
		return this.getCurrentSession().createQuery("from Staffs").list();
	}

	@Override
	public boolean insertStaffs(Staffs staffs) {
		super.insert(staffs);
		return true;
	}

	@Override
	public boolean deleteStaffs(String id) {
		Session session = this.getCurrentSession();
		Staffs staffs = session.get(Staffs.class, id);
		session.delete(staffs);
		return true;
	}

	@Override
	public boolean editStaffs(Staffs staffs) {
		super.update(staffs);
		return true;
	}

	@Override
	public Staffs getStaffsId(String id) {
		return this.getCurrentSession().get(Staffs.class, id);
	}

	@SuppressWarnings("unchecked")
	@Override
	public boolean checkId(String id) {
		List<Staffs> list = null;
		String sql = "from Staffs where id = '" + id + "' ";
		Query query = this.getCurrentSession().createQuery(sql);
		list = query.list();
		if (list.size() > 0) {
			return true;
		}
		return false;
	}

}

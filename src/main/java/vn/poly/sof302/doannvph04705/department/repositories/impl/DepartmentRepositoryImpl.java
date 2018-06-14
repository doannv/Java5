package vn.poly.sof302.doannvph04705.department.repositories.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import vn.poly.sof302.doannvph04705.common.bases.BaseRepository;
import vn.poly.sof302.doannvph04705.common.entities.Departs;
import vn.poly.sof302.doannvph04705.department.repositories.DepartmentRepository;

@Repository
public class DepartmentRepositoryImpl extends BaseRepository implements DepartmentRepository {

	@SuppressWarnings("unchecked")
	@Override
	public List<Departs> ListAllDeparts(int offset, int limit) {
		return this.getCurrentSession().createQuery("From Departs").list();
	}

	@Override
	public boolean insertDeparts(Departs departs) {
		super.insert(departs);
		return true;
	}

	@Override
	public boolean deleteDeparts(String id) {
		Session session = this.getCurrentSession();
		Departs departs = session.get(Departs.class, id);
		session.delete(departs);
		return true;
	}

	@Override
	public boolean editDeparts(Departs departs) {
		super.update(departs);
		return true;
	}

	@Override
	public Departs getDepartId(String id) {
		return this.getCurrentSession().get(Departs.class, id);
	}

	@SuppressWarnings("unchecked")
	@Override
	public boolean checkId(String id) {
		List<Departs> list = null;
		String sql = "from Departs where id = '" + id + "' ";
		Query query = this.getCurrentSession().createQuery(sql);
		list = query.list();
		if (list.size() > 0) {
			return true;
		}
		return false;
	}

}

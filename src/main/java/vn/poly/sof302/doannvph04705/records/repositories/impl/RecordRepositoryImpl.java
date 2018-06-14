package vn.poly.sof302.doannvph04705.records.repositories.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import vn.poly.sof302.doannvph04705.common.bases.BaseRepository;
import vn.poly.sof302.doannvph04705.common.entities.Departs;
import vn.poly.sof302.doannvph04705.common.entities.Records;
import vn.poly.sof302.doannvph04705.records.repositories.RecordRepository;

@Repository
public class RecordRepositoryImpl extends BaseRepository implements RecordRepository {

	@SuppressWarnings("unchecked")
	@Override
	public List<Records> ListAllRecords() {
		return this.getCurrentSession().createQuery("From Records").list();
	}

	@Override
	public boolean insertRecords(Records records) {
		super.insert(records);
		return true;
	}

	@Override
	public boolean deleteRecords(String id) {
		Session session = this.getCurrentSession();
		Records records = session.get(Records.class, id);
		session.delete(records);
		return true;
	}

	@Override
	public boolean editRecords(Records records) {
		super.update(records);
		return true;
	}

	@Override
	public Records getRecordsId(int id) {
		return this.getCurrentSession().get(Records.class, id);
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

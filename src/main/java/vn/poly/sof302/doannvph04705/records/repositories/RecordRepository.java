package vn.poly.sof302.doannvph04705.records.repositories;

import java.util.List;

import vn.poly.sof302.doannvph04705.common.entities.Records;

public interface RecordRepository {

	public List<Records> ListAllRecords();

	public boolean insertRecords(Records records);

	public boolean deleteRecords(String id);

	public boolean editRecords(Records records);

	public Records getRecordsId(int id);

	public boolean checkId(String id);
}

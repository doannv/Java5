package vn.poly.sof302.doannvph04705.records.service;

import java.util.List;

import vn.poly.sof302.doannvph04705.common.bases.BaseServiceInterface;
import vn.poly.sof302.doannvph04705.records.dto.RecordDto;

public interface RecordService extends BaseServiceInterface {

	public List<RecordDto> list();

	public boolean checkId(String id);

	public boolean insertRecords(RecordDto records);

	public boolean deleteRecords(String id);

	public boolean editRecords(RecordDto records);

	public RecordDto getDepartId(int id);
}

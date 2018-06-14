package vn.poly.sof302.doannvph04705.records.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vn.poly.sof302.doannvph04705.common.bases.BaseService;
import vn.poly.sof302.doannvph04705.common.entities.Records;
import vn.poly.sof302.doannvph04705.common.utils.DataTransformUtil;
import vn.poly.sof302.doannvph04705.records.dto.RecordDto;
import vn.poly.sof302.doannvph04705.records.repositories.RecordRepository;
import vn.poly.sof302.doannvph04705.records.service.RecordService;

@Service
public class RecordServiceImpl extends BaseService implements RecordService {

	@Autowired
	RecordRepository recordsRepository;

	@Override
	public boolean insertRecords(RecordDto recordsDto) {
		Records entity = (Records) DataTransformUtil.transform(recordsDto, Records.class);
		entity.setDate(new Date());
		return recordsRepository.insertRecords(entity);
	}

	@Override
	public boolean editRecords(RecordDto recordsDto) {
		Records entity = recordsRepository.getRecordsId(recordsDto.getId());
		entity.setId(recordsDto.getId());
		entity.setReason(recordsDto.getReason());
		entity.setType(recordsDto.getType());
		entity.setStaff(recordsDto.getStaff());
		return recordsRepository.editRecords(entity);
	}

	@Override
	public RecordDto getDepartId(int id) {
		Records records = recordsRepository.getRecordsId(id);
		return (RecordDto) DataTransformUtil.transform(records, RecordDto.class);
	}

	@Override
	public List<RecordDto> list() {
		// Calculating paging
		// TODO

		// Get list records
		List<Records> recordsList = recordsRepository.ListAllRecords();

		// Check record list
		if (CollectionUtils.isEmpty(recordsList)) {
			return null;
		}

		// Cast to department dto
		List<RecordDto> recordsDtoList = new ArrayList<>();
		for (Records records : recordsList) {
			recordsDtoList.add((RecordDto) DataTransformUtil.transform(records, RecordDto.class));
		}

		return recordsDtoList;
	}

	@Override
	public boolean checkId(String id) {

		return recordsRepository.checkId(id);
	}

	@Override
	public boolean deleteRecords(String id) {
		return recordsRepository.deleteRecords(id);
	}

}
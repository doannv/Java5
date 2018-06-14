package vn.poly.sof302.doannvph04705.staffs.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vn.poly.sof302.doannvph04705.common.bases.BaseService;
import vn.poly.sof302.doannvph04705.common.entities.Staffs;
import vn.poly.sof302.doannvph04705.common.utils.DataTransformUtil;
import vn.poly.sof302.doannvph04705.staffs.dto.StaffDto;
import vn.poly.sof302.doannvph04705.staffs.repositories.StaffRepository;
import vn.poly.sof302.doannvph04705.staffs.service.StaffService;

@Service
public class StaffServiceImpl extends BaseService implements StaffService {
	@Autowired
	private StaffRepository staffsRepository;


	@Override
	public boolean deleteStaffs(String id) {
		return staffsRepository.deleteStaffs(id);
	}

	@Override
	public boolean checkId(String id) {
		return staffsRepository.checkId(id);
	}

	@Override
	public List<StaffDto> ListAllStaffs() {
		// Calculating paging
		// TODO

		// Get list records
		List<Staffs> staffsList = staffsRepository.ListAllStaffs();

		// Check record list
		if (CollectionUtils.isEmpty(staffsList)) {
			return null;
		}

		// Cast to staffs dto
		List<StaffDto> staffsDtoList = new ArrayList<>();
		for (Staffs staffs : staffsList) {
			staffsDtoList.add((StaffDto) DataTransformUtil.transform(staffs, StaffDto.class));
		}

		return staffsDtoList;
	}

	@Override
	public boolean editStaffs(StaffDto staffsDto) {
		Staffs entity = staffsRepository.getStaffsId(staffsDto.getId());
		entity.setId(staffsDto.getId());
		entity.setName(staffsDto.getName());
		entity.setGender(staffsDto.getGender()); 
		entity.setBirthday(new Date());
		entity.setPhoto(staffsDto.getPhoto());
		entity.setPhone(staffsDto.getPhone());
		entity.setEmail(staffsDto.getEmail());
		entity.setSalary(staffsDto.getSalary());
		entity.setNotes(staffsDto.getNotes());
		entity.setDepart(staffsDto.getDepart());
		return staffsRepository.editStaffs(entity);
	}

	@Override
	public StaffDto getStaffsId(String id) {
		Staffs stafffs = staffsRepository.getStaffsId(id);
		return (StaffDto) DataTransformUtil.transform(stafffs, StaffDto.class);
	}

	@Override
	public boolean createStaffs(StaffDto staffsdto) {
		Staffs entity = (Staffs) DataTransformUtil.transform(staffsdto, Staffs.class);		
		return staffsRepository.insertStaffs(entity);
	}

}

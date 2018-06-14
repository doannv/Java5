package vn.poly.sof302.doannvph04705.department.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.apache.commons.collections.CollectionUtils;

import vn.poly.sof302.doannvph04705.common.bases.BaseService;
import vn.poly.sof302.doannvph04705.common.entities.Departs;
import vn.poly.sof302.doannvph04705.common.utils.DataTransformUtil;
import vn.poly.sof302.doannvph04705.department.dto.DepartmentDto;
import vn.poly.sof302.doannvph04705.department.repositories.DepartmentRepository;
import vn.poly.sof302.doannvph04705.department.service.DepartmentService;

@Service
public class DepartmentServiceImpl extends BaseService implements DepartmentService {

	@Autowired
	DepartmentRepository departmentRepository;

	@Override
	public boolean checkId(String id) {
		return departmentRepository.checkId(id);
	}

	@Override
	public boolean deleteDeparts(String id) {
		return departmentRepository.deleteDeparts(id);
	}

	@Override
	public boolean insertDeparts(DepartmentDto departmentDto) {
		Departs entity = (Departs) DataTransformUtil.transform(departmentDto, Departs.class);
		return departmentRepository.insertDeparts(entity);
	}

	@Override
	public boolean editDeparts(DepartmentDto departs) {
		Departs entity = departmentRepository.getDepartId(departs.getId());
		entity.setId(departs.getId());
		entity.setName(departs.getName());
		return departmentRepository.editDeparts(entity);
	}

	@Override
	public DepartmentDto getDepartId(String id) {
		Departs department = departmentRepository.getDepartId(id);

		return (DepartmentDto) DataTransformUtil.transform(department, DepartmentDto.class);
	}

	@Override
	public List<DepartmentDto> list() {
		// Calculating paging
		// TODO

		// Get list department
		List<Departs> departmentList = departmentRepository.ListAllDeparts(1, 10);

		// Check deparment list
		if (CollectionUtils.isEmpty(departmentList)) {
			return null;
		}

		// Cast to department dto
		List<DepartmentDto> departmentDtoList = new ArrayList<>();
		for (Departs department : departmentList) {
			departmentDtoList.add((DepartmentDto) DataTransformUtil.transform(department, DepartmentDto.class));
		}

		return departmentDtoList;
	}

}
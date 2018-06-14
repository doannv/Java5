package vn.poly.sof302.doannvph04705.users.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vn.poly.sof302.doannvph04705.common.bases.BaseService;
import vn.poly.sof302.doannvph04705.common.entities.Users;
import vn.poly.sof302.doannvph04705.users.repositories.UsersRepository;
import vn.poly.sof302.doannvph04705.users.service.UsersService;

@Service
public class UsersServiceImpl extends BaseService implements UsersService {
	@Autowired
	UsersRepository userRepository;

	@Override
	public List<Users> listUsers() {
		return userRepository.listUsers();
	}

	@Override
	public boolean checkAuth(String username, String password) {
		return userRepository.checkAuth(username, password);
	}

}

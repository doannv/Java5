package vn.poly.sof302.doannvph04705.users.repositories.impl;

import java.util.List;


import org.springframework.stereotype.Repository;

import vn.poly.sof302.doannvph04705.common.bases.BaseRepository;
import vn.poly.sof302.doannvph04705.common.entities.Users;
import vn.poly.sof302.doannvph04705.users.repositories.UsersRepository;

@Repository
public class UsersRepositoryImpl extends BaseRepository implements UsersRepository {

	@SuppressWarnings("unchecked")
	@Override
	public List<Users> listUsers() {
		return this.getCurrentSession().createQuery("From Users").list();
	}

	@SuppressWarnings("unchecked")
	@Override
	public boolean checkAuth(String username, String password) {
		String sql = "FROM Users WHERE username = '" + username + "' AND password = '" + password + "'";
		List<Users> list = this.getCurrentSession().createQuery(sql).list();
		if (list.size() > 0) {
			return true;
		}
		return false;
	}

}

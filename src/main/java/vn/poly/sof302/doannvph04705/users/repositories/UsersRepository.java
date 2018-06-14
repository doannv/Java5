package vn.poly.sof302.doannvph04705.users.repositories;

import java.util.List;

import vn.poly.sof302.doannvph04705.common.entities.*;

public interface UsersRepository {
	public List<Users> listUsers();

	public boolean checkAuth(String username, String password);
}

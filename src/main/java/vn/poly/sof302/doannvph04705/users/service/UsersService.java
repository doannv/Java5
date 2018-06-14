package vn.poly.sof302.doannvph04705.users.service;

import java.util.List;

import vn.poly.sof302.doannvph04705.common.bases.BaseServiceInterface;
import vn.poly.sof302.doannvph04705.common.entities.Users;

public interface UsersService extends BaseServiceInterface {

	public List<Users> listUsers();

	public boolean checkAuth(String username, String password);
}

package vn.poly.sof302.doannvph04705.common.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotBlank;

@Entity
@Table (name="Users")
public class Users {
	@Id
	@NotBlank(message="Vui lòng nhập tài khoản !")
	private String Username;
	@NotBlank(message="Vui lòng nhập mật khẩu !")
	private String Password;
	@NotBlank(message="Vui lòng nhập họ tên !")
	private String Fullname;

	public Users() {
		super();
	}

	public Users(String username, String password, String fullname) {
		super();
		Username = username;
		Password = password;
		Fullname = fullname;
	}

	public String getUsername() {
		return Username;
	}

	public void setUsername(String username) {
		Username = username;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public String getFullname() {
		return Fullname;
	}

	public void setFullname(String fullname) {
		Fullname = fullname;
	}

}

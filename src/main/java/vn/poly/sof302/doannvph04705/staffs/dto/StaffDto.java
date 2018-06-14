package vn.poly.sof302.doannvph04705.staffs.dto;

import java.util.Date;

import vn.poly.sof302.doannvph04705.common.entities.Departs;

public class StaffDto {

	private String id;
	private String Name;
	private Boolean Gender;
	private Date Birthday;
	private String Photo;
	private String Email;
	private int Phone;
	private float Salary;
	private String Notes;
	private Departs Depart;

	public StaffDto() {
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public Boolean getGender() {
		return Gender;
	}

	public void setGender(Boolean gender) {
		Gender = gender;
	}

	public Date getBirthday() {
		return Birthday;
	}

	public void setBirthday(Date birthday) {
		Birthday = birthday;
	}

	public String getPhoto() {
		return Photo;
	}

	public void setPhoto(String photo) {
		Photo = photo;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public int getPhone() {
		return Phone;
	}

	public void setPhone(int phone) {
		Phone = phone;
	}

	public float getSalary() {
		return Salary;
	}

	public void setSalary(float salary) {
		Salary = salary;
	}

	public String getNotes() {
		return Notes;
	}

	public void setNotes(String notes) {
		Notes = notes;
	}

	public Departs getDepart() {
		return Depart;
	}

	public void setDepart(Departs depart) {
		Depart = depart;
	}

}

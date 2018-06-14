package vn.poly.sof302.doannvph04705.common.entities;

import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "Staffs")
public class Staffs {
	@Id
	private String id;
	private String Name;
	private Boolean Gender;
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "dd-MM-yyyy")
	private Date Birthday;
	private String Photo;
	private String Email;
	private int Phone;
	private float Salary;
	private String Notes;
	@ManyToOne
	@JoinColumn(name = "DepartId")
	private Departs Depart;

	@OneToMany(mappedBy = "staff", fetch = FetchType.EAGER)
	private Collection<Records> record;

	public Collection<Records> getRecord() {
		return record;
	}

	public void setRecord(Collection<Records> record) {
		this.record = record;
	}

	public Staffs() {
		super();
	}

	public Staffs(String id, String name, Boolean gender, Date birthday, String photo, String email, int phone,
			float salary, String notes, Departs depart) {
		super();
		this.id = id;
		Name = name;
		Gender = gender;
		Birthday = birthday;
		Photo = photo;
		Email = email;
		Phone = phone;
		Salary = salary;
		Notes = notes;
		Depart = depart;
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

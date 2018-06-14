package vn.poly.sof302.doannvph04705.common.entities;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "Departs")
public class Departs {
	@Id
	private String id;
	
	private String Name;
	@OneToMany(mappedBy = "Depart", fetch = FetchType.EAGER)
	private Collection<Staffs> staff;

	public Departs() {
		super();
	}

	public Departs(String id, String name) {
		super();
		this.id = id;
		Name = name;
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

	public Collection<Staffs> getStaff() {
		return staff;
	}

	public void setStaff(Collection<Staffs> staff) {
		this.staff = staff;
	}

}

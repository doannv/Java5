package vn.poly.sof302.doannvph04705.records.form;


import java.util.Date;

import vn.poly.sof302.doannvph04705.common.entities.Staffs;

public class RecordCreateForm {

	private int id;
	private Boolean Type;
	private String Reason;
	private Date date;
	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	private Staffs staff;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Boolean getType() {
		return Type;
	}

	public void setType(Boolean type) {
		Type = type;
	}

	public String getReason() {
		return Reason;
	}

	public void setReason(String reason) {
		Reason = reason;
	}

	public Staffs getStaff() {
		return staff;
	}

	public void setStaff(Staffs staff) {
		this.staff = staff;
	}

}

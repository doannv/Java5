package vn.poly.sof302.doannvph04705.records.dto;


import vn.poly.sof302.doannvph04705.common.entities.Staffs;

public class RecordDto {

	private int id;
	private Boolean Type;
	private String Reason;
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

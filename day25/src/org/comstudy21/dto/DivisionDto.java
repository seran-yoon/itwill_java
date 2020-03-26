package org.comstudy21.dto;

public class DivisionDto {

	private int dno;
	private String dname;
	private String phone;
	private String position;
	
	public DivisionDto() {
		
	}

	public DivisionDto(int dno, String dname, String phone, String position) {
		super();
		this.dno = dno;
		this.dname = dname;
		this.phone = phone;
		this.position = position;
	}

	public int getDno() {
		return dno;
	}

	public void setDno(int dno) {
		this.dno = dno;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	@Override
	public String toString() {
		return "[" + dno + ", " + dname + ", " + phone + ", " + position + "]";
	}
	
	
	
}

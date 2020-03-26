package org.comstudy21.phonebook.model;

public class DTO {
	
	//멤버필드 선언
	private int idx;
	private String name;
	private String phone;
	
	//생성자
	public DTO() {
	
	}

	public DTO(int idx, String name, String phone) {
		super();
		this.idx = idx;
		this.name = name;
		this.phone = phone;
	}

	//메소드
	public int getIdx() {
		return idx;
	}

	public void setIdx(int idx) {
		this.idx = idx;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	//오버라이딩
	@Override
	public String toString() {
		return "[" + idx + ", " + name + ", " + phone + "]";
	}

}

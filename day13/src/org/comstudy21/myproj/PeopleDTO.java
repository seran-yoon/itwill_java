package org.comstudy21.myproj;

public class PeopleDTO {
	private int idx;
	private String name;
	private String email;
	
	public PeopleDTO() {
		this(0, "", "");
	}

	public PeopleDTO(int idx, String name, String email) {
		this.idx = idx;
		this.name = name;
		this.email = email;
	}

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "[" + idx + ", " + name + ", " + email + "]";
	}
}

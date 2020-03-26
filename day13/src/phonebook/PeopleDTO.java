package phonebook;

public class PeopleDTO {
	//식별자, 성명, 이메일
	
	//멤버 필드
	private int idx;
	private String name;
	private String email;
	
	//생성자
	public PeopleDTO(){
		this(0,"","");
	}

	public PeopleDTO(int idx, String name, String email) {
		this.idx=idx;
		this.name=name;
		this.email=email;
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

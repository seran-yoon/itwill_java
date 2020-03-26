package org.comstudy21.dto;

public class SaramDto {
	
	private String id;
	private String name;
	private int age;
	
	public SaramDto() {
		
	}

	public SaramDto(String id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "[" + id + ", " + name + ", " + age + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		
		SaramDto dto = null;
		
		if(obj instanceof SaramDto){
			dto = (SaramDto)obj;
			if(name.equals(dto.getId())){
				return true;
			}
		}
		
		return false;
	
	}
	
}

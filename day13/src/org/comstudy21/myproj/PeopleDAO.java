package org.comstudy21.myproj;

public class PeopleDAO {
	public static final int MAX = 100;
	PeopleDTO[] pArr = new PeopleDTO[MAX];
	private int top = 0;
	private int sequence = 1; // 고유번호 자동 생성
	static {
		// 초기화 블럭 생성자 보다 먼저 실행된다.
	}
	{
		pArr[top++] = new PeopleDTO(sequence++, "kim", "kim@aaa.com");
		pArr[top++] = new PeopleDTO(sequence++, "lee", "lee@aaa.com");
		pArr[top++] = new PeopleDTO(sequence++, "park", "park@aaa.com");
		pArr[top++] = new PeopleDTO(sequence++, "lee", "lee2@aaa.com");
		pArr[top++] = new PeopleDTO(sequence++, "kang", "kang@aaa.com");
	}
	
	public void insert(PeopleDTO dto) {
		System.out.println("### PeopleDAO 클래스의 insert 함수");
		if(top >= MAX) {
			System.out.println("### 더이상 입력 불가능!");
			return;
		}
		//System.out.println("### " + dto);
		dto.setIdx(sequence++);
		pArr[top++] = dto;
	}

	public PeopleDTO[] selectAll() {
		PeopleDTO[] newArr = null;
		System.out.println("### PeopleDAO 클래스의 selectAll 함수");
		if(top <= 0) {
			System.out.println("### 출력 할 내용이 없습니다!");
			return null;
		}
		
		newArr = new PeopleDTO[top];
		for(int i=0; i<top; i++) {
			newArr[i] = new PeopleDTO();
			newArr[i].setIdx( pArr[i].getIdx() );
			newArr[i].setName( pArr[i].getName() );
			newArr[i].setEmail( pArr[i].getEmail() );
		}
		
		return newArr;
	}

	public PeopleDTO[] select(PeopleDTO dto) {
		PeopleDTO[] arr1 = new PeopleDTO[top];
		PeopleDTO[] arr2 = null;
		int size = 0;
		String sName = dto.getName();
		
		System.out.println("### PeopleDAO 클래스의 select 함수");
		System.out.println("### sName : " + sName);
		
		for(int i=0; i<top; i++) {
			if(sName.equals(pArr[i].getName())) {
				arr1[size] = new PeopleDTO();
				arr1[size].setIdx(pArr[i].getIdx());
				arr1[size].setName(pArr[i].getName());
				arr1[size].setEmail(pArr[i].getEmail());
				size++;
			}
		}
		
		if(size <= 0) {
			System.out.println("### 검색 결과가 없습니다!");
			return null;
		}
		
		arr2 = new PeopleDTO[size];
		for(int i=0; i<arr2.length; i++) {
			arr2[i] = arr1[i];
		}
		
		return arr2;
	}

	public PeopleDTO[] select(String name) {
		// TODO Auto-generated method stub
		PeopleDTO dto = new PeopleDTO(0, name, null);
		return select(dto);
	}

	public void modify(PeopleDTO people) {
		for(int i=0; i<top; i++) {
			if(people.getIdx() == pArr[i].getIdx()) {
				pArr[i] = people;
				System.out.println("### 수정 되었습니다.");
				return;
			}
		}
		System.out.println("### 수정 되지 않았다!");
	}

	public void delete(PeopleDTO people) {
		for(int i=0; i<top; i++) {
			if(people.getIdx() == pArr[i].getIdx()) {
				for(int j=i; j<top-1; j++) {
					pArr[j] = pArr[j+1];
				}
				System.out.println("### 삭제 완료!");
				top--;
				break;
			}
		}
	}
	
}


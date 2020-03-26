package org.comstudy21.phonebook.model;

public class DAO { //DB부분
	
	static final int MAX = 100;
	private DTO[] list = new DTO[MAX];
	private static int squence = 1; //idx가 된다
	private int top = 0;
	
	{ //임의 DB
		list[top++] = new DTO(squence++, "KIM", "010-0000-0000");
		list[top++] = new DTO(squence++, "LEE", "010-1111-1111");
		list[top++] = new DTO(squence++, "PARK", "010-2222-2222");
		list[top++] = new DTO(squence++, "KANG", "010-3333-3333");
	}
	
	//입력부분
	public void inputData(DTO dto){

		if(top>=list.length){
			System.out.println("### 더이상 입력할 수 없습니다! ###");
			return;
		}
		
		dto.setIdx(squence++);
		list[top++] = dto;
	}
	
	//출력부분
	public DTO[] outputData(){
		
		if(top<=0){
			System.out.println("### 저장된 데이터가 없습니다! ###");
			return null;
		}
		
		DTO[] dtoList = new DTO[top];
		
		for(int i=0;i<dtoList.length;i++){
			dtoList[i] = new DTO();
			dtoList[i].setIdx(list[i].getIdx());
			dtoList[i].setName(list[i].getName());
			dtoList[i].setPhone(list[i].getPhone());
		}
		
		return dtoList;
	}
	
	//검색부분
	public DTO[] searchData(DTO dto){
		DTO[] dtoList1 = new DTO[top];
		
		int cnt = 0;
		String sName = dto.getName();
		
		for(int i=0;i<top;i++){
			if(sName.equals(list[i].getName())){ //위에서 String sName = dto.getName(); 선언 안하고 if문 조건식에서 if((dto.getName()).equals(list[i].getName()))라고 써도 됨
				dtoList1[cnt] = new DTO();
				
				dtoList1[cnt].setIdx(list[i].getIdx());
				dtoList1[cnt].setName(list[i].getName());
				dtoList1[cnt].setPhone(list[i].getPhone());
				
				cnt++;
			}
		}
		
		if(cnt==0){
			System.out.println("### 검색 결과가 없습니다 ###");
			return null;
		}
		
		DTO[] dtoList2 = new DTO[cnt];
		
		for(int i=0;i<dtoList2.length;i++){ //arr1의 값을 arr2에 복사
			dtoList2[i] = dtoList1[i];
		}
				
		return dtoList2;
		
	}
	
	//수정부분
	public void modifyData(DTO dto){
		for(int i=0; i<top; i++) {
			if((dto.getIdx()) == list[i].getIdx()) {
				list[i] = dto;
				System.out.println("### 수정 되었습니다 ###");
				return;
			}
		}
		System.out.println("### 수정 되지 않았습니다! ###");
	}
	
	//삭제부분
	public void deleteData(DTO dto){
		for(int i=0; i<top; i++) {
			if((dto.getIdx()) == list[i].getIdx()) {
				for(int j=i; j<top-1; j++) {
					list[j] = list[j+1];
				}
				System.out.println("### 삭제 완료! ###");
				top--;
				return;
			}
		}
		
		System.out.println("### 삭제할 내용이 없습니다 ###");
	}
	
	
	
	
	
}

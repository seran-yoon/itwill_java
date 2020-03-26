package phonebook;

import java.util.Scanner;

public class PeopleDAO {
	Scanner sc = new Scanner(System.in);
	public static final int MAX = 100;	
	PeopleDTO[] pArr = new PeopleDTO[MAX];
	private int top = 0; //유동적
	private int sequence = 1; //고유번호 자동 생성, 중복된 값이 안들어가게 하기 위함
	
	static{
		//스태틱 초기화
		//초기화 블럭 생성자보다 먼저 실행된다
	}
	//기본 데이터를 미리 만들어놔서 테스트할때 쉬우려고 임의의 데이터 작성
	//인스턴스 초기화
	{ 
		pArr[top++] = new PeopleDTO(sequence++, "kim", "kim@aaa.com");
		pArr[top++] = new PeopleDTO(sequence++, "lee", "lee@aaa.com");
		pArr[top++] = new PeopleDTO(sequence++, "park", "park@aaa.com");
		pArr[top++] = new PeopleDTO(sequence++, "lee", "lee2@aaa.com");
		pArr[top++] = new PeopleDTO(sequence++, "yoon", "yoon@aaa.com");
		
	} 
	
	//입력 부분
	public void inputData(PeopleDTO dto) {
		if(top >= MAX) {
			System.out.println("### 더이상 입력 불가능이 불가능 합니다 ###");
			return;
		}
		
		dto.setIdx(sequence++);
		pArr[top++] = dto;
	}
	
	//출력 부분
	public PeopleDTO[] outputData() {
		PeopleDTO[] arr = new PeopleDTO[top]; //pArr가 참조값이 달라지면 안되니까 복사본을 만든것

		if(top <= 0){
			System.out.println("### 출력할 내용이 없습니다 ###");
			return null;
		}
				
		for(int i=0;i<top;i++){
			arr[i] = new PeopleDTO(); //복사본 배열을 만들었으니 참조값을 원본과 동일하게 새로 만들어줘야 완벽하게 분리됨
			arr[i].setIdx(pArr[i].getIdx());
			arr[i].setName(pArr[i].getName());
			arr[i].setEmail(pArr[i].getEmail());
		}
		return arr;
	}
	
	//검색 부분
	public PeopleDTO[] searchData(PeopleDTO dto) {
		PeopleDTO[] arr1 = new PeopleDTO[top]; //pArr가 참조값이 달라지면 안되니까 복사본을 만든것
		PeopleDTO[] arr2 = null;
		
		int size = 0;
		String sName = dto.getName();
		
		for(int i=0;i<top;i++){
			if(sName.equals(pArr[i].getName())){
				arr1[size] = new PeopleDTO();
				
				arr1[size].setIdx(pArr[i].getIdx());
				arr1[size].setName(pArr[i].getName());
				arr1[size].setEmail(pArr[i].getEmail());
				
				size++;
			}
		}
		
		if(size==0){
			System.out.println("### 검색 결과가 없습니다 ###");
			return null;
		}
		
		arr2 = new PeopleDTO[size];
		
		for(int i=0;i<arr2.length;i++){ //arr1의 값을 arr2에 복사
			arr2[i] = arr1[i];
		}
				
		return arr2;
	}

	//수정 부분
	public void modifydata(int num) {
		boolean flag=true;
		int number = 0;
		
		for(int i=0;i<top;i++){
			if(num==pArr[i].getIdx()){
				System.out.println("수정 할 목록의 번호를 선택해주세요 (1.이름 2.이메일)");
				System.out.print("Modify Choice >>> ");
				number = sc.nextInt();
				
				if(number == 1){
					System.out.print("수정할 이름 >>> ");
					pArr[i].setName(sc.next());
				} else if(number == 2){
					System.out.print("수정할 이메일 >>> ");
					pArr[i].setEmail(sc.next());
				} else{
					System.out.println("### 잘못된 선택입니다. 다시 입력해주세요 ###");
					return;
				}
				System.out.println("* 수정이 완료되었습니다 *");
				flag = false;
				break;
			}
		}
		
		if(flag){
			System.out.println("### 입력하신 번호의 주소록이 없습니다 ###");
			return;
		}
	}

	//삭제 부분
		public void deleteData(int num) {
			boolean flag=true;
			
			for(int i=0;i<top;i++){
				if(num==pArr[i].getIdx()){		
					for(int j=i;j<top;j++){
						pArr[j]=pArr[j+1];
					}
					top--;
					flag = false;
					System.out.println("* 삭제가 완료되었습니다 *");
					break;
				}
			}
			
			if(flag){
				System.out.println("### 입력하신 번호의 주소록이 없습니다 ###");
				return;
			}
		}

}


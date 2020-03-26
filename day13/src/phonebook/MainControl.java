package phonebook;

import java.util.Scanner;

public class MainControl {
	public static final Scanner sc = new Scanner(System.in);
	public static final PeopleDAO peopleDao = new PeopleDAO(); //DAO 클래스의 참조 변수를 만들어줌 안바뀔꺼라 여기다가

	//생성자
	public MainControl(){
		while(true) {
			start(); // 시작하는 함수 하나 새로 만듬
			System.out.println(); //줄바꿈
		}
	}
	
	//start 메소드(함수) 생성
	private void start(){
		int no = menu("INPUT","OUTPUT","SEARCH","MODIFY","DELETE","SORT","END");
		
		switch(no){
		case 1 : input(); break;
		case 2 : output(); break;
		case 3 : search(); break;
		case 4 : modify(); break;
		case 5 : delete(); break;
		case 6 : sort(); break;
		case 7 : end(); break;
		default : System.out.println("### 해당 메뉴가 없습니다! ###");
		}
	}
	
	//함수 생성
	//입력 함수
	private void input() {
		//로컬변수
		String name = null;
		String email = null;
		PeopleDTO dto = null;
//		PeopleDTO dto = new PeopleDTO(); //DTO클래스에서 참조하기 위한 참조변수 dto 선언, 객체 생성
		
		System.out.println("::: INPUT :::");
		//성명과 이메일을 입력받아서 DAO의 DTO객체로 전달한다
		System.out.print("성명 입력 >>> ");
		sc.nextLine();//버퍼비우기(정수를 입력받고 문자열 받는걸 쓰려면 한번 비워줘야 함)
		name = sc.nextLine();
		System.out.print("이메일 입력 >>> ");
		email = sc.nextLine();
		
//		dto.setIdx(0);
//		dto.setName(name);
//		dto.setEmail(email);
		
		dto = new PeopleDTO(0, name, email); //인스턴스화 해주며 값을 바로 넣음
		
		peopleDao.inputData(dto);
		
		System.out.println("* 정보를 입력하였습니다 *");
	}
	
	//출력 함수
	private void output() {
		//로컬변수
		PeopleDTO[] pArr = null;
		
		System.out.println("::: OUTPUT :::");
		//DAO객체에서 배열을 전달 받아서 출력한다
		pArr = peopleDao.outputData(); //DAO 클래스에서 리턴받은 값을 pArr에 담는다
		printArray(pArr); //printArry함수로 pArr값 넣고 출력해주기~
	}
	
	//printArray함수를 만든 이유!!!!!!! 같은 반복문을 출력과 검색에서 사용하기 때문에 함수로 만들어주고 호출하는 방식으로 사용
	private void printArray(PeopleDTO[] pArr){
		if(pArr == null){
			System.out.println("### 출력 할 내용이 없습니다 ###");
			return;
		}
		
		for(int i=0;i<pArr.length;i++){
			System.out.println((i+1)+" : "+pArr[i].toString());
		}
		
		System.out.println("* 출력이 완료되었습니다 *");
	}

	//검색 함수
	private void search() {
		//로컬변수
		PeopleDTO[] pArr = null; //출력 함수의 pArr 배열과 다른 애
		PeopleDTO dto = null; //입력 함수의 dto 변수와 다른 애
		String name = null; //이름을 입력받아서 검색
		
		System.out.println("::: SEARCH :::");
		//검색어(이름)를 입력받아서 DAO에서 검색한다
		//검색 결과를 돌려 받아서 화면에 출력한다
		System.out.print("검색 할 성명 입력 >>> ");
		sc.nextLine();
		name = sc.nextLine();
		
		dto = new PeopleDTO(0,name,null); //인스턴스화 해주며 값을 바로 넣음
		
		pArr = peopleDao.searchData(dto);
		printArray(pArr); //printArry함수로 pArr값 넣고 출력해주기~
	}

	//수정 함수
	private void modify() {
		//로컬변수
		int num = 0;

		System.out.println("::: MODIFY :::");
		//검색어(고유번호)를 입력받아서 DAO에서 검색한다
		//수정할 목록을 물어보고 수정하고자 하는 목록(이름/이메일)을 수정한다(출력은 안함)
		System.out.print("수정 할 주소록의 번호 입력 >>> ");
		num = sc.nextInt();

		peopleDao.modifydata(num);
}

	//삭제 함수
	private void delete() {
		//로컬변수
		int num = 0;
		
		System.out.println("::: DELETE :::");
		//검색어(고유번호)를 입력받아서 DAO에서 검색한다
		//해당 주소록을 삭제하고 주소록의 길이를 줄여준다
		System.out.print("삭제 할 주소록의 번호 입력 >>> ");
		num = sc.nextInt();
		
		peopleDao.deleteData(num);
	}

	//정렬 함수
	private void sort() {
		System.out.println("::: SORT :::");
		System.out.println("comming soon...!!");
	}

	//종료 함수
	private void end() {
		System.out.println("::: END :::");
		System.out.println("프로세스 종료!");
		System.exit(0); //종료
	}

	//menu 메소드(함수) 생성
	private int menu(String ... meueStr){
		int no=0;
		
		for(int i=0;i<meueStr.length;i++){
			System.out.print((i+1)+"."+meueStr[i]+" ");
		}
		System.out.println();
		System.out.print("Choice >>> ");
		no = sc.nextInt();
		
		return no;
	}
	
	public static void main(String[] args) {
		new MainControl();
	}

}

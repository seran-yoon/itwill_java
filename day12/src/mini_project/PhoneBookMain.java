package mini_project;

import java.util.Scanner;

//java bin : VO 또는 DTO 역할을 한다
class People { // 데이터를 저장하는 People class 생성
	// 성명 전화번호 이메일 폰번호
	private int idx; //등록 번호
	private String name; 
	private String email;
	private String phone;

	//생성자 선언
	public People() { //디폴트 생성자
		this(0, "", "", "");
	}

	public People(int idx, String name, String email, String phone) { //매개변수를 위한 생성자
		this.idx = idx;
		this.name = name;
		this.email = email;
		this.phone = phone;
	}

	//멤버 메소드 생성 (필드에 private을 써줬기 때문에 직접적인 참조가 안됨, Main에서 참조변수를 이용해 참조하기 위해 생성해줌)
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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	//출력형태를 리턴해줌
	@Override
	public String toString() { // 자동 실행 함수
		return "[" + idx + ", " + name + ", " + email + ", " + phone + "]";
	}
}// end of People class

//----------------------------------------------------------------------------------------------------------------------------------------

class PhoneBookManager { //화면 구현을 위한 PhoneBookManager class 생성

	public static final int Max = 100;
	private People[] phoneBook = new People[Max]; //People 클래스의 데이터를 담아두는 배열(배열 변수 phoneBook)을 생성  //원본 배열
	private int top = 0; //폰북 데이터의 갯수

	//객체 입력을 위한 메소드
	public void input(People p) { //People 클래스를 참조하는 참조변수 p를 선언
		if(top>=Max) {
			System.out.println("더이상 입력할 수 없습니다!");
			return; //끝내기
		} //만약 배열의 길이인 MAX를 넘게 입력하려고 하면 더이상 입력할 수 없게 안내메세지를 내보내고 그 값을 리턴값으로 반환
		phoneBook[top++] = p; //입력받는 P를 배열 phoneBook에 하나씩 넣음
	}

	//객체 출력을 위한 메소드
	public People[] output() { //리턴값이 배열이기 때문에 void 대신 배열의 형식을 써줌(People 클래스를 참조하는 배열)
		if(top==0) { //입력받은 데이터가 하나도 없는데 2.OUTPUT을 선택하면 뜨게하는 메세지
			System.out.println("내용이 없습니다!");
			return null; //리턴값을 null로 주고 끝내기 
		}	

		People[] peopleArr = new People[top]; //People 클래스의 데이터를 담아두는 배열(배열 변수 peopleArr)을 생성, 입력받은 데이터의 갯수만큼 배열 peopleArr의 길이를 정해줌  //phoneBook배열의 복사본 배열(입력받은 만큼의 길이만 만들어진 배열)

		for(int i=0;i<top;i++) { //배열안의 값을 출력
			peopleArr[i] = new People(); //people데이터를 참조할 peopleArr[i] 참조 변수 배열을 만듬
			peopleArr[i].setIdx(phoneBook[i].getIdx());
			peopleArr[i].setName(phoneBook[i].getName());
			peopleArr[i].setEmail(phoneBook[i].getEmail());
			peopleArr[i].setPhone(phoneBook[i].getPhone());

		}
		return peopleArr; //peopleArr 배열 값을 리턴
	}
	
	//객체 검색을 위한 메소드
	public void search(String searchName) {
		
		int searchname = 0;
		
		if(searchname==0){
			System.out.println("검색 결과가 없습니다!");
		}
		
		for(int i=0; i<top; i++) {
		   if(phoneBook[i].getName().equals(searchName)) {
		    System.out.println(phoneBook[i]);
		    searchname++;
		   }
		}
	}
	
	
}// end of PhoneBookManager class

//----------------------------------------------------------------------------------------------------------------------------------------

public class PhoneBookMain { //main class

	public static final Scanner sc = new Scanner(System.in);
	private static final PhoneBookManager manager = new PhoneBookManager(); //PhoneBookManager 클래스에 참조하는 참조변수 manager 선언

	private int menu() { //메뉴를 보여주고 그 중에 고르면 해당되는 번호의 조건문으로 이동하기 위함
		
		String menuStr = "1.INPUT 2.OUTPUT 3.SEARCH 4.MODIFY 5.DELETE 6.END";

		int no = 0;

		System.out.println(menuStr);
		System.out.print("Choice >>> ");
		no = sc.nextInt();

		return no;
	}

	public PhoneBookMain() {
		while(true) {
			switch (menu()) {
			case 1:
				System.out.println("::: INPUT :::");
				
				People people = new People(); //입력을 하여 데이터를  people 클래스에 저장해야 하기 때문에 People 클래스를 참조하는 참조변수 people을 선언
				
				System.out.print("Name >>> ");
				people.setName(sc.next()); //입력받은 name값은 people 클래스의 setName에 값이 저장되고, people 클래스에서 참조해서 값을 가져오는 것
				System.out.print("Email >>> ");
				people.setEmail(sc.next());
				System.out.print("Phone >>> ");
				people.setPhone(sc.next());
				
				manager.input(people); //PhoneBookManager 클래스의  input(객체 입력을 위해 메소드 생성한 것)으로 방금 입력받은 데이터를 people 클래스에 저장
				
				break;
			case 2:
				System.out.println("::: OUTPUT :::");
				
				People[] arr = manager.output(); //PhoneBookManager 클래스의 output(객체 출력을 위해 메소드 생성한 것)에서 리턴받은 값을 배열 arr(참조받기 위한 참조 변수 배열 arr)로 넣어줌 
				
				for(People p1 : arr) { //for-each문 //반복힐때마다 People 클래스의 참조변수 p는 arr[0],arr[1],arr[2]... 으로 설정
					System.out.println(p1); //p1의 값(arr[i])이 출력 (p1도 새로 변수를 선언해준 것)
				}
				/*
				 for(int i=0;i<arr.length;i++){
				 	System.out.println(arr[i]);
				 }
				 */
				
				break;
			case 3:
				System.out.println("::: SEARCH :::");
				
				System.out.println("Search Name >>> "); //검색할 이름을 입력받음
				
				
				break;
			case 4:
				System.out.println("::: MODIFY :::");
				
				
				break;
			case 5:
				System.out.println("::: DELETE :::");
				
				
				break;
			case 6:
				System.out.println("::: END :::");
				break;
			default:
				System.out.println("해당 기능은 없습니다!");
			}
		}
	}

	public static void main(String[] args) {
		new PhoneBookMain(); //클래스 PhoneBookMain을 인스턴스 함
	}
}

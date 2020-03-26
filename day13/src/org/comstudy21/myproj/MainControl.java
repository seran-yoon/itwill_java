package org.comstudy21.myproj;

import static java.lang.System.out;

import java.util.Scanner;

public class MainControl {
	public static final Scanner scan = new Scanner(System.in);
	private static final PeopleDAO peopleDao = new PeopleDAO();
	
	public MainControl() {
		while(true) {
			start();
			System.out.println();
		}
	}

	private void start() {
		int no = menu("INPUT","OUTPUT","SEARCH","MODIFY","DELETE","SORT","END");
		switch(no) {
		case 1 : input(); break;
		case 2 : output(); break;
		case 3 : search(); break;
		case 4 : modify(); break;
		case 5 : delete(); break;
		case 6 : sort(); break;
		case 7 : end(); break;
		default : System.out.println("해당 메뉴가 없습니다!");
		}
	}
	
	private void input() {
		String name = null;
		String email = null;
		PeopleDTO dto = null;
		
		System.out.println("::: INPUT :::");
		// 성명과 이메일을 입력 받아서 DAO에 DTO객체로 전달한다.
		out.print("성명 입력 >>> ");
		scan.nextLine();
		name = scan.nextLine();
		out.print("이메일 입력 >>> ");
		email = scan.nextLine();
		
		//System.out.println(name + ", " + email);
		dto = new PeopleDTO(0, name, email);
		peopleDao.insert(dto);
		
		out.println("정보를 입력 하였습니다.");
	}

	private void output() {
		PeopleDTO[] pArr = null;
		
		System.out.println("::: OUTPUT :::");
		// DAO객체 배열을 전달 받아서 출력한다.
		
		pArr = peopleDao.selectAll();
		printArray(pArr);
	}
	
	private void printArray(PeopleDTO[] pArr) {
		if(pArr == null) {
			System.out.println("안내 : 출력 할 내용이 없습니다!");
			return;
		}
		
		for(int i=0; i<pArr.length; i++) {
			System.out.println(i + " : " + pArr[i].toString());
		}
	}
	
	private PeopleDTO[] searchList() {
		PeopleDTO[] pArr = null;
		PeopleDTO dto = null;
		String name = null;
		
		scan.nextLine();
		name = scan.nextLine();
		dto = new PeopleDTO(0, name, null);
		
		pArr = peopleDao.select(name);
		printArray(pArr);
		return pArr;
	}
	private void search() {
		System.out.println("::: SEARCH :::");
		// 검색 할 이름을 입력 받아서 DAO에서 검색한다.
		// 검색 결과를 돌려 받아서 화면에 출력한다.
		out.print("검색 할 성명 입력 >>> ");
		searchList();
	}
	
	private PeopleDTO prepare(String title) {
		out.print(title + " 할 성명 입력 >>> ");
		
		PeopleDTO people = null;
		PeopleDTO[] arr = searchList();
		if(arr == null) {
			out.println(title + " 할 내용이 없습니다!");
			return people;
		}
		int i = 0;
		do{
			out.print(title + " 할 대상의 번호를 입력 하세요 >>> ");
			i = scan.nextInt();
		}while(!(i>=0 && i<arr.length) );
		people = arr[i];
		
		return people;
	}
	
	private void modify() {
		System.out.println("::: MODIFY :::");
		
		PeopleDTO people = prepare("수정");
		out.println(people);
		
		out.println("-> 수정 항목을 선택하세요.");
		out.print("1.성명 2.이메일 3.모두 >>> ");
		int select = scan.nextInt();
		scan.nextLine();
		switch(select) {
		case 3 : 
			out.print("새 이름 입력 >>> ");
			people.setName(scan.nextLine());
		case 2 : 
			out.print("새 Email 입력 >>> ");
			people.setEmail(scan.nextLine()); 
			break;
		case 1 :
			out.print("새 이름 입력 >>> ");
			people.setName(scan.nextLine()); 
			break;
		default : out.println("선택 오류!");
		}
		peopleDao.modify(people);
	}

	private void delete() {
		System.out.println("::: DELETE :::");
		
		PeopleDTO people = prepare("삭제");
		out.println(people);
		out.println("참말로 삭제 하겠습니까?");
		out.print("1.delete 2.cancel >>>");
		int i = scan.nextInt();
		if(i==1) {
			peopleDao.delete(people);
		} else {
			out.println("취소를 선택 하였습니다.");
		}
	}

	private void sort() {
		System.out.println("::: SORT :::");
		
	}

	private void end() {
		System.out.println("::: END :::");
		System.out.println("프로세스 종료!");
		System.exit(0);
	}

	private int menu(String ... menuStr) {
		int no = 0;
		
		for(int i=0; i<menuStr.length; i++) {
			out.print((i+1)+"."+ menuStr[i] +" ");
		}
		System.out.println();
		out.print("Choice >>> ");
		no = scan.nextInt();
		
		return no;
	}

	public static void main(String[] args) {
		new MainControl();
	}
}

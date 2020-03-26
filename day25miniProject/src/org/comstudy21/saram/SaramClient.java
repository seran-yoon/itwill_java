package org.comstudy21.saram;

import java.io.IOException;
import java.util.Scanner;

import org.comstudy21.dao.SaramDao;
import org.comstudy21.dto.SaramDto;
import org.comstudy21.jdbc.JdbcUtil;

public class SaramClient {
	
	private static SaramDao dao = new SaramDao(JdbcUtil.getConnection());
	
//	public static void main(String[] args) {
//	
//		SaramDto dto = new SaramDto();
//		
//		dto.setId("YOON");
//		dto.setName("SERAN");
//		dto.setAge(26);
//		
//		dao.insert(dto);
//		
//		selectAll();
//		
//	}
//
//	public static void selectAll() {
//		
//		SaramDto[] arr = dao.selectAll();
//		
//		for(SaramDto dto : arr){
//			System.out.println(dto);
//		}
//	
//	}

	public static final Scanner sc = new Scanner(System.in);
	
	String[] menuItems = { "MENU", "INPUT", "OUTPUT", "SEARCH", "MODIFY", "DELETE", "END" };
	
	public SaramClient(){
		start();
	}
	
	private void start() {
		for(;;){
			run();
			System.out.println();
		}
	}
	
	private void run() {
		
		switch(menu()) {
		case 1 : input(); break;
		case 2 : output(); break;
		case 3 : search(); break;
		case 4 : modify(); break;
		case 5 : delete(); break;
		case 6 : end(); break;
		default : System.out.println("해당 메뉴가 없습니다!");
		}
	
	}

	private void end() {
		
		System.out.println("::: END :::");
		System.out.println("프로그램을 종료합니다!");
		System.exit(0);
		
	}
	
	private void delete() {
		
		System.out.println("::: DELETE :::");	
		
		System.out.print("삭제할 아이디 입력 >>> ");
		String id = sc.next();
		
		dao.delete(new SaramDto(id, null, 0));
		
	}
	
	private void modify() {
		
		System.out.println("::: MODIFY :::");		
		
		System.out.print("수정할 아이디 입력 >>> ");
		String id = sc.next();
		
		System.out.print("수정할 이름 입력 >>> ");
		String name = sc.next();
		System.out.print("수정할 나이 입력 >>> ");
		int age = sc.nextInt();
		
		dao.update(new SaramDto(id, name, age));
		
	}
	
	private void search() {
		
		System.out.println("::: SEARCH :::");		
				
		System.out.print("검색할 아이디 입력 >>> ");
		String id = sc.next();
		
		SaramDto dto = dao.select(new SaramDto(id, null, 0));
		SaramDto saram = dao.select(dto);
		System.out.println(saram);
		
	}

	private void output() {
		
		System.out.println("::: OUTPUT :::");		
		
		SaramDto[] arr = dao.selectAll();
		
		for(SaramDto dto : arr){
			System.out.println(dto);
		}
		
	}

	private void input() {
		
		System.out.println("::: INPUT :::");		
		
		System.out.print("아이디 입력 >>> ");
		String id = sc.next();
		System.out.print("성명 입력 >>> ");
		String name = sc.next();
		System.out.print("나이 입력 >>> ");
		int age = sc.nextInt();
		
		dao.insert(new SaramDto(id, name, age));
		
	}
	
	private int menu() {
		
		int no = 0;
		for(int i=1;i<menuItems.length;i++){
			System.out.printf("%d.%s ", i, menuItems[i]);
		}
		
		System.out.println();
		System.out.print("Choice >>> ");
		no = sc.nextInt();
		
		return no;
//		return getNum();
		
	}
	
//	private int getNum() {
//		
//		int num = 0;
//		int ch;
//		
//		try {
//			while((ch=System.in.read()) != '\n'){
//				if(ch>='0' && ch<='9'){
//					num = num*10+ch-'0';
//				}
//			}
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		
//		return num;
//		
//	}

	public static void main(String[] args) {
		new SaramClient();
	}
}

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
		default : System.out.println("�ش� �޴��� �����ϴ�!");
		}
	}
	
	private void input() {
		String name = null;
		String email = null;
		PeopleDTO dto = null;
		
		System.out.println("::: INPUT :::");
		// ����� �̸����� �Է� �޾Ƽ� DAO�� DTO��ü�� �����Ѵ�.
		out.print("���� �Է� >>> ");
		scan.nextLine();
		name = scan.nextLine();
		out.print("�̸��� �Է� >>> ");
		email = scan.nextLine();
		
		//System.out.println(name + ", " + email);
		dto = new PeopleDTO(0, name, email);
		peopleDao.insert(dto);
		
		out.println("������ �Է� �Ͽ����ϴ�.");
	}

	private void output() {
		PeopleDTO[] pArr = null;
		
		System.out.println("::: OUTPUT :::");
		// DAO��ü �迭�� ���� �޾Ƽ� ����Ѵ�.
		
		pArr = peopleDao.selectAll();
		printArray(pArr);
	}
	
	private void printArray(PeopleDTO[] pArr) {
		if(pArr == null) {
			System.out.println("�ȳ� : ��� �� ������ �����ϴ�!");
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
		// �˻� �� �̸��� �Է� �޾Ƽ� DAO���� �˻��Ѵ�.
		// �˻� ����� ���� �޾Ƽ� ȭ�鿡 ����Ѵ�.
		out.print("�˻� �� ���� �Է� >>> ");
		searchList();
	}
	
	private PeopleDTO prepare(String title) {
		out.print(title + " �� ���� �Է� >>> ");
		
		PeopleDTO people = null;
		PeopleDTO[] arr = searchList();
		if(arr == null) {
			out.println(title + " �� ������ �����ϴ�!");
			return people;
		}
		int i = 0;
		do{
			out.print(title + " �� ����� ��ȣ�� �Է� �ϼ��� >>> ");
			i = scan.nextInt();
		}while(!(i>=0 && i<arr.length) );
		people = arr[i];
		
		return people;
	}
	
	private void modify() {
		System.out.println("::: MODIFY :::");
		
		PeopleDTO people = prepare("����");
		out.println(people);
		
		out.println("-> ���� �׸��� �����ϼ���.");
		out.print("1.���� 2.�̸��� 3.��� >>> ");
		int select = scan.nextInt();
		scan.nextLine();
		switch(select) {
		case 3 : 
			out.print("�� �̸� �Է� >>> ");
			people.setName(scan.nextLine());
		case 2 : 
			out.print("�� Email �Է� >>> ");
			people.setEmail(scan.nextLine()); 
			break;
		case 1 :
			out.print("�� �̸� �Է� >>> ");
			people.setName(scan.nextLine()); 
			break;
		default : out.println("���� ����!");
		}
		peopleDao.modify(people);
	}

	private void delete() {
		System.out.println("::: DELETE :::");
		
		PeopleDTO people = prepare("����");
		out.println(people);
		out.println("������ ���� �ϰڽ��ϱ�?");
		out.print("1.delete 2.cancel >>>");
		int i = scan.nextInt();
		if(i==1) {
			peopleDao.delete(people);
		} else {
			out.println("��Ҹ� ���� �Ͽ����ϴ�.");
		}
	}

	private void sort() {
		System.out.println("::: SORT :::");
		
	}

	private void end() {
		System.out.println("::: END :::");
		System.out.println("���μ��� ����!");
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

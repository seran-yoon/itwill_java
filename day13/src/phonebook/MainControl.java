package phonebook;

import java.util.Scanner;

public class MainControl {
	public static final Scanner sc = new Scanner(System.in);
	public static final PeopleDAO peopleDao = new PeopleDAO(); //DAO Ŭ������ ���� ������ ������� �ȹٲ𲨶� ����ٰ�

	//������
	public MainControl(){
		while(true) {
			start(); // �����ϴ� �Լ� �ϳ� ���� ����
			System.out.println(); //�ٹٲ�
		}
	}
	
	//start �޼ҵ�(�Լ�) ����
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
		default : System.out.println("### �ش� �޴��� �����ϴ�! ###");
		}
	}
	
	//�Լ� ����
	//�Է� �Լ�
	private void input() {
		//���ú���
		String name = null;
		String email = null;
		PeopleDTO dto = null;
//		PeopleDTO dto = new PeopleDTO(); //DTOŬ�������� �����ϱ� ���� �������� dto ����, ��ü ����
		
		System.out.println("::: INPUT :::");
		//����� �̸����� �Է¹޾Ƽ� DAO�� DTO��ü�� �����Ѵ�
		System.out.print("���� �Է� >>> ");
		sc.nextLine();//���ۺ���(������ �Է¹ް� ���ڿ� �޴°� ������ �ѹ� ������ ��)
		name = sc.nextLine();
		System.out.print("�̸��� �Է� >>> ");
		email = sc.nextLine();
		
//		dto.setIdx(0);
//		dto.setName(name);
//		dto.setEmail(email);
		
		dto = new PeopleDTO(0, name, email); //�ν��Ͻ�ȭ ���ָ� ���� �ٷ� ����
		
		peopleDao.inputData(dto);
		
		System.out.println("* ������ �Է��Ͽ����ϴ� *");
	}
	
	//��� �Լ�
	private void output() {
		//���ú���
		PeopleDTO[] pArr = null;
		
		System.out.println("::: OUTPUT :::");
		//DAO��ü���� �迭�� ���� �޾Ƽ� ����Ѵ�
		pArr = peopleDao.outputData(); //DAO Ŭ�������� ���Ϲ��� ���� pArr�� ��´�
		printArray(pArr); //printArry�Լ��� pArr�� �ְ� ������ֱ�~
	}
	
	//printArray�Լ��� ���� ����!!!!!!! ���� �ݺ����� ��°� �˻����� ����ϱ� ������ �Լ��� ������ְ� ȣ���ϴ� ������� ���
	private void printArray(PeopleDTO[] pArr){
		if(pArr == null){
			System.out.println("### ��� �� ������ �����ϴ� ###");
			return;
		}
		
		for(int i=0;i<pArr.length;i++){
			System.out.println((i+1)+" : "+pArr[i].toString());
		}
		
		System.out.println("* ����� �Ϸ�Ǿ����ϴ� *");
	}

	//�˻� �Լ�
	private void search() {
		//���ú���
		PeopleDTO[] pArr = null; //��� �Լ��� pArr �迭�� �ٸ� ��
		PeopleDTO dto = null; //�Է� �Լ��� dto ������ �ٸ� ��
		String name = null; //�̸��� �Է¹޾Ƽ� �˻�
		
		System.out.println("::: SEARCH :::");
		//�˻���(�̸�)�� �Է¹޾Ƽ� DAO���� �˻��Ѵ�
		//�˻� ����� ���� �޾Ƽ� ȭ�鿡 ����Ѵ�
		System.out.print("�˻� �� ���� �Է� >>> ");
		sc.nextLine();
		name = sc.nextLine();
		
		dto = new PeopleDTO(0,name,null); //�ν��Ͻ�ȭ ���ָ� ���� �ٷ� ����
		
		pArr = peopleDao.searchData(dto);
		printArray(pArr); //printArry�Լ��� pArr�� �ְ� ������ֱ�~
	}

	//���� �Լ�
	private void modify() {
		//���ú���
		int num = 0;

		System.out.println("::: MODIFY :::");
		//�˻���(������ȣ)�� �Է¹޾Ƽ� DAO���� �˻��Ѵ�
		//������ ����� ����� �����ϰ��� �ϴ� ���(�̸�/�̸���)�� �����Ѵ�(����� ����)
		System.out.print("���� �� �ּҷ��� ��ȣ �Է� >>> ");
		num = sc.nextInt();

		peopleDao.modifydata(num);
}

	//���� �Լ�
	private void delete() {
		//���ú���
		int num = 0;
		
		System.out.println("::: DELETE :::");
		//�˻���(������ȣ)�� �Է¹޾Ƽ� DAO���� �˻��Ѵ�
		//�ش� �ּҷ��� �����ϰ� �ּҷ��� ���̸� �ٿ��ش�
		System.out.print("���� �� �ּҷ��� ��ȣ �Է� >>> ");
		num = sc.nextInt();
		
		peopleDao.deleteData(num);
	}

	//���� �Լ�
	private void sort() {
		System.out.println("::: SORT :::");
		System.out.println("comming soon...!!");
	}

	//���� �Լ�
	private void end() {
		System.out.println("::: END :::");
		System.out.println("���μ��� ����!");
		System.exit(0); //����
	}

	//menu �޼ҵ�(�Լ�) ����
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

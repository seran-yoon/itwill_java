package mini_project;

import java.util.Scanner;

//java bin : VO �Ǵ� DTO ������ �Ѵ�
class People { // �����͸� �����ϴ� People class ����
	// ���� ��ȭ��ȣ �̸��� ����ȣ
	private int idx; //��� ��ȣ
	private String name; 
	private String email;
	private String phone;

	//������ ����
	public People() { //����Ʈ ������
		this(0, "", "", "");
	}

	public People(int idx, String name, String email, String phone) { //�Ű������� ���� ������
		this.idx = idx;
		this.name = name;
		this.email = email;
		this.phone = phone;
	}

	//��� �޼ҵ� ���� (�ʵ忡 private�� ����� ������ �������� ������ �ȵ�, Main���� ���������� �̿��� �����ϱ� ���� ��������)
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

	//������¸� ��������
	@Override
	public String toString() { // �ڵ� ���� �Լ�
		return "[" + idx + ", " + name + ", " + email + ", " + phone + "]";
	}
}// end of People class

//----------------------------------------------------------------------------------------------------------------------------------------

class PhoneBookManager { //ȭ�� ������ ���� PhoneBookManager class ����

	public static final int Max = 100;
	private People[] phoneBook = new People[Max]; //People Ŭ������ �����͸� ��Ƶδ� �迭(�迭 ���� phoneBook)�� ����  //���� �迭
	private int top = 0; //���� �������� ����

	//��ü �Է��� ���� �޼ҵ�
	public void input(People p) { //People Ŭ������ �����ϴ� �������� p�� ����
		if(top>=Max) {
			System.out.println("���̻� �Է��� �� �����ϴ�!");
			return; //������
		} //���� �迭�� ������ MAX�� �Ѱ� �Է��Ϸ��� �ϸ� ���̻� �Է��� �� ���� �ȳ��޼����� �������� �� ���� ���ϰ����� ��ȯ
		phoneBook[top++] = p; //�Է¹޴� P�� �迭 phoneBook�� �ϳ��� ����
	}

	//��ü ����� ���� �޼ҵ�
	public People[] output() { //���ϰ��� �迭�̱� ������ void ��� �迭�� ������ ����(People Ŭ������ �����ϴ� �迭)
		if(top==0) { //�Է¹��� �����Ͱ� �ϳ��� ���µ� 2.OUTPUT�� �����ϸ� �߰��ϴ� �޼���
			System.out.println("������ �����ϴ�!");
			return null; //���ϰ��� null�� �ְ� ������ 
		}	

		People[] peopleArr = new People[top]; //People Ŭ������ �����͸� ��Ƶδ� �迭(�迭 ���� peopleArr)�� ����, �Է¹��� �������� ������ŭ �迭 peopleArr�� ���̸� ������  //phoneBook�迭�� ���纻 �迭(�Է¹��� ��ŭ�� ���̸� ������� �迭)

		for(int i=0;i<top;i++) { //�迭���� ���� ���
			peopleArr[i] = new People(); //people�����͸� ������ peopleArr[i] ���� ���� �迭�� ����
			peopleArr[i].setIdx(phoneBook[i].getIdx());
			peopleArr[i].setName(phoneBook[i].getName());
			peopleArr[i].setEmail(phoneBook[i].getEmail());
			peopleArr[i].setPhone(phoneBook[i].getPhone());

		}
		return peopleArr; //peopleArr �迭 ���� ����
	}
	
	//��ü �˻��� ���� �޼ҵ�
	public void search(String searchName) {
		
		int searchname = 0;
		
		if(searchname==0){
			System.out.println("�˻� ����� �����ϴ�!");
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
	private static final PhoneBookManager manager = new PhoneBookManager(); //PhoneBookManager Ŭ������ �����ϴ� �������� manager ����

	private int menu() { //�޴��� �����ְ� �� �߿� ���� �ش�Ǵ� ��ȣ�� ���ǹ����� �̵��ϱ� ����
		
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
				
				People people = new People(); //�Է��� �Ͽ� �����͸�  people Ŭ������ �����ؾ� �ϱ� ������ People Ŭ������ �����ϴ� �������� people�� ����
				
				System.out.print("Name >>> ");
				people.setName(sc.next()); //�Է¹��� name���� people Ŭ������ setName�� ���� ����ǰ�, people Ŭ�������� �����ؼ� ���� �������� ��
				System.out.print("Email >>> ");
				people.setEmail(sc.next());
				System.out.print("Phone >>> ");
				people.setPhone(sc.next());
				
				manager.input(people); //PhoneBookManager Ŭ������  input(��ü �Է��� ���� �޼ҵ� ������ ��)���� ��� �Է¹��� �����͸� people Ŭ������ ����
				
				break;
			case 2:
				System.out.println("::: OUTPUT :::");
				
				People[] arr = manager.output(); //PhoneBookManager Ŭ������ output(��ü ����� ���� �޼ҵ� ������ ��)���� ���Ϲ��� ���� �迭 arr(�����ޱ� ���� ���� ���� �迭 arr)�� �־��� 
				
				for(People p1 : arr) { //for-each�� //�ݺ��������� People Ŭ������ �������� p�� arr[0],arr[1],arr[2]... ���� ����
					System.out.println(p1); //p1�� ��(arr[i])�� ��� (p1�� ���� ������ �������� ��)
				}
				/*
				 for(int i=0;i<arr.length;i++){
				 	System.out.println(arr[i]);
				 }
				 */
				
				break;
			case 3:
				System.out.println("::: SEARCH :::");
				
				System.out.println("Search Name >>> "); //�˻��� �̸��� �Է¹���
				
				
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
				System.out.println("�ش� ����� �����ϴ�!");
			}
		}
	}

	public static void main(String[] args) {
		new PhoneBookMain(); //Ŭ���� PhoneBookMain�� �ν��Ͻ� ��
	}
}

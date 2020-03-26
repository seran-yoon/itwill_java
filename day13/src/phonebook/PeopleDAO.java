package phonebook;

import java.util.Scanner;

public class PeopleDAO {
	Scanner sc = new Scanner(System.in);
	public static final int MAX = 100;	
	PeopleDTO[] pArr = new PeopleDTO[MAX];
	private int top = 0; //������
	private int sequence = 1; //������ȣ �ڵ� ����, �ߺ��� ���� �ȵ��� �ϱ� ����
	
	static{
		//����ƽ �ʱ�ȭ
		//�ʱ�ȭ �� �����ں��� ���� ����ȴ�
	}
	//�⺻ �����͸� �̸� �������� �׽�Ʈ�Ҷ� ������� ������ ������ �ۼ�
	//�ν��Ͻ� �ʱ�ȭ
	{ 
		pArr[top++] = new PeopleDTO(sequence++, "kim", "kim@aaa.com");
		pArr[top++] = new PeopleDTO(sequence++, "lee", "lee@aaa.com");
		pArr[top++] = new PeopleDTO(sequence++, "park", "park@aaa.com");
		pArr[top++] = new PeopleDTO(sequence++, "lee", "lee2@aaa.com");
		pArr[top++] = new PeopleDTO(sequence++, "yoon", "yoon@aaa.com");
		
	} 
	
	//�Է� �κ�
	public void inputData(PeopleDTO dto) {
		if(top >= MAX) {
			System.out.println("### ���̻� �Է� �Ұ����� �Ұ��� �մϴ� ###");
			return;
		}
		
		dto.setIdx(sequence++);
		pArr[top++] = dto;
	}
	
	//��� �κ�
	public PeopleDTO[] outputData() {
		PeopleDTO[] arr = new PeopleDTO[top]; //pArr�� �������� �޶����� �ȵǴϱ� ���纻�� �����

		if(top <= 0){
			System.out.println("### ����� ������ �����ϴ� ###");
			return null;
		}
				
		for(int i=0;i<top;i++){
			arr[i] = new PeopleDTO(); //���纻 �迭�� ��������� �������� ������ �����ϰ� ���� �������� �Ϻ��ϰ� �и���
			arr[i].setIdx(pArr[i].getIdx());
			arr[i].setName(pArr[i].getName());
			arr[i].setEmail(pArr[i].getEmail());
		}
		return arr;
	}
	
	//�˻� �κ�
	public PeopleDTO[] searchData(PeopleDTO dto) {
		PeopleDTO[] arr1 = new PeopleDTO[top]; //pArr�� �������� �޶����� �ȵǴϱ� ���纻�� �����
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
			System.out.println("### �˻� ����� �����ϴ� ###");
			return null;
		}
		
		arr2 = new PeopleDTO[size];
		
		for(int i=0;i<arr2.length;i++){ //arr1�� ���� arr2�� ����
			arr2[i] = arr1[i];
		}
				
		return arr2;
	}

	//���� �κ�
	public void modifydata(int num) {
		boolean flag=true;
		int number = 0;
		
		for(int i=0;i<top;i++){
			if(num==pArr[i].getIdx()){
				System.out.println("���� �� ����� ��ȣ�� �������ּ��� (1.�̸� 2.�̸���)");
				System.out.print("Modify Choice >>> ");
				number = sc.nextInt();
				
				if(number == 1){
					System.out.print("������ �̸� >>> ");
					pArr[i].setName(sc.next());
				} else if(number == 2){
					System.out.print("������ �̸��� >>> ");
					pArr[i].setEmail(sc.next());
				} else{
					System.out.println("### �߸��� �����Դϴ�. �ٽ� �Է����ּ��� ###");
					return;
				}
				System.out.println("* ������ �Ϸ�Ǿ����ϴ� *");
				flag = false;
				break;
			}
		}
		
		if(flag){
			System.out.println("### �Է��Ͻ� ��ȣ�� �ּҷ��� �����ϴ� ###");
			return;
		}
	}

	//���� �κ�
		public void deleteData(int num) {
			boolean flag=true;
			
			for(int i=0;i<top;i++){
				if(num==pArr[i].getIdx()){		
					for(int j=i;j<top;j++){
						pArr[j]=pArr[j+1];
					}
					top--;
					flag = false;
					System.out.println("* ������ �Ϸ�Ǿ����ϴ� *");
					break;
				}
			}
			
			if(flag){
				System.out.println("### �Է��Ͻ� ��ȣ�� �ּҷ��� �����ϴ� ###");
				return;
			}
		}

}


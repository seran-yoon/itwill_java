package org.comstudy21.phonebook.model;

public class DAO { //DB�κ�
	
	static final int MAX = 100;
	private DTO[] list = new DTO[MAX];
	private static int squence = 1; //idx�� �ȴ�
	private int top = 0;
	
	{ //���� DB
		list[top++] = new DTO(squence++, "KIM", "010-0000-0000");
		list[top++] = new DTO(squence++, "LEE", "010-1111-1111");
		list[top++] = new DTO(squence++, "PARK", "010-2222-2222");
		list[top++] = new DTO(squence++, "KANG", "010-3333-3333");
	}
	
	//�Էºκ�
	public void inputData(DTO dto){

		if(top>=list.length){
			System.out.println("### ���̻� �Է��� �� �����ϴ�! ###");
			return;
		}
		
		dto.setIdx(squence++);
		list[top++] = dto;
	}
	
	//��ºκ�
	public DTO[] outputData(){
		
		if(top<=0){
			System.out.println("### ����� �����Ͱ� �����ϴ�! ###");
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
	
	//�˻��κ�
	public DTO[] searchData(DTO dto){
		DTO[] dtoList1 = new DTO[top];
		
		int cnt = 0;
		String sName = dto.getName();
		
		for(int i=0;i<top;i++){
			if(sName.equals(list[i].getName())){ //������ String sName = dto.getName(); ���� ���ϰ� if�� ���ǽĿ��� if((dto.getName()).equals(list[i].getName()))��� �ᵵ ��
				dtoList1[cnt] = new DTO();
				
				dtoList1[cnt].setIdx(list[i].getIdx());
				dtoList1[cnt].setName(list[i].getName());
				dtoList1[cnt].setPhone(list[i].getPhone());
				
				cnt++;
			}
		}
		
		if(cnt==0){
			System.out.println("### �˻� ����� �����ϴ� ###");
			return null;
		}
		
		DTO[] dtoList2 = new DTO[cnt];
		
		for(int i=0;i<dtoList2.length;i++){ //arr1�� ���� arr2�� ����
			dtoList2[i] = dtoList1[i];
		}
				
		return dtoList2;
		
	}
	
	//�����κ�
	public void modifyData(DTO dto){
		for(int i=0; i<top; i++) {
			if((dto.getIdx()) == list[i].getIdx()) {
				list[i] = dto;
				System.out.println("### ���� �Ǿ����ϴ� ###");
				return;
			}
		}
		System.out.println("### ���� ���� �ʾҽ��ϴ�! ###");
	}
	
	//�����κ�
	public void deleteData(DTO dto){
		for(int i=0; i<top; i++) {
			if((dto.getIdx()) == list[i].getIdx()) {
				for(int j=i; j<top-1; j++) {
					list[j] = list[j+1];
				}
				System.out.println("### ���� �Ϸ�! ###");
				top--;
				return;
			}
		}
		
		System.out.println("### ������ ������ �����ϴ� ###");
	}
	
	
	
	
	
}

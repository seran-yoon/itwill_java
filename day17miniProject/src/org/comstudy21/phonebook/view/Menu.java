package org.comstudy21.phonebook.view;

public class Menu implements View {

	static final String[] menuArr = resource.menuArr;
	
	@Override
	public void show() {
		System.out.println("::: MENU :::");
			
		for(int i=0;i<menuArr.length;i++){
			System.out.println((i+1)+"."+ menuArr[i] +" ");
		}
		System.out.println(); //�ٹٲ� �뵵
		
		System.out.print("Choice >>> ");
		int no = resource.sc.nextInt();
		
		while(no<0 || no>menuArr.length){
			System.out.printf("������ �Ѿ����ϴ�!(%d~%d����)\n",1,menuArr.length);
			System.out.print("Choice >>> ");
			no = resource.sc.nextInt();
		}
		
		resource.menuNo = no; //�Է� �޴� ��ȣ�� �޴��̵�
		System.out.println(); //�ٹٲ� �뵵

	}

}

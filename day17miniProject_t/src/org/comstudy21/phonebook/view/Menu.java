package org.comstudy21.phonebook.view;

public class Menu implements View {
	
	static final String[] menuArr = resource.menuArr;
	
	@Override
	public void show() {
		System.out.println("::: Menu :::");
		//System.out.println(menuArr.length);
		for(int i=0; i<menuArr.length; i++) {
			System.out.print((i+1) +"." + menuArr[i] +" ");
		}
		System.out.println();
		System.out.print("Choice>>> ");
		int no = resource.scan.nextInt();
		while(no<0 || no>menuArr.length) {
			System.out.printf("������ �Ѿ����ϴ�!(%d~%d����)\n", 1, menuArr.length);
			System.out.print("Choice>>> ");
			no = resource.scan.nextInt();
		}
		
		resource.menuNo = no;
	}

}

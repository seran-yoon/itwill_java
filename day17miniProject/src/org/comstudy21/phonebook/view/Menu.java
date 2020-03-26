package org.comstudy21.phonebook.view;

public class Menu implements View {

	static final String[] menuArr = resource.menuArr;
	
	@Override
	public void show() {
		System.out.println("::: MENU :::");
			
		for(int i=0;i<menuArr.length;i++){
			System.out.println((i+1)+"."+ menuArr[i] +" ");
		}
		System.out.println(); //줄바꿈 용도
		
		System.out.print("Choice >>> ");
		int no = resource.sc.nextInt();
		
		while(no<0 || no>menuArr.length){
			System.out.printf("범위가 넘었습니다!(%d~%d사이)\n",1,menuArr.length);
			System.out.print("Choice >>> ");
			no = resource.sc.nextInt();
		}
		
		resource.menuNo = no; //입력 받는 번호로 메뉴이동
		System.out.println(); //줄바꿈 용도

	}

}

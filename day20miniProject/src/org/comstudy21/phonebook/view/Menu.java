package org.comstudy21.phonebook.view;

import java.util.HashMap;
import static org.comstudy21.phonebook.R.*;

public class Menu implements View {

	@Override
	public void show(HashMap<String, Object> request) {
		
		System.out.println("::: MENU :::");
		
		for(int i=1;i<menuStr.length;i++){
			System.out.println(i+"."+menuStr[i]+" ");
		}
		System.out.println(); //줄바꿈 용도
		System.out.print("Choice >>> ");
		int no = sc.nextInt();
		
		while(no<1 || no>menuStr.length-1){ //메뉴번호외의 번호를 입력시 다시 번호를 받게 하는 반복문, 메뉴번호를 제대로 입력하면 반복문에서 빠져나오게 됨
			System.out.printf("%d~%d사이 값만 입력하세요 \n", 1, menuStr.length);
			System.out.print("Choice >>> ");
			no = sc.nextInt();
		}
		
		//menuStr배열에서 key를 가져와서 request에 저장
		request.put("menuKey", menuStr[no]);
		
	}

}

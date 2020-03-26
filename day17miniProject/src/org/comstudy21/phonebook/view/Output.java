package org.comstudy21.phonebook.view;

import org.comstudy21.phonebook.model.*;

public class Output implements View {

	@Override
	public void show() {
		System.out.println("::: OUTPUT :::");
		
		if(resource.dtoList == null){
			System.out.println("출력할 내용이 없습니다");
			return;
		}

		DTO[] list = resource.dtoList;
		
		for(DTO dto : list) {
			System.out.println(dto);
		}
		
		resource.menuNo = 0; //input실행 끝나면 메뉴 자동 생성 (메뉴 번호는 0번)
		System.out.println(); //줄바꿈 용도
	}

}

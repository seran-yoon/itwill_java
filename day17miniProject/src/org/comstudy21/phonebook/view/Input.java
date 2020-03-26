package org.comstudy21.phonebook.view;

import org.comstudy21.phonebook.model.*;

public class Input implements View {

	@Override
	public void show() {
		System.out.println("::: INPUT :::");
		
		DTO dto = new DTO();
		
		System.out.print("성명 >>> ");
		dto.setName(resource.sc.next());
		System.out.print("전화번호 >>> ");
		dto.setPhone(resource.sc.next());
		
		resource.dto = dto;
		
		resource.menuNo = 0; //input실행 끝나면 메뉴 자동 생성 (메뉴 번호는 0번)
		System.out.println(); //줄바꿈 용도
	}

}

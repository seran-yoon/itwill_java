package org.comstudy21.phonebook.view;

import org.comstudy21.phonebook.model.*;

public class Search implements View {

	@Override
	public void show() {
		System.out.println("::: SEARCH :::");
			
		//검색어를 입력받는다
		//검색어를 controller에서 쓸 수 있도록 R에 저장
		System.out.print("검색할 성명 입력 >>> ");
		String sName = resource.sc.next();
		
		resource.dto = new DTO(0,sName,null);
		
		resource.menuNo = 0; //input실행 끝나면 메뉴 자동 생성 (메뉴 번호는 0번)
		System.out.println(); //줄바꿈 용도
	}

}

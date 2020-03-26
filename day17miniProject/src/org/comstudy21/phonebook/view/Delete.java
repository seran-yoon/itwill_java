package org.comstudy21.phonebook.view;

import org.comstudy21.phonebook.model.*;

public class Delete implements View {

	@Override
	public void show() {
		System.out.println("::: DELETE :::");
		
		//삭제 할 데이터 검색 (search기능 활용)
		//삭제할 데이터를 화면에 보여준다
		//어떤 것을 삭제할지 idx를 입력받는다
		//DAO에서 삭제 처리
		for(int i=0;i<resource.dtoList.length;i++){
			System.out.println(resource.dtoList[i]);
		}
		
		System.out.print("삭제 할 데이터의 idx 입력 >>> ");
		resource.dto = new DTO(resource.sc.nextInt(),null,null);
		
		resource.menuNo = 0; //input실행 끝나면 메뉴 자동 생성 (메뉴 번호는 0번)
		System.out.println(); //줄바꿈 용도
	}

}

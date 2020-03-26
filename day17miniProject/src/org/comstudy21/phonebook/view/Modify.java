package org.comstudy21.phonebook.view;

import org.comstudy21.phonebook.model.*;

public class Modify implements View {

	@Override
	public void show() {
		System.out.println("::: MODIFY :::");
		
		//수정 할 이름 검색(Search에서 처리 가능)
		//검색을 이용해서 DAO에서 검색할 수 있도록 R에 저장
		//-------검색결과를 사용 가능
		//검색 결과 목록 출력
		//몇번째를 수정 할 지 idx를 선택
		//새 데이터 입력 받아서 R에 저장
		if(resource.dtoList == null){
			System.out.println("수정 할 내용이 없습니다!");
			return;
		}
		
		for(int i=0;i<resource.dtoList.length;i++){
			System.out.println(resource.dtoList[i]);
		}
		
		//수정할 idx를 입력 받는다
		int sIdx = resource.dtoList[0].getIdx();
		if(resource.dtoList.length>1){
			System.out.print("수정 할 Idx 입력 >>> ");
			sIdx = resource.sc.nextInt();
		}
		
		//수정할 사항 입력받아서 처리하게 만들기
		resource.dto2 = new DTO();
		
		System.out.println("새 이름 입력 >>> ");
		resource.dto2.setName(resource.sc.next());
		System.out.println("새 전화번호 입력 >>> ");
		resource.dto2.setPhone(resource.sc.next());
		resource.dto2.setIdx(sIdx);
		
		resource.menuNo = 0; //input실행 끝나면 메뉴 자동 생성 (메뉴 번호는 0번)
		System.out.println(); //줄바꿈 용도
	}

}

package org.comstudy21.phonebook.controller;

import static org.comstudy21.phonebook.R.*;
import org.comstudy21.phonebook.model.*;
import org.comstudy21.phonebook.view.*;

public class Controller {
	
	public void service(){
		
		View view = viewArr[menuNo];
		viewer.setView(view);
		
		if(menuNo==1){ //>>>입력
			viewer.display();
			//입력 후 dao 호출
			dao.inputData(dto);
		} else if(menuNo==2){ //>>>출력
			DTO[] list = dao.outputData();
			dtoList = list;
			//dao 호출 후 출력
			viewer.display();
		} else if(menuNo==3){ //>>>검색 
			viewer.display(); //검색어를 resource에 저장하고 돌아옴 
			//DAO에서 검색해서 목록을 가져옴
			//결과를 보여줌
			DTO[] list = dao.searchData(dto);
			dtoList = list;
			//검색한 목록을 출력
			viewer.setView(viewArr[2]); //출력형식을 outputdata에 만들어놓았기 때문에 새로 만들지않고 재사용
			viewer.display();
		} else if(menuNo==4){ //>>>수정
			//modify를 호출하기 전에 데이터를 검색
			searchData();
			
			viewer.setView(view);
			viewer.display();
			//새 데이터를 DAO에 전달
			dao.searchData(dto);
		} else if(menuNo==5){ //>>>삭제
			searchData();
			
			viewer.setView(view);
			viewer.display();
		} else{ //>>>종료
			viewer.display();
		}
		
		service();
		
	}

	//수정, 삭제 전 검색
	private void searchData() {
		viewer.setView(search);
		viewer.display();
		// dao에서 검색한다.
		DTO[] list = dao.searchData(dto);
		dtoList = list;
	}

}

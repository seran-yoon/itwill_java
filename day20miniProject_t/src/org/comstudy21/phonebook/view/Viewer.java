package org.comstudy21.phonebook.view;

import static org.comstudy21.phonebook.R.*;

public class Viewer { //View인터페이스에서 묶어준 자식클래스들을(HashMap에 넣어둔애들) Controller에 내보내기 위함
	
	public void play(String key){
		
		View view = viewMap.get(key);
		
		if(view == null){
			System.out.println("View가 존재하지 않습니다!");
			return;
		}
		
		view.show(request);
	
	}
	
}

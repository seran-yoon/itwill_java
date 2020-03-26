package org.comstudy21.phonebook.controller;

import static org.comstudy21.phonebook.R.*;
import org.comstudy21.phonebook.command.Command;

public class PhoneBookController {
	
	public void service(){
		
		if(request.get("menuKey") == null){
			viewer.play(MENU); //menuKey가 null값이면 MENU를 실행
		}
		
		String menuKey = (String)request.get("menuKey");
		Command cmd = cmdMap.get(menuKey);
		
		if(INPUT.equals(menuKey)){
			viewer.play(INPUT); //입력 마치고 돌아옴
			cmd.action(request);
		}else if(OUTPUT.equals(menuKey)){
			viewer.play(cmd.action(request));
		}else{
			viewer.play(cmd.action(request));
		}
		//input이면 cmd를 다시 실행하고 menu로 간다
		
		request.put("menuKey", null); //초기화
		System.out.println("-----------------------"); //줄바꿈 용도
		service(); //재귀호출
	}

}

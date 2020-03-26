package org.comstudy21.phonebook.controller;

import static org.comstudy21.phonebook.R.*;

import org.comstudy21.phonebook.command.Command;

public class Controller {
	
	public void service(){
		
		if(request.get("manuKey") == null){
			viewer.play(MENU);
		}

		String menuKey = (String)request.get("menuKey");
		Command cmd = cmdMap.get(menuKey);
		
		if(INPUT.equals(menuKey)){
			viewer.play(INPUT);
			cmd.action(request);
		}else if(OUTPUT.equals(menuKey)){
			viewer.play(cmd.action(request));
		}else{
			viewer.play(cmd.action(request));
		}
		
		request.put("menuKey", null);
		System.out.println();
		
	}

}

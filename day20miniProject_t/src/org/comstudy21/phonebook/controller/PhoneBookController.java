package org.comstudy21.phonebook.controller;

import static org.comstudy21.phonebook.R.*;
import org.comstudy21.phonebook.command.Command;

public class PhoneBookController {
	
	public void service(){
		
		if(request.get("menuKey") == null){
			viewer.play(MENU); //menuKey�� null���̸� MENU�� ����
		}
		
		String menuKey = (String)request.get("menuKey");
		Command cmd = cmdMap.get(menuKey);
		
		if(INPUT.equals(menuKey)){
			viewer.play(INPUT); //�Է� ��ġ�� ���ƿ�
			cmd.action(request);
		}else if(OUTPUT.equals(menuKey)){
			viewer.play(cmd.action(request));
		}else{
			viewer.play(cmd.action(request));
		}
		//input�̸� cmd�� �ٽ� �����ϰ� menu�� ����
		
		request.put("menuKey", null); //�ʱ�ȭ
		System.out.println("-----------------------"); //�ٹٲ� �뵵
		service(); //���ȣ��
	}

}

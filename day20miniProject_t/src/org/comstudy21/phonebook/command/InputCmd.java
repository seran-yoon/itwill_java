package org.comstudy21.phonebook.command;

import java.util.HashMap;
import static org.comstudy21.phonebook.R.*;
import org.comstudy21.phonebook.model.PhonebookDto;

public class InputCmd implements Command {

	@Override
	public String action(HashMap<String, Object> request) {
		System.out.println("### InputCmd ###");
		
		//View�� ����� �Ŀ��� Dao�� ȣ���ϰ� ���������� View�� �����ϵ��� �����Ѵ�
		System.out.println("### View ���� ��...");

		//Dao�� �Էµ� �����͸� �߰��Ѵ�
		if(request.get("inputDto") != null){
			//request�� value�� Object Ÿ���̹Ƿ� ����Ҷ��� �ٿ�ĳ���� �ʿ�
			PhonebookDto dto = (PhonebookDto)request.get("inputDto");
			dao.insert(dto);
			System.out.println("### ������ �Է� �Ϸ�");
		}
		request.put("inputChk", null);
		
		return INPUT;
	}

}

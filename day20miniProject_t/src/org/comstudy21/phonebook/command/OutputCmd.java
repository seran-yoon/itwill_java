package org.comstudy21.phonebook.command;

import java.util.HashMap;
import static org.comstudy21.phonebook.R.*;
import org.comstudy21.phonebook.model.PhonebookDto;

public class OutputCmd implements Command {

	@Override
	public String action(HashMap<String, Object> request) {
		System.out.println("### OutputCmd ###");
		
		//View ���� ���� dao���� ����� �����´�
		PhonebookDto[] arr = dao.selectAll(); //Dao���� ���Ϲ޾ƿ� ���� arr�迭�� ����
		request.put("dtoArr", arr);	
		
		//View ����
		return OUTPUT;
	}

}

package org.comstudy21.phonebook.command;

import java.util.HashMap;
import static org.comstudy21.phonebook.R.*;
import org.comstudy21.phonebook.model.PhonebookDto;

public class OutputCmd implements Command {

	@Override
	public String action(HashMap<String, Object> request) {
		System.out.println("### OutputCmd ###");
		
		//View 실행 전에 dao에서 목록을 가져온다
		PhonebookDto[] arr = dao.selectAll(); //Dao에서 리턴받아온 값을 arr배열에 저장
		request.put("dtoArr", arr);	
		
		//View 실행
		return OUTPUT;
	}

}

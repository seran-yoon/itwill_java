package org.comstudy21.phonebook.command;

import java.util.HashMap;

import static org.comstudy21.phonebook.R.*;
import org.comstudy21.phonebook.model.DTO;

public class InputCmd implements Command {

	@Override
	public String action(HashMap<String, Object> request) {
		
		System.out.println("### INPUTcmd");
		
		if(request.get("inputDto") != null){
			DTO dto = (DTO)request.get("inputDto");
			dao.insert(dto);
			System.out.println("### 데이터 입력 완료");
		}
		
		request.put("inputChk", null);
		
		return INPUT;
	}

}

package org.comstudy21.phonebook.view;

import java.util.HashMap;

import org.comstudy21.phonebook.model.DTO;
import static org.comstudy21.phonebook.R.*;

public class Input implements View {

	@Override
	public void show(HashMap<String, Object> request) {
		
		System.out.println("::: INPUT :::");
		
		DTO dto = new DTO();
		
		System.out.print("성명 입력 >>> ");
		dto.setName(sc.next());
		System.out.print("전화번호 입력 >>> ");
		dto.setPhone(sc.next());
		
		request.put("inputDto", dto);
	
	}

}

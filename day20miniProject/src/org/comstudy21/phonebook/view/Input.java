package org.comstudy21.phonebook.view;

import java.util.HashMap;

import org.comstudy21.phonebook.model.DTO;
import static org.comstudy21.phonebook.R.*;

public class Input implements View {

	@Override
	public void show(HashMap<String, Object> request) {
		
		System.out.println("::: INPUT :::");
		
		DTO dto = new DTO();
		
		System.out.print("���� �Է� >>> ");
		dto.setName(sc.next());
		System.out.print("��ȭ��ȣ �Է� >>> ");
		dto.setPhone(sc.next());
		
		request.put("inputDto", dto);
	
	}

}

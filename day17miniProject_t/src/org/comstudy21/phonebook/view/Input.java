package org.comstudy21.phonebook.view;

import org.comstudy21.phonebook.model.DTO;

public class Input implements View {
	
	@Override
	public void show() {
		System.out.println("::: Input :::");
		DTO dto = new DTO();
		
		System.out.print("���� >>> ");
		dto.setName(resource.scan.next());
		System.out.print("��ȭ��ȣ >>> ");
		dto.setPhone(resource.scan.next());
		
		resource.dto = dto;
		
		//resource.menuNo = 0;
	}

}

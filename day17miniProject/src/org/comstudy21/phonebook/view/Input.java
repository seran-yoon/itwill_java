package org.comstudy21.phonebook.view;

import org.comstudy21.phonebook.model.*;

public class Input implements View {

	@Override
	public void show() {
		System.out.println("::: INPUT :::");
		
		DTO dto = new DTO();
		
		System.out.print("���� >>> ");
		dto.setName(resource.sc.next());
		System.out.print("��ȭ��ȣ >>> ");
		dto.setPhone(resource.sc.next());
		
		resource.dto = dto;
		
		resource.menuNo = 0; //input���� ������ �޴� �ڵ� ���� (�޴� ��ȣ�� 0��)
		System.out.println(); //�ٹٲ� �뵵
	}

}

package org.comstudy21.phonebook.view;

import org.comstudy21.phonebook.R;
import org.comstudy21.phonebook.model.DTO;

public class Search implements View {
	
	R r = resource;
	
	@Override
	public void show() {
		System.out.println("::: Search :::");
		// �˻�� �Է� �޴´�.
		// �˻�� Controller���� ���� �ֵ��� R�� ����
		System.out.print("�˻� �� �̸� �Է�>>> ");
		String sName = r.scan.next();
		
		r.dto = new DTO(0, sName, null);
	}

}

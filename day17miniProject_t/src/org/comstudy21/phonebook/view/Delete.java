package org.comstudy21.phonebook.view;

import org.comstudy21.phonebook.R;
import org.comstudy21.phonebook.model.DTO;

public class Delete implements View {
	
	R r = resource;
	
	@Override
	public void show() {
		System.out.println("::: Delete :::");
		// ���� �� ������ �˻� (search ��� Ȱ��)
		// ���� �� �����͸� ȭ�鿡 �����ش�.
		// ����� �������� idx�� �Է¹޴´�.
		// --> Dao���� ���� ó��
		if(r.dtoList == null) {
			System.out.println("���� �� ������ �����ϴ�!");
			return;
		}
		for(int i=0; i<r.dtoList.length; i++) {
			System.out.println(r.dtoList[i]);
		}
		System.out.print("���� �� �������� idx�Է� >>> ");
		r.dto = new DTO(r.scan.nextInt(), null, null);
	}

}

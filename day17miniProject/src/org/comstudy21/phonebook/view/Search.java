package org.comstudy21.phonebook.view;

import org.comstudy21.phonebook.model.*;

public class Search implements View {

	@Override
	public void show() {
		System.out.println("::: SEARCH :::");
			
		//�˻�� �Է¹޴´�
		//�˻�� controller���� �� �� �ֵ��� R�� ����
		System.out.print("�˻��� ���� �Է� >>> ");
		String sName = resource.sc.next();
		
		resource.dto = new DTO(0,sName,null);
		
		resource.menuNo = 0; //input���� ������ �޴� �ڵ� ���� (�޴� ��ȣ�� 0��)
		System.out.println(); //�ٹٲ� �뵵
	}

}

package org.comstudy21.phonebook.view;

import org.comstudy21.phonebook.model.*;

public class Delete implements View {

	@Override
	public void show() {
		System.out.println("::: DELETE :::");
		
		//���� �� ������ �˻� (search��� Ȱ��)
		//������ �����͸� ȭ�鿡 �����ش�
		//� ���� �������� idx�� �Է¹޴´�
		//DAO���� ���� ó��
		for(int i=0;i<resource.dtoList.length;i++){
			System.out.println(resource.dtoList[i]);
		}
		
		System.out.print("���� �� �������� idx �Է� >>> ");
		resource.dto = new DTO(resource.sc.nextInt(),null,null);
		
		resource.menuNo = 0; //input���� ������ �޴� �ڵ� ���� (�޴� ��ȣ�� 0��)
		System.out.println(); //�ٹٲ� �뵵
	}

}

package org.comstudy21.phonebook.view;

import org.comstudy21.phonebook.model.*;

public class Modify implements View {

	@Override
	public void show() {
		System.out.println("::: MODIFY :::");
		
		//���� �� �̸� �˻�(Search���� ó�� ����)
		//�˻��� �̿��ؼ� DAO���� �˻��� �� �ֵ��� R�� ����
		//-------�˻������ ��� ����
		//�˻� ��� ��� ���
		//���°�� ���� �� �� idx�� ����
		//�� ������ �Է� �޾Ƽ� R�� ����
		if(resource.dtoList == null){
			System.out.println("���� �� ������ �����ϴ�!");
			return;
		}
		
		for(int i=0;i<resource.dtoList.length;i++){
			System.out.println(resource.dtoList[i]);
		}
		
		//������ idx�� �Է� �޴´�
		int sIdx = resource.dtoList[0].getIdx();
		if(resource.dtoList.length>1){
			System.out.print("���� �� Idx �Է� >>> ");
			sIdx = resource.sc.nextInt();
		}
		
		//������ ���� �Է¹޾Ƽ� ó���ϰ� �����
		resource.dto2 = new DTO();
		
		System.out.println("�� �̸� �Է� >>> ");
		resource.dto2.setName(resource.sc.next());
		System.out.println("�� ��ȭ��ȣ �Է� >>> ");
		resource.dto2.setPhone(resource.sc.next());
		resource.dto2.setIdx(sIdx);
		
		resource.menuNo = 0; //input���� ������ �޴� �ڵ� ���� (�޴� ��ȣ�� 0��)
		System.out.println(); //�ٹٲ� �뵵
	}

}

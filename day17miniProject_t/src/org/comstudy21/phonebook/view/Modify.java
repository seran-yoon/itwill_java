package org.comstudy21.phonebook.view;

import org.comstudy21.phonebook.R;
import org.comstudy21.phonebook.model.DTO;

public class Modify implements View {
	
	R r = resource;
	
	@Override
	public void show() {
		System.out.println("::: Modify :::");
		// ���� �� �̸� �˻�(Search ���� ó�� ����)
		// �˻��� �̿��ؼ� Dao���� �˻��� �� �ֵ��� R�� �����Ѵ�.(Search ���� ó��)
		// ----------- �˻� ����� ��� ����
		// �˻� ��� ��� ���
		// ���°�� ���� ���� idx �����Ѵ�.
		// �� ������ �Է� �޾Ƽ� R�� �����Ѵ�.
		if(r.dtoList == null) {
			System.out.println("���� �� ������ �����ϴ�!");
			return;
		}
		for(int i=0; i<r.dtoList.length; i++) {
			System.out.println(r.dtoList[i]);
		}
		// ���� �� idx�� �Է� �޴´�.
		int sIdx = r.dtoList[0].getIdx();
		if(r.dtoList.length > 1) {
			System.out.print("���� �� IDX �Է� >>> ");
			sIdx = r.scan.nextInt();
		}
		r.dto2 = new DTO();
		System.out.print("�� �̸� �Է�>>> ");
		r.dto2.setName(r.scan.next());
		System.out.print("�� ��ȭ��ȣ �Է�>>> ");
		r.dto2.setPhone(r.scan.next());
		r.dto2.setIdx(sIdx);
	}


}



/* �̸��� ��ȭ��ȣ�� ����� �������� ���°� �߰� �ؾ� ��  */

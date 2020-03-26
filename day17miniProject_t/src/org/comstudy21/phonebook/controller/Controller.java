package org.comstudy21.phonebook.controller;

import static org.comstudy21.phonebook.R.*;
import org.comstudy21.phonebook.model.DTO;
import org.comstudy21.phonebook.view.View;

public class Controller {
	
public void service() {
		
		View view = viewArr[menuNo];
		viewer.setView(view);
		boolean flag = true;
		if(menuNo == 1) {
			viewer.display();
			// �Է� �� dao ȣ��
			dao.insert(dto);
		} else if(menuNo == 2) {
			DTO[] list = dao.selectAll();
			dtoList = list;
			// dao ȣ�� �� ���
			viewer.display();
		}else if(menuNo == 3) {
			viewer.display(); // �˻�� R�� �����ϰ� ���ƿ�
			// Dao���� �˻� �ؼ� ��� �����´�
			// ����� �ѷ��ش�.
			DTO[] list = dao.select(dto);
			dtoList = list;
			// �˻� ����� ����Ѵ�.
			viewer.setView(viewArr[2]);
			viewer.display();			
		}else if(menuNo == 4) {
			// modify�� ȣ�� �ϱ� ���� �����͸� �˻��Ѵ�.
			preSearch();
			
			viewer.setView(view);
			viewer.display();
			// �� �����͸� Dao�� �����Ѵ�.
			dao.update(dto2);
		}else if(menuNo == 5) {
			preSearch();
			
			viewer.setView(view);
			viewer.display();
			// �Է� ���� idx������ �̿��ؼ� dao���� �ش� ������ ����
			dao.delete(dto);
		} else {
			//�޴� ȣ��
			viewer.display();
			flag = false;
		}
		System.out.println();
		// �޴� ���� ���� ���̽����� ����
		if(flag) {
			menuNo = 0;
		}
		
		service();
	} // end of service
	
	// ����, ���� �� �˻� ���
	private void preSearch() {
		viewer.setView(search);
		viewer.display();
		// dao���� �˻��Ѵ�.
		DTO[] list = dao.select(dto);
		dtoList = list;
	}

}

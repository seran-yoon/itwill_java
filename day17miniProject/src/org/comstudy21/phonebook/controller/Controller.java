package org.comstudy21.phonebook.controller;

import static org.comstudy21.phonebook.R.*;
import org.comstudy21.phonebook.model.*;
import org.comstudy21.phonebook.view.*;

public class Controller {
	
	public void service(){
		
		View view = viewArr[menuNo];
		viewer.setView(view);
		
		if(menuNo==1){ //>>>�Է�
			viewer.display();
			//�Է� �� dao ȣ��
			dao.inputData(dto);
		} else if(menuNo==2){ //>>>���
			DTO[] list = dao.outputData();
			dtoList = list;
			//dao ȣ�� �� ���
			viewer.display();
		} else if(menuNo==3){ //>>>�˻� 
			viewer.display(); //�˻�� resource�� �����ϰ� ���ƿ� 
			//DAO���� �˻��ؼ� ����� ������
			//����� ������
			DTO[] list = dao.searchData(dto);
			dtoList = list;
			//�˻��� ����� ���
			viewer.setView(viewArr[2]); //��������� outputdata�� �������ұ� ������ ���� �������ʰ� ����
			viewer.display();
		} else if(menuNo==4){ //>>>����
			//modify�� ȣ���ϱ� ���� �����͸� �˻�
			searchData();
			
			viewer.setView(view);
			viewer.display();
			//�� �����͸� DAO�� ����
			dao.searchData(dto);
		} else if(menuNo==5){ //>>>����
			searchData();
			
			viewer.setView(view);
			viewer.display();
		} else{ //>>>����
			viewer.display();
		}
		
		service();
		
	}

	//����, ���� �� �˻�
	private void searchData() {
		viewer.setView(search);
		viewer.display();
		// dao���� �˻��Ѵ�.
		DTO[] list = dao.searchData(dto);
		dtoList = list;
	}

}

package org.comstudy21.phonebook.view;

import java.util.HashMap;

public interface View { //View�� ��ӹ��� �ڽ�Ŭ�������� ��� �����ϱ� ����
	
	//�ڽ�Ŭ�������� Show�޼ҵ��� HashMap�� ������ �ѹ��� �־��� -> �� ���� request�� ����
	void show(HashMap<String, Object> request); //��ӹ��� �ڽ�Ŭ������ �������� Show�޼ҵ�

}

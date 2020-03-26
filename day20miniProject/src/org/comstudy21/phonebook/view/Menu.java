package org.comstudy21.phonebook.view;

import java.util.HashMap;
import static org.comstudy21.phonebook.R.*;

public class Menu implements View {

	@Override
	public void show(HashMap<String, Object> request) {
		
		System.out.println("::: MENU :::");
		
		for(int i=1;i<menuStr.length;i++){
			System.out.println(i+"."+menuStr[i]+" ");
		}
		System.out.println(); //�ٹٲ� �뵵
		System.out.print("Choice >>> ");
		int no = sc.nextInt();
		
		while(no<1 || no>menuStr.length-1){ //�޴���ȣ���� ��ȣ�� �Է½� �ٽ� ��ȣ�� �ް� �ϴ� �ݺ���, �޴���ȣ�� ����� �Է��ϸ� �ݺ������� ���������� ��
			System.out.printf("%d~%d���� ���� �Է��ϼ��� \n", 1, menuStr.length);
			System.out.print("Choice >>> ");
			no = sc.nextInt();
		}
		
		//menuStr�迭���� key�� �����ͼ� request�� ����
		request.put("menuKey", menuStr[no]);
		
	}

}

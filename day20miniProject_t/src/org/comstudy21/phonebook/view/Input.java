package org.comstudy21.phonebook.view;

import java.util.HashMap;
import static org.comstudy21.phonebook.R.*;
import org.comstudy21.phonebook.model.PhonebookDto;

public class Input implements View {

	@Override
	public void show(HashMap<String, Object> request) {
		
		System.out.println("::: INPUT :::");
		
		//�Է� �޾Ƽ� R�� request�� "inputDto"�� ����
		PhonebookDto dto = new PhonebookDto();
		
		System.out.print("���� �Է� >>> ");
		dto.setName(sc.next());
		System.out.print("��ȭ��ȣ �Է� >>> ");
		dto.setPhone(sc.next());
		
		request.put("inputDto", dto); //Ű���� "inputDto", ������� ������ �Է¹��� dto�� request�� ����(put)�Ѵ�
		
	}

}

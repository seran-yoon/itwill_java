package org.comstudy21.phonebook.view;

import java.util.HashMap;
import static org.comstudy21.phonebook.R.*;
import org.comstudy21.phonebook.model.PhonebookDto;

public class Input implements View {

	@Override
	public void show(HashMap<String, Object> request) {
		
		System.out.println("::: INPUT :::");
		
		//입력 받아서 R의 request에 "inputDto"로 저장
		PhonebookDto dto = new PhonebookDto();
		
		System.out.print("성명 입력 >>> ");
		dto.setName(sc.next());
		System.out.print("전화번호 입력 >>> ");
		dto.setPhone(sc.next());
		
		request.put("inputDto", dto); //키값은 "inputDto", 밸류값은 위에서 입력받은 dto를 request에 저장(put)한다
		
	}

}

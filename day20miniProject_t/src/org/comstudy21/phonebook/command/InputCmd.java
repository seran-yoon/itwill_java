package org.comstudy21.phonebook.command;

import java.util.HashMap;
import static org.comstudy21.phonebook.R.*;
import org.comstudy21.phonebook.model.PhonebookDto;

public class InputCmd implements Command {

	@Override
	public String action(HashMap<String, Object> request) {
		System.out.println("### InputCmd ###");
		
		//View가 실행된 후에는 Dao를 호출하고 실행전에는 View를 실행하도록 제어한다
		System.out.println("### View 실행 후...");

		//Dao에 입력된 데이터를 추가한다
		if(request.get("inputDto") != null){
			//request의 value는 Object 타입이므로 사용할때는 다운캐스팅 필요
			PhonebookDto dto = (PhonebookDto)request.get("inputDto");
			dao.insert(dto);
			System.out.println("### 데이터 입력 완료");
		}
		request.put("inputChk", null);
		
		return INPUT;
	}

}

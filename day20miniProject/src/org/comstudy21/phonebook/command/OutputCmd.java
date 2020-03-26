package org.comstudy21.phonebook.command;

import java.util.HashMap;

import static org.comstudy21.phonebook.R.*;
import org.comstudy21.phonebook.model.DTO;

public class OutputCmd implements Command {

	@Override
	public String action(HashMap<String, Object> request) {
		
		System.out.println("### OUTPUTcmd");
		
		DTO[] arr = dao.selectAll();
		request.put("dtoArr", arr);
		
		return OUTPUT;
	}

}

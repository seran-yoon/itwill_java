package org.comstudy21.phonebook.view;

import java.util.HashMap;

import org.comstudy21.phonebook.model.DTO;

public class Output implements View {

	@Override
	public void show(HashMap<String, Object> request) {

		System.out.println("::: OUTPUT :::");
		
		if(request.get("dtoArr") != null){
			DTO[] arr = (DTO[])request.get("dtoArr");
			
			for(DTO dto : arr){
				System.out.println(dto);
			}
		}
		
	}

}

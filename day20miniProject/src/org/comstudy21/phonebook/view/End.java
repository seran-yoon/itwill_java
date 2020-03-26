package org.comstudy21.phonebook.view;

import java.util.HashMap;

public class End implements View {

	@Override
	public void show(HashMap<String, Object> request) {

		System.out.println("::: END :::");
		
		System.exit(0);
	}

}

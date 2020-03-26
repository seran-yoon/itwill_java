package org.comstudy21.phonebook.command;

import java.util.HashMap;

import org.comstudy21.phonebook.R;

public interface Command {

	//R클래스에 있는 상수의 값을, command인터페이스에 새로 선언한 String타입의 변수에 저장
	String INPUT = R.INPUT; 
	String OUTPUT = R.OUTPUT;
	String END = R.END;
	String MENU = R.MENU;
	
	String action(HashMap<String, Object> request);
	
}

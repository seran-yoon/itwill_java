package org.comstudy21.phonebook.view;

import java.util.HashMap;

public interface View { //View를 상속받은 자식클래스들을 묶어서 관리하기 위함
	
	//자식클래스들을 Show메소드의 HashMap을 선언해 한번에 넣어줌 -> 그 값을 request에 저장
	void show(HashMap<String, Object> request); //상속받은 자식클래스가 재정의할 Show메소드

}

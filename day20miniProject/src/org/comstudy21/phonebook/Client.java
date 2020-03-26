package org.comstudy21.phonebook;

import org.comstudy21.phonebook.controller.Controller;

public class Client {

	public static void main(String[] args) {
		new Controller().service(); //Controller클래스의 service메소드에서 리턴받아옴
	}
	
}

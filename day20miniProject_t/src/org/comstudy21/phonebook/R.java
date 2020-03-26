package org.comstudy21.phonebook;

import java.util.HashMap;
import java.util.Scanner;

import org.comstudy21.phonebook.command.*;
import org.comstudy21.phonebook.model.PhonebookDao;
import org.comstudy21.phonebook.view.*;


public class R {
	
	public static final Scanner sc = new Scanner(System.in);
	
	//여러번 써야해서 상수로 아예 만들어 두기
	public static final String INPUT = "input";
	public static final String OUTPUT = "output";
	public static final String END = "end";
	public static final String MENU = "menu";
	
	public static final String menuStr[] = { MENU, INPUT, OUTPUT, END }; //Menu클래스에서 메뉴를 깔끔하게 보여주기 위한 배열
	
	public static final HashMap<String, View> viewMap = new HashMap<>(); //key는 String타입, value는 View타입인 HashMap인스턴스를 만듬 - viewMap
	public static final HashMap<String, Command> cmdMap = new HashMap<>(); //key는 String타입, value는 Command타입인 HashMap인스턴스를 만듬 - cmdMap
	public static final HashMap<String, Object> request = new HashMap<>(); //key는 String타입, value는 Object타입인 HashMap인스턴스를 만듬 - request
	
	//static 초기화 영역
	static{
		viewMap.put(INPUT, new Input());
		viewMap.put(OUTPUT, new Output());
		viewMap.put(END, new End());
		viewMap.put(MENU, new Menu());
		
		cmdMap.put(INPUT, new InputCmd());
		cmdMap.put(OUTPUT, new OutputCmd());
		cmdMap.put(END, new EndCmd());
	}
	
	public static final Viewer viewer = new Viewer();

	public static final PhonebookDao dao = new PhonebookDao();
	
}

package org.comstudy21.phonebook;

import java.util.HashMap;
import java.util.Scanner;

import org.comstudy21.phonebook.command.Command;
import org.comstudy21.phonebook.command.EndCmd;
import org.comstudy21.phonebook.command.InputCmd;
import org.comstudy21.phonebook.command.OutputCmd;
import org.comstudy21.phonebook.model.DAO;
import org.comstudy21.phonebook.view.End;
import org.comstudy21.phonebook.view.Input;
import org.comstudy21.phonebook.view.Menu;
import org.comstudy21.phonebook.view.Output;
import org.comstudy21.phonebook.view.View;
import org.comstudy21.phonebook.view.Viewer;


public class R {
	
	//모든 클래스에서 scanner import를 안해줘도 사용 가능 하기 위함
	public static final Scanner sc = new Scanner(System.in);
	
	//자주쓰는 애들이라 상수로 변경해줌
	public static final String INPUT = "input";
	public static final String OUTPUT = "output";
	public static final String END = "end";
	public static final String MENU = "menu";
	
	//메뉴판 배열
	public static final String menuStr[] = { MENU, INPUT, OUTPUT, END};
	
	public static final HashMap<String, View> viewMap = new HashMap<>(); //키값은 String타입, 밸류값은 View에서 받아옴
	public static final HashMap<String, Command> cmdMap = new HashMap<>(); //키값은 String타입, 밸류값은 Command에서 받아옴
	public static final HashMap<String, Object> request = new HashMap<>(); //키값은 String타입, 밸류값은 Object(모든애들을 다 받아올 수 있음)에서 받아옴

	//앞에서 선언한 HashMap의 각각의 변수들을  static 으로 초기화
	static {
		viewMap.put(INPUT, new Input());
		viewMap.put(OUTPUT, new Output());
		viewMap.put(END, new End());
		viewMap.put(MENU, new Menu());
		
		cmdMap.put(INPUT, new InputCmd());
		cmdMap.put(OUTPUT, new OutputCmd());
		cmdMap.put(END, new EndCmd());
	}
	
	//Viewer타입의 참조변수 viewer를 static으로 생성
	public static final Viewer viewer = new Viewer();
	
	//DAO타입의 참조변수 dao를 static으로 생성
	public static final DAO dao = new DAO();
	
}

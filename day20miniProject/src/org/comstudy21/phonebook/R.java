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
	
	//��� Ŭ�������� scanner import�� �����൵ ��� ���� �ϱ� ����
	public static final Scanner sc = new Scanner(System.in);
	
	//���־��� �ֵ��̶� ����� ��������
	public static final String INPUT = "input";
	public static final String OUTPUT = "output";
	public static final String END = "end";
	public static final String MENU = "menu";
	
	//�޴��� �迭
	public static final String menuStr[] = { MENU, INPUT, OUTPUT, END};
	
	public static final HashMap<String, View> viewMap = new HashMap<>(); //Ű���� StringŸ��, ������� View���� �޾ƿ�
	public static final HashMap<String, Command> cmdMap = new HashMap<>(); //Ű���� StringŸ��, ������� Command���� �޾ƿ�
	public static final HashMap<String, Object> request = new HashMap<>(); //Ű���� StringŸ��, ������� Object(���ֵ��� �� �޾ƿ� �� ����)���� �޾ƿ�

	//�տ��� ������ HashMap�� ������ ��������  static ���� �ʱ�ȭ
	static {
		viewMap.put(INPUT, new Input());
		viewMap.put(OUTPUT, new Output());
		viewMap.put(END, new End());
		viewMap.put(MENU, new Menu());
		
		cmdMap.put(INPUT, new InputCmd());
		cmdMap.put(OUTPUT, new OutputCmd());
		cmdMap.put(END, new EndCmd());
	}
	
	//ViewerŸ���� �������� viewer�� static���� ����
	public static final Viewer viewer = new Viewer();
	
	//DAOŸ���� �������� dao�� static���� ����
	public static final DAO dao = new DAO();
	
}

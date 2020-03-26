package org.comstudy21.calculator;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;

public class CalculatorHomework extends MyFrame {
	
	private Panel pan = new Panel();
	private Panel menupan = new Panel(new GridLayout(1,3));
	private Panel viewpan = new Panel();
	private Panel calpan = new Panel();
	private Panel calpanleft = new Panel();
	private Panel calpan1 = new Panel(new GridLayout(5,4,3,3)); //가로세로 간격 3,3
	private Panel calpan2 = new Panel(new GridLayout(1,3,3,3)); //가로세로 간격 3,3
	private Panel calpan3 = new Panel(new GridLayout(5,1,3,3)); //가로세로 간격 3,3
	private Label lbl = new Label("버튼을 누르세요");
	
	private Button btn01 = new Button("보기");
	private Button btn02 = new Button("편집");
	private Button btn03 = new Button("도움말");
	
	private String[] calBtnStr = { "MC", "MR", "MS", "M+", "←", "CE", "C", "+-", "7", "8", "9", "/", "4", "5", "6", "*", "1", "2", "3", "-" };
	private Button[] calBtn = new Button[calBtnStr.length];
	
	private Button btn04 = new Button("0");
	private Button btn05 = new Button(".");
	private Button btn06 = new Button("+");
	
	private Button btn07 = new Button("M-");
	private Button btn08 = new Button("√");
	private Button btn09 = new Button("%");
	private Button btn10 = new Button("1/x");
	private Button btn11 = new Button("=");
	
	public CalculatorHomework() {
		init();
	}
	
	public void init() {
		setLayout(new BorderLayout());
		
		pan.add(menupan);
		pan.add(viewpan);
		pan.add(calpan);
		
		add(menupan, BorderLayout.NORTH);
		menupan.add(btn01);
		menupan.add(btn02);
		menupan.add(btn03);
		
		add(viewpan, BorderLayout.CENTER);
		viewpan.add(lbl);
		
//		add(calpan, BorderLayout.SOUTH);
//		calpan.add(calpanleft,BorderLayout.WEST);
//		calpanleft.add(calpan1,BorderLayout.NORTH);
//		calpanleft.add(calpan2,BorderLayout.SOUTH);
//		calpan.add(calpan3,BorderLayout.EAST);
		add(calpan, BorderLayout.SOUTH);
		calpan.add(calpanleft, BorderLayout.WEST);
		calpanleft.add(calpan1, BorderLayout.NORTH);
		calpanleft.add(calpan2, BorderLayout.SOUTH);
		calpan.add(calpan3, BorderLayout.EAST);

		for(int i=0;i<calBtnStr.length;i++){
			calBtn[i] = new Button(calBtnStr[i]);
			calpan1.add(calBtn[i]);
		}
		
		calpan2.add(btn04);
		calpan2.add(btn05);
		calpan2.add(btn06);
		
		calpan3.add(btn07);
		calpan3.add(btn08);
		calpan3.add(btn09);
		calpan3.add(btn10);
		calpan3.add(btn11);
		
	}

	public static void main(String[] args) {
		
		new CalculatorHomework().setVisible(true);;
		
	}

}

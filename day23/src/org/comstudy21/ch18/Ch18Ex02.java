package org.comstudy21.ch18;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import my_frame.MyFrame;

//Ch18Ex01�� ������, ButtonActionListnerŬ������ ���ΰ� �ƴ� �ܺη� �ؼ� btn�� �ܺ�Ŭ���������� ����� �� �ְ� ������

class ButtonActionListner implements ActionListener {
	
	private Ch18Ex02 r = new Ch18Ex02();
	
	public ButtonActionListner() { //����Ʈ ������
		
	}
	
	public ButtonActionListner(Ch18Ex02 r) { //Ch18Ex01�� ���� �� �ִ� ������
		this.r = r;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() instanceof Button){
			Button btn = (Button)e.getSource();
			if(btn == r.btn1){
				System.out.println("1�� ��ư�� ������!");
				r.label.setText("[���] : 1�� ��ư�� ������!"); //��â�� ������� �������� �ϱ�
			} else if(btn == r.btn2){
				System.out.println("2�� ��ư�� ������!");
				r.label.setText("[���] : 2�� ��ư�� ������!");

			} else{
				System.err.println("�� �� ���� ��ư�� ������!");
				r.label.setText("[���] : �� �� ���� ��ư�� ������!");
			}
			
		}
	}
	
}

public class Ch18Ex02 extends MyFrame {

	Label label = new Label();
	Button btn1 = new Button("��ư1");
	Button btn2 = new Button("��ư2"); //�ܺ�Ŭ���������� ����ؾ��ϱ� ������ private������ (public�� ���� setget�� ���������ϱ� ������ �׳� ������ ����)
	private Panel centerPan = new Panel(new FlowLayout());
	private Panel southPan = new Panel(new FlowLayout());
	
	public Ch18Ex02() {
		
		super(200,100);
		
		init();
		start();
		
	}

	//ȭ�� ���̾ƿ� ����
	private void init() {
		
		centerPan.add(label);
		southPan.add(btn1);
		southPan.add(btn2);

		this.add(centerPan, BorderLayout.CENTER);
		this.add(southPan, BorderLayout.SOUTH);
		
	}
	
	//�̺�Ʈ �����ʸ� ����ϴ� �Լ�
	public void start() {
		
		ActionListener l = new ButtonActionListner(this);
		btn1.addActionListener(l);
		btn2.addActionListener(l);
		
	}
	
	public static void main(String[] args) {
		
		new Ch18Ex01().setVisible(true);
		
	}

}
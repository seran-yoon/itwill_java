package org.comstudy21.ch17ex04;

import java.awt.Button;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import org.comstudy21.ch17ex01.MyFrame;

public class Ch17Ex05 extends MyFrame implements Runnable{

	private int x = 0; //x ����
	Button btn = new Button("������ ȸ��"); //��ư ����
	
	//����Ʈ ������
	public Ch17Ex05(){
		
	}
	
	public Ch17Ex05(int width, int height){
		super(width, height);
		setTitle("��ġ ������ ����");
		
		setLayout(null); //��ġ������(Layout)�� �ƿ� ����ΰ� ���� ���� �� �����ϱ� ����
		
		btn.setBounds(x, 120, 100, 22); //��ư�� ũ�� ����
		this.add(btn); //
		
		Thread thread = new Thread(this); // ��ư�� �����̰� �Ϸ��� ������ ������
		thread.start();
		
		//â �ݱ� �̺�Ʈ
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e){
				dispose(); //Frame�� ����
				System.exit(0); //�ý��� ��ü�� �ƿ� ����
			}
		});
	}
	

	@Override
	public void run() {
		int speed = 10;
		//���ѹݺ������� ����
		for(;;){
			try{
				Thread.sleep(28);
				x += speed;
				int width = getWidth();
				
				if(x>=width-btn.getWidth() || x<=0){
					speed = speed*(-1);
				}
				btn.setBounds(x, getHeight()-btn.getHeight()-10, 100, 22);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
		
	}
	
	
	public static void main(String[] args) {
		new Ch17Ex05(640, 480).setVisible(true);
	}

	
}

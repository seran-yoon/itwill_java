package org.comstudy21.ch22;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class Ch22Ex08 extends JFrame implements ListSelectionListener {
	
	JPanel contentPane = new JPanel(new BorderLayout());
	JList<String> list;
	JTextField tf;
	
	public Ch22Ex08() {
		
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setContentPane(contentPane);
		setSize(640, 480);
		
		init();
		start();
	
	}
	
	private void init(){
		
		String[] str = {"등산","윈드서핑","독서","수영","골프","영화","수학"};
		list = new JList<>(str);
		
		contentPane.add(new JLabel("취미를 선택하세요"), BorderLayout.NORTH);
		contentPane.add(list, BorderLayout.CENTER); //CENTER는 생략해도 상관없음, 생략하면 저절로 센터에 붙음
	
		tf = new JTextField();
		contentPane.add(tf, BorderLayout.SOUTH);

	}
	
	private void start(){
		
		list.addListSelectionListener(this);
	
	}
	
	@Override
	public void valueChanged(ListSelectionEvent e) {
		//선택된 항목을 저장하는 배열
		Object[] item;
		String total = "";
		
		JList<String> li =(JList<String>)e.getSource();
		
		item = li.getSelectedValues();
		
		for(int i=0;i<item.length;i++){
			total = total + item[i] + " ";
		}
		
		tf.setText(total+" 선택되었습니다");
		
	}
	
	public static void main(String[] args) {
		new Ch22Ex08().setVisible(true);
	}


}

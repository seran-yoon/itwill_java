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
		
		String[] str = {"���","���弭��","����","����","����","��ȭ","����"};
		list = new JList<>(str);
		
		contentPane.add(new JLabel("��̸� �����ϼ���"), BorderLayout.NORTH);
		contentPane.add(list, BorderLayout.CENTER); //CENTER�� �����ص� �������, �����ϸ� ������ ���Ϳ� ����
	
		tf = new JTextField();
		contentPane.add(tf, BorderLayout.SOUTH);

	}
	
	private void start(){
		
		list.addListSelectionListener(this);
	
	}
	
	@Override
	public void valueChanged(ListSelectionEvent e) {
		//���õ� �׸��� �����ϴ� �迭
		Object[] item;
		String total = "";
		
		JList<String> li =(JList<String>)e.getSource();
		
		item = li.getSelectedValues();
		
		for(int i=0;i<item.length;i++){
			total = total + item[i] + " ";
		}
		
		tf.setText(total+" ���õǾ����ϴ�");
		
	}
	
	public static void main(String[] args) {
		new Ch22Ex08().setVisible(true);
	}


}

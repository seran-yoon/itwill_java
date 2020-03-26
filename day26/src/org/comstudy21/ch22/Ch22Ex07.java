package org.comstudy21.ch22;

import java.awt.FlowLayout;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ch22Ex07 extends JFrame {

	JPanel contentPane = new JPanel(new FlowLayout()); //���� pan�� �⺻���� FlowLayout
	
	JCheckBox ch01 = new JCheckBox("���", true);
	JCheckBox ch02 = new JCheckBox("���弭��", false);
	JCheckBox ch03 = new JCheckBox("����", false);
	
	public Ch22Ex07() {
		
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setSize(640, 480);
		
		setContentPane(contentPane);
		
		init();
	
	}
	
	private void init() {
		
		contentPane.add(ch01);
		contentPane.add(ch02);
		contentPane.add(ch03);
		
	}
	
	public static void main(String[] args) {
		new Ch22Ex07().setVisible(true);
	}
	
}

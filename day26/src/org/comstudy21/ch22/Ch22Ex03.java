package org.comstudy21.ch22;

import javax.swing.JOptionPane;

public class Ch22Ex03 {

	public static void main(String[] args) {
		
		String name = JOptionPane.showInputDialog(null, "성명 입력 : ");
	
//		System.out.printf("입력받은 이름은 %s입니다", name);
		
		JOptionPane.showMessageDialog(null, "입력받은 이름 : "+name);
		
	}
	
}

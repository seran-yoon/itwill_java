package org.comstudy21.ch22;

import javax.swing.JOptionPane;

public class Ch22Ex05 {

	public static void main(String[] args) {
		
		String[] str = {"�����ϱ�","�ٽþ���","���"};
		String message = "���ϴ� �۾��� �����ϼ���";
		String title = "��ȭ����"; 
		
		int res = JOptionPane.showOptionDialog(null, message, title, JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, str, str[0]);
		
		System.out.println(res);
		
	}
	
}

package org.comstudy21.ch22;

import javax.swing.JOptionPane;

public class Ch22Ex04 {
	
	public static void main(String[] args) {
	
		int res = JOptionPane.showConfirmDialog(null, "�����Ͻðڽ��ϱ�?");
		
		System.out.println("res => "+res); // �� -> 0, �ƴϿ� -> 1, ��� -> 2
		
		if(res == 0){
			System.out.println("'��'�� ����");
		} else if( res == 1){
			System.out.println("'�ƴϿ�'�� ����");
		} else if(res == 2){
			System.out.println("'���'�� ����");
		}
		
	}
	
}

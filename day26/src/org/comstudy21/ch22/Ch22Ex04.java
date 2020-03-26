package org.comstudy21.ch22;

import javax.swing.JOptionPane;

public class Ch22Ex04 {
	
	public static void main(String[] args) {
	
		int res = JOptionPane.showConfirmDialog(null, "종료하시겠습니까?");
		
		System.out.println("res => "+res); // 예 -> 0, 아니오 -> 1, 취소 -> 2
		
		if(res == 0){
			System.out.println("'예'를 선택");
		} else if( res == 1){
			System.out.println("'아니오'를 선택");
		} else if(res == 2){
			System.out.println("'취소'를 선택");
		}
		
	}
	
}

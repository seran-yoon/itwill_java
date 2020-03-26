package org.comstudy21.ch22;

import javax.swing.JOptionPane;

public class Ch22Ex05 {

	public static void main(String[] args) {
		
		String[] str = {"가입하기","다시쓰기","취소"};
		String message = "원하는 작업을 선택하세요";
		String title = "대화상자"; 
		
		int res = JOptionPane.showOptionDialog(null, message, title, JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, str, str[0]);
		
		System.out.println(res);
		
	}
	
}

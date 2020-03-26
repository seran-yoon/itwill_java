package org.comstudy21.ch20;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Ch20Ex02 {

	public static void main(String[] args) {
		
		int data = 0;
		
		InputStream myIn = System.in; //InputStream 객체 변수에 Stream.in 대입
		OutputStream myOut = System.out; //OutputStream 객체 변수에 Stream.out 대입
		
		System.out.println("데이터를 입력 하세요. 끝내려면 [Ctrl]+Z를 누르세요");
		
		try{
			while((data=myIn.read()) != -1){ //반복문을 돌리다가 EOF(End of File)값이 -1이면 리턴하고 반복문 종료
				myOut.write(data);
			}
		}catch(IOException e){
			e.printStackTrace();
		}
		
	}
	
}

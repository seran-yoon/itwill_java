package org.comstudy21.ch20;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Ch20Ex02 {

	public static void main(String[] args) {
		
		int data = 0;
		
		InputStream myIn = System.in; //InputStream ��ü ������ Stream.in ����
		OutputStream myOut = System.out; //OutputStream ��ü ������ Stream.out ����
		
		System.out.println("�����͸� �Է� �ϼ���. �������� [Ctrl]+Z�� ��������");
		
		try{
			while((data=myIn.read()) != -1){ //�ݺ����� �����ٰ� EOF(End of File)���� -1�̸� �����ϰ� �ݺ��� ����
				myOut.write(data);
			}
		}catch(IOException e){
			e.printStackTrace();
		}
		
	}
	
}

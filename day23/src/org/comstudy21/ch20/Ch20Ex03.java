package org.comstudy21.ch20;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Ch20Ex03 { 
	
	static String file = "C:\\Users\\user\\workspace\\output.txt";
	static String file2 = "C:\\Users\\user\\workspace\\output2.txt";

	
	public static void main(String[] args) throws IOException { //file의 내용을 file2에 복사한다
		
		int data = 0;
		
		OutputStream myOut = System.out;
		InputStream myIn = System.in;
		FileInputStream fis = new FileInputStream(file);
		FileOutputStream fos = new FileOutputStream(file2);
		
		System.out.print("내용을 입력하세요 >>> ");
		while((data = myIn.read()) != -1){
			fos.write(data);
		}
		fos.close();
		System.out.println("파일 쓰기 완료!");
		
		
		while((data = fis.read()) != -1){
			fos.write(data);
			myOut.write(data);
		}
		
		fis.close();
		System.out.println("파일 읽기 완료!");
	}
	
	public static void test02(String[] args) throws IOException { //파일 읽기
		
		int data = 0;
		
		FileInputStream fis = null;
		OutputStream myOut = System.out;
		
		fis = new FileInputStream(file);
		
		while((data = fis.read()) != -1){
			myOut.write(data);
		}
		
		fis.close();
		System.out.println("파일 읽기 완료!");
		
	}

	public static void test01(String[] args) throws IOException { //파일 쓰기
		
		int data = 0;
		
		InputStream myIn = System.in;
		FileOutputStream fos = null;
		
		fos = new FileOutputStream(file); //지정된 주소로 메모장을 만들어 입력한 문자가 들어간 파일이 생성됨
		
		while((data = myIn.read()) != -1){
			fos.write(data);
		}
		
		fos.close(); //닫아주어야 쓰기 완료됨!!!!
		System.out.println("파일 쓰기 완료!");
		
	}
	
}

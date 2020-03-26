package org.comstudy21.ch20;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ch20Ex04 {
	
	public static void main(String[] args) throws IOException {
		
		int i = 0;
		
		File file = new File("sample.txt");

		FileReader fr = null;
		FileWriter fw = null;
		
		InputStreamReader isr = null;
		
		isr = new InputStreamReader(System.in);
		fw = new FileWriter(file, true);
		
		while((i=isr.read()) != -1) {
			fw.write(i);
		}
		
		fw.flush(); // 입력받은 버퍼를 파일에 내보내기
		
		fr = new FileReader(file); //읽기 위함
		
		while((i=fr.read())!=-1){
			System.out.println((char)i);
		}
	
		if(isr != null) isr.close();
		if(fr != null) fr.close();
		if(fw != null) fw.close();
		
	}

}

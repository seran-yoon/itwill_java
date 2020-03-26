package org.comstudy21.ch20;

import java.io.File;
import java.io.IOException;

public class Ch20Ex05 {

	public static void main(String[] args) throws IOException {

		String dir = "C:\\Users\\wdp\\workspace";
		String path = "testFile.txt";

		File file = new File(path); //file을 만들었다고 file이 생성되는것은 아님
		
		if(file.exists()){
			System.out.println("파일이 존재한다");
			if(file.delete()){
				System.out.println("파일이 제거되었다");
			}
		}else {
			System.out.println("파일이 없다");
			if(file.createNewFile()){
				System.out.println("새 파일이 생성 되었다");
			}
		}
		
		File directory = new File(dir);
		
		if(directory.isDirectory()){
			System.out.println("디렉토리입니다");
			
			String[] fileList = directory.list();
			
			for(String filename : fileList){
				System.out.println(filename);
			}
		}
		
	}

}

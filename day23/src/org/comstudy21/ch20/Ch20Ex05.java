package org.comstudy21.ch20;

import java.io.File;
import java.io.IOException;

public class Ch20Ex05 {

	public static void main(String[] args) throws IOException {

		String dir = "C:\\Users\\wdp\\workspace";
		String path = "testFile.txt";

		File file = new File(path); //file�� ������ٰ� file�� �����Ǵ°��� �ƴ�
		
		if(file.exists()){
			System.out.println("������ �����Ѵ�");
			if(file.delete()){
				System.out.println("������ ���ŵǾ���");
			}
		}else {
			System.out.println("������ ����");
			if(file.createNewFile()){
				System.out.println("�� ������ ���� �Ǿ���");
			}
		}
		
		File directory = new File(dir);
		
		if(directory.isDirectory()){
			System.out.println("���丮�Դϴ�");
			
			String[] fileList = directory.list();
			
			for(String filename : fileList){
				System.out.println(filename);
			}
		}
		
	}

}

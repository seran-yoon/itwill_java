package org.comstudy21.ch12_homework_T;

public class ��Ʈ�� {

public static void main(String[] args) {
		
		���� man = new ����();

		man.����(new ����(){
			public void play(){
				System.out.println("������ Į�� �ֵθ���!");
			}
		});
		
		
		man.����(new Ż��(){
			public void play(){
				System.out.println("������ ��ũ�� ź��!");
			}
		});
		
	
		man.����(new �����ķ�(){
			public void eat(){
				System.out.println("������ 2�� �����ķ��� �Դ´�!");
			}
		});
	
		
	}
}

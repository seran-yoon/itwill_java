package org.comstudy21.ch11ex02;

public class ������ {

	public static void test01(String[] args) { //��ĳ����
		�ҹ� p1 = new �ƹ�();
		
		p1.����(); //�ƹ� ����
		
		p1 = new ����();
		p1.����(); //���� ����
		
		p1 = new �ҹ�();
		p1.����(); //�ҹ� ����
	}
	
	
	public static void test02(String[] args) { //��ĳ����
		�ҹ�[] hArr = new �ҹ�[4];
		
		hArr[0] = new ����();
		hArr[1] = new �ҹ�();
		hArr[2] = new �ƹ�();
		hArr[3] = new ����();

		for(int i=0;i<hArr.length;i++){
			hArr[i].����();
		}
	}
	
	
	static void ������(�ҹ� person){ //�ٿ�ĳ����
		
		person.����();
		person.�ǾƳ�();
		
		if(person instanceof �ƹ�){
			((�ƹ�)person).�巳();
		}
		if(person instanceof ����){
			((����)person).��Ÿ();
		}
		
		
	}
	public static void main(String[] args) {
	
		������(new ����());
		������(new �ҹ�());
		������(new �ƹ�());
	
	}
}

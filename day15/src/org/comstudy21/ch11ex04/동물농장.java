package org.comstudy21.ch11ex04;

public class �������� {
	
	
	public static void test02(String[] args) {
		
		����[] aniArr = new ����[3];
		
		aniArr[0] = new ��();
		aniArr[1] = new �����();
		aniArr[2] = new ��();
		
		for(int i=0;i<aniArr.length;i++){
			if(aniArr[i] instanceof ��){
				((��)aniArr[i]).�Դ�();
			}
			if(aniArr[i] instanceof �����){
				((�����)aniArr[i]).�Դ�();
			}
			if(aniArr[i] instanceof ��){
				((��)aniArr[i]).�Դ�();
			}
		}
		
		
	}
	
	
	public static void main(String[] args) {
		
		���� ani = new ��("��");
		ani.�Ҹ�����();
		if(ani instanceof ��){
			((��)ani).�Ҹ�����();
		}
		ani.�Դ�();
		if(ani instanceof ��){
			((��)ani).�Դ�();
		}
		ani.�����̴�();
		if(ani instanceof ��){
			((��)ani).�����̴�();
		}
		
		ani = new �����("�����");
		ani.�Ҹ�����();
		if(ani instanceof �����){
			((�����)ani).�Ҹ�����();
		}
		ani.�Դ�();
		if(ani instanceof �����){
			((�����)ani).�Դ�();
		}
		ani.�����̴�();
		if(ani instanceof �����){
			((�����)ani).�����̴�();
		}
		
		ani = new ��("��");
		ani.�Ҹ�����();
		if(ani instanceof ��){
			((��)ani).�Ҹ�����();
		}
		ani.�Դ�();
		if(ani instanceof ��){
			((��)ani).�Դ�();
		}
		ani.�����̴�();
		if(ani instanceof ��){
			((��)ani).�����̴�();
		}
		
		
		
	}

}

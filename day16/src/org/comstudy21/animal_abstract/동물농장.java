package org.comstudy21.animal_abstract;

public class �������� {
	
	
	public static void addAnimal(����[] aniArr, ���� ani){  //�������� �迭�� �־��ֱ� ���� �Լ��� ���� 
		
		for(int i=0;i<aniArr.length;i++){
			if(aniArr[i] == null){
				aniArr[i] = ani;
				break;
			}
		}
	}
	
	public static void playAnimal(����[] aniArr){ //�迭�� ������ֱ� ���� �Լ��� ����
		for(���� ani : aniArr){
			ani.play();
			if(ani instanceof ��){
				((��)ani).����();
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		����[] aniArr = new ����[3];
		
		addAnimal(aniArr, new ��("������")); //�����ڸ� �����ϰ�, ���Ϲ޴� Ÿ�԰� ������ �� ������� Ȯ��! �׷��� �ۼ��� ���������� ���Ϲ��� �� ����
		addAnimal(aniArr, new �����("��"));
		addAnimal(aniArr, new ��("��"));
		
		playAnimal(aniArr);
	}
	
	
	

//	-------------------------------------------------------------------------------------
	
	
	
	public static void case01(String[] args) {
		
		���� ani = new ��();
		ani.play();
//		ani.����(); //���� Ŭ�������� ���� �޼ҵ尡 ���� ������ ȣ���� �ȵ�
		((��)ani).����(); //�ٿ�ĳ����
		
		ani = new �����();
		ani.play();
		((�����)ani).�ٴ�();
		
		ani = new ��();
		ani.play();
		((��)ani).���();
		
	}

}

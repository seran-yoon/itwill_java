package org.comstudy21.ch07;

//��Ź�� Ŭ���� ����
class ��Ź�� {
	private String name;
	private int kg;
	
	public void setName(String _name){
		name = _name;
	}
	
	public void setKg(int _kg){
		kg = _kg;
	}
	
	public void ��Ź(){
		System.out.println(name+" ��Ź�Ⱑ "+kg+"kg�� ������ ������.");
	}
	
	public void Ż��(){
		System.out.println(name+" Ż�� ���");
	}
	
}

public class Ch07Ex04 {

	public static void main(String[] args) {
		
		��Ź�� wm = new ��Ź��();
		
		wm.setName("�Ｚ ��Ź��");
		wm.setKg(100);
		
		wm.��Ź(); //�Ｚ ��Ź�Ⱑ 100kg�� ������ ������
		wm.Ż��(); //�Ｚ ��Ź�� Ż�� ���
		
	}

}

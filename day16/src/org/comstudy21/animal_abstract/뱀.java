package org.comstudy21.animal_abstract;

public class �� extends ����{

	String ����;
	
	public ��(){}
	
	public ��(String ����){
		this.���� = ����;
	}

	@Override
	public void �Ҹ�����() {
		System.out.println("����~~");
	}

	@Override
	public void �Դ�() {
		System.out.println("���� "+����+"�� �Դ�");
		System.out.println("�ܲ�~!");
	}

	@Override
	public void �����̴�() {
		���();
		System.out.println("����");
	}
	
	public void ���() {
		System.out.println("*���� ����*");
	}

}

package org.comstudy21.animal_abstract;

public class �� extends ����{
	
	String ����;
	
	//�����ڴ� ���ϰ��� �޾ƾ� �Ҷ� �� ��������� �� -> �������� Ŭ�������� new ��("������")�̶�� �������ִ� ���� ��������� ������ ������ �ʿ�
	public ��(){}
	
	public ��(String ����){
		this.���� = ����;
	}

	@Override
	public void �Ҹ�����() {
		System.out.println("������~");
	}

	@Override
	public void �Դ�() {
		System.out.println("���� "+����+"�� �Դ�");
		System.out.println("�������� ������!");
	}

	@Override
	public void �����̴�() {
		����();
		System.out.println("Ǫ���~");
	}
	
	public void ����() {
		System.out.println("*���� ����*");
	}

	
	
}

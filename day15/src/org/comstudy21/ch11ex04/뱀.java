package org.comstudy21.ch11ex04;

public class �� extends ����{

private String ����;
	
	public ��(){
		
	}
	
	public ��(String ����){
		this.���� = ����;
	}

	public String get����() {
		return ����;
	}

	public void set����(String ����) {
		this.���� = ����;
	}

	public void �Ҹ�����(){
		super.set�̸�("������");
		System.out.println("�� => " + super.get�̸�());
	}

	
	public void �����̴�(){
		super.set�̸�("���");
		System.out.println("�� => " + super.get�̸�());
	}
	
	public void �Դ�(){
		super.set�̸�("��");
		System.out.println("�� => " + super.get�̸�());
	}
	
//	public void �Ҹ�����(String ����){
//		this.���� = ����;
//		this.�Ҹ�����();
//	}
//	
//	public void �����̴�(String �̸�){
//		this.���� = ����;
//		this.�����̴�();
//	}
//	
//	public void �Դ�(String �̸�){
//		this.���� = ����;
//		this.�Դ�();
//	}
}

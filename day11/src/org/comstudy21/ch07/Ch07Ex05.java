package org.comstudy21.ch07;

class �ڵ��� {
	private String type;
	private int km;
	private String color;
	
	//������ - constructor
	//����Ÿ���� ����.
	//Ŭ���� �̸��� ������ �ĺ��ڸ� ���´�.
	//���� ���� ���� ������ ����Ʈ �����ڸ� �����Ϸ��� �߰� ���ش�.
	//�����ڵ� �޼ҵ��̴� - �Ϲ� �޼ҵ尡 ������ Ư¡�� ��� ������.
	
	// ������ �����ε� �Ҷ� ����Ʈ �����ڵ� �ʼ��� �߰� �ؾ� �Ѵ�.
	public �ڵ���() {
		// �Ű������� ������ ����Ʈ �������̴�.
	} //car
		
	// ������ �޼ҵ� �����ε� ...
	public �ڵ���(String type, int km, String color){
		//�������� ���� : �����  �ʱ�ȭ�Ѵ�
		this.type=type;
		this.km=km;
		this.color=color;
	} //car2
	
	public �ڵ���(String type, int km){
		this(type,km,"����");
	}//car3
	
	
	//�� ������ �ش��ϴ� ���� �־��ֱ� ���� �޼ҵ� ����
	public void set����(String _type){
		//this�� ��ü �ڽ��̴�
		//this.type = type; //�̷��� ���� �ʵ����� type�� �˾Ƽ� �νĵǱ⶧���� �����̸��� �����ϰ� �൵ �������
		type = _type;
	}
	
	public void set�ӵ�(int _km){
		km = _km;
	}
	
	public void set����(String _color){
		color = _color;
	} 
	
	//����� ���� �޼ҵ�
	public void run(){
		System.out.println(color+" "+type+"�� "+km+"Ű�η� �޸���.");
	}
}

public class Ch07Ex05 {

	public static void main(String[] args) {
		
		�ڵ��� car = new �ڵ���();
		car.set����("���������");
		car.set�ӵ�(250);
		car.set����("���ֻ�");
		car.run(); //���ֻ� ��������ϰ� 250Ű�η� �޸���.
		
		�ڵ��� car2 = new �ڵ���("���",300,"������");
		car2.run(); //������ ��󸮰� 300Ű�η� �޸���.
		
		�ڵ��� car3 = new �ڵ���("�ҳ�Ÿ",180);
		car3.run(); //���� �ҳ�Ÿ�� 180Ű�η� �޸���.
	}

}

package day12;

class Circle{ //Circle class ����
	int radius; //������ �ʵ�
	String name; //�̸� �ʵ�
	
	//������
	public Circle(){
		
	} //�Ű������� ���� �������̱� ������ ����Ʈ ������
		
	//�޼ҵ�
	public double getArea(){ //���ϰ��� ������ ���Ϲ޴� ������ Ÿ�԰� ������ Ÿ���� ��������� �� //���Ϲ޴� ���� double���̾ void�� �ƴ� double
		//���� ���� ���
		return 3.14*radius*radius; //3.14*������*������ �� ���� ��ȯ�ض�(����)
	}
}

public class day0904_circleClass_1 {
	public static void main(String[] args) {
		
		Circle pizza = new Circle(); //Circle class�� pizza ��ü ����
		pizza.radius = 10; //*************************>> Circle class���� �ʵ带 �������ٶ� private�� ������ ������ main���� ���������� class�� �ִ� �ʵ� ������ �������� �� ����
		pizza.name = "�ڹ�����";
		double area = pizza.getArea(); //getArea���� ���Ϲ��� ���� area�� �ֱ�
		System.out.println(pizza.name+"�� ������ "+area);
		
		Circle donut = new Circle(); //Circle class�� donut ��ü ����
		donut.radius = 2;
		donut.name = "�ڹٵ���";
		area = donut.getArea(); //getArea���� ���Ϲ��� ���� area�� �ֱ�
		System.out.println(donut.name+"�� ������ "+area);
	}
}

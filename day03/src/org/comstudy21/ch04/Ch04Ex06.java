package org.comstudy21.ch04;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthSliderUI;

public class Ch04Ex06 {
	//���� ���� �����ұ�?
	//�Լ� �ۿ� �����ϴ� ������ Ŭ������ ��� �ʵ��� �Ѵ�
	static Scanner sc = new Scanner(System.in); //static ���̴� ������  static �پ��ִ� ������ ���� ����
	
	public static void main(String[] args) {
		// switch~case ��
		
		//1.ȭ�� 2.�ݼ� 3.�� 4.����
		//���� : 2
		//�ݼ����� ������
		
		System.out.println("1.ȭ�� 2.�ݼ� 3.�� 4.����");
		System.out.print("choice >>> ");
		
		int no = sc.nextInt();
		
		switch(no){
		case 1 : System.out.println("ȭ������ ������"); break;
		case 2 : System.out.println("�ݼ����� ������"); break;
		case 3 : System.out.println("������ ������"); break;
		case 4 : System.out.println("������ ������"); break;
		default : System.out.println("�ȵ�θ޴ٷ� ������");
		} //ctrl + shift + f ������ ���� �ٲ�


	}
}

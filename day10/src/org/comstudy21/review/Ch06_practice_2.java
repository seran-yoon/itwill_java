package org.comstudy21.review;

public class Ch06_practice_2 {

	public static void Q1(String[] args) {
		
		//������ r = 4
		areaf(4);
		roundf(4);
		
	}

	static void areaf(int r){
		
 		final double PI = 3.141592;

		double area = r*r*PI;
		
		System.out.printf("�������� %d��  ���� ���̴�  %f�̴�\n", r, area);
	}
	
	static void roundf(int r){
		
 		final double PI = 3.141592;

 		double round = 2*PI*r;
		
		System.out.printf("�������� %d��  ���� �ѷ��� ���̴�  %f�̴�", r, round);	
	}
	
	
	
	//-----------------------------------------
	
	
	public static void main(String[] args) { //��� �̻���
		
		String num = "";
		
		for(int pn=1;pn<=100;pn++){
			num = primeNumber(pn);
			if(num == "true"){
				System.out.print(pn+" ");
			}
		}
	
	}
	
	static String primeNumber(int pn){
		
		String num = "" ;
		
		if(pn%1!=0 && pn%pn!=0 && pn!=1){
			num = "true";
		} else {
			num = "false";
		}
		
		return num;
	}
	
	
}

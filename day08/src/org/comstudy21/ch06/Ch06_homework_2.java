package org.comstudy21.ch06;

import java.util.Scanner;

public class Ch06_homework_2 {

	public static void main(String[] args) {
		//������� �Է� ���α׷�
		//5���� ������ �Է� �޾Ƽ� ����ϴ� ���α׷�
		//�Է»��� : ����, ��������, ��������, ��������
		//��»��� : �л��� ���� ����, �л��� ���� ���, �л��� ����� ����, �л��� ���(������� ����)
		
		Scanner sc = new Scanner(System.in);

		String[] name = new String[5];
		int[] kor = new int[5];
		int[] eng = new int[5];
		int[] mat = new int[5];
		
		int[] total = new int[5];
		double[] avg = new double[5];
		String[] grade = new String[5];
		int[] rank = new int[5];
		int i = 0;
		
		for(i=0;i<5;i++){
			System.out.print("�̸� : ");
			name[i] = sc.next();
			System.out.print("�������� : ");
			kor[i] = sc.nextInt();
			System.out.print("�������� : ");
			eng[i] = sc.nextInt();
			System.out.print("�������� : ");
			mat[i] = sc.nextInt();
			
			total[i] = kor[i]+eng[i]+mat[i];
			avg[i] = total[i]/3;
			
			if(avg[i]>=90){
				grade[i]="A";
			} else if(avg[i]>=80){
				grade[i]="B";
			} else if(avg[i]>=70){
				grade[i]="C";
			} else if(avg[i]>=60){
				grade[i]="D";
			} else {
				grade[i]="F";
			}
			
			//grade���� switch������ �ϴ� ���
			/*
			 
			 */
			
			
		}
		
		for(i=0;i<rank.length;i++){
			rank[i]=1;
			for(int j=0;j<rank.length;j++){
				if(avg[i]<avg[j]){
					rank[i]+=1;
				} else if(avg[j]>avg[i]){
					rank[j]+=1;
				} else{ //avg[j]=avg[i] �� ����� ���� ���� �ƹ��͵� ������
					continue; 
				}
			}
			System.out.println("["+name[i]+"]"+"�� ����ǥ >>> ���� : "+total[i]+" ��� : "+avg[i]+" ���� : "+grade[i]+" ��� : "+rank[i]);
		}
	}	
}

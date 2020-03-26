package org.comstudy21.ch06;

import java.util.Scanner;

public class Ch06_homework_3 {
	
	static final int MAX = 5;
	static Scanner sc = new Scanner(System.in);

	
	static void inPut(String name[], int kor[], int eng[], int mat[], int i) {
		
		System.out.print("�̸� : ");
		name[i] = sc.next();
		System.out.print("�������� : ");
		kor[i] = sc.nextInt();
		System.out.print("�������� : ");
		eng[i] = sc.nextInt();
		System.out.print("�������� : ");
		mat[i] = sc.nextInt();
	}
	
	static void calTotal(int total[], int kor[], int eng[], int mat[], int i){
		total[i] = kor[i]+eng[i]+mat[i];
	}
	
	static void calAvg(double avg[], int total[], int i){
		avg[i] = total[i]/3;
	}
	
	static void calGrade(String grade[], double avg[], int i){
		
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
	}
	
	static void calRank(int rank[], double avg[], int i, int j){
		
		for(i=0;i<rank.length;i++){
			rank[i] = 1;

			for (j=0;j<rank.length;j++) {
				if(avg[i]<avg[j]) {
					rank[i] += 1;
				} else if(avg[j]>avg[i]) {
					rank[j] += 1;
				} else { // avg[j]=avg[i] �� ����� ���� ���� �ƹ��͵� ������
					continue;
				}
			}
		}
	}
	
	static void outPut(String name[], int total[], double avg[], String grade[], int rank[], int i){
		for(i=0;i<rank.length;i++){
			System.out.println("["+name[i]+"]"+"�� ����ǥ >>> ���� : "+total[i]+" ��� : "+avg[i]+" ���� : "+grade[i]+" ��� : "+rank[i]);
		}
	}

	
	public static void main(String[] args) {
		//����� �Լ��� �ִ��� ���� ���� ������� ���α׷��� �ٽ� �����ϱ�

		String[] name = new String[MAX];
		int[] kor = new int[MAX];
		int[] eng = new int[MAX];
		int[] mat = new int[MAX];
		
		int[] total = new int[MAX];
		double[] avg = new double[MAX];
		String[] grade = new String[MAX];
		int[] rank = new int[MAX];	
		int i = 0, j = 0;
		
		for(i=0;i<MAX;i++){
			inPut(name, kor, eng, mat, i);
			calTotal(total, kor, eng, mat, i);
			calAvg(avg, total, i);
			calGrade(grade, avg, i);
		}
		
		calRank(rank, avg, i, j);
		outPut(name, total, avg, grade, rank, i);	
	}
}

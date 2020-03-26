package org.comstudy21.ch06;

import java.util.Scanner;

public class Ch06_homework_2 {

	public static void main(String[] args) {
		//성적출력 입력 프로그램
		//5명의 성적을 입력 받아서 출력하는 프로그램
		//입력사항 : 성명, 국어점수, 영어점수, 수학점수
		//출력사항 : 학생별 과목 총점, 학생별 과목 평균, 학생별 평균의 학점, 학생별 등수(등수별로 정렬)
		
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
			System.out.print("이름 : ");
			name[i] = sc.next();
			System.out.print("국어점수 : ");
			kor[i] = sc.nextInt();
			System.out.print("영어점수 : ");
			eng[i] = sc.nextInt();
			System.out.print("수학점수 : ");
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
			
			//grade산출 switch문으로 하는 방법
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
				} else{ //avg[j]=avg[i] 두 평균이 같을 때는 아무것도 안해줌
					continue; 
				}
			}
			System.out.println("["+name[i]+"]"+"의 성적표 >>> 총점 : "+total[i]+" 평균 : "+avg[i]+" 학점 : "+grade[i]+" 등수 : "+rank[i]);
		}
	}	
}

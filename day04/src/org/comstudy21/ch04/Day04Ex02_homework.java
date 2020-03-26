package org.comstudy21.ch04;

import java.util.Random;
import java.util.Scanner;

public class Day04Ex02_homework {

	public static void test01(String[] args) {
		//난수 발생기  Math.random(); -> 1보다 작은 실수만 나옴  -> double로 선언 //Math.abs(); -> 절대값(혹시 음수가 나올 수 있으니 양수만 나오도록 변경)

		
		double num = Math.random();
		
		//1부터 99까지의 난수 발생
		System.out.println(1+Math.abs((int)(num*100))); //*100하면 100은 절대 안나옴 -> 100까지의 작은 수이기 때문
		
		
		//15~45의 난수 발생
		//15+Math.abs((int)(Math.random()*31));
		
	}
	
	public static void test02(String[] args) {
		//Math.random 다 안쓰고 Scanner처럼 import 해줘서 바로 사용 가능
		
		Random rand = new Random();
		
		int num = rand.nextInt(100);
		double num2 = rand.nextDouble();
		
		System.out.println("num => "+num);
		System.out.println("num2 => "+num2);		
	}

	
	public static void main(String[] args) {
		//난수 발생기를 이용한 게임 구현 -> 높다 낮다 게임
		//컴퓨터가 난수를 발생시키고 사용자가 5회 시도 안에 난수를 맞추는 게임
		//범위 벗어나면 다시 입력받게 해야하고, 5회 끝나서도 못맞추면 다시 시작
		//난수발생 먼저하고(출력은 안함) 입력 받은후 맞추면  맞았다고 출력뜨게
		
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		
		int min = 1, max = 100; //범위
		int cnt = 5;
		char yn = 'y';
		
		int sysNum = min + rand.nextInt(max);
		
		for(int i=1;i<=cnt;i++){
			System.out.print("1~100사이의 숫자를 맞춰주세요! >>> ");
			int userNum = sc.nextInt();
			
			if (userNum < min || userNum > max) {
				System.out.println("잘못된 범위입니다! 다시 입력해주세요!");
			} else if (userNum != sysNum) {
				if (userNum > sysNum) {
					max = userNum-1;
					System.out.println("틀렸습니다!" + userNum + "보다 작은 수 입니다! " + min + "~" + max + "의 수를 입력해주세요");
				} else { //userNum<sysNum
					min = userNum+1;
					System.out.println("틀렸습니다!" + userNum + "보다 큰 수 입니다! " + min + "~" + max + "의 수를 입력해주세요");
				}
				if (i==cnt) { //5번 횟수를 초과했을때 게임을 재시도 할지, 아닐지 결정하는 if문
					System.out.println("5번의 횟수를 초과했습니다! 정답은 " + sysNum + "입니다");
					System.out.print("게임을 다시 시작하겠습니까? (y/n)");
					
					yn = sc.next().charAt(0);
					
					if (yn == 'y') {
						i = 0;
						min = 1;
						max = 100;
						sysNum = min + rand.nextInt(max);
					} else if(!(yn=='y' || yn=='n')) {
					    System.out.println("y또는 n만 입력하세요");
					    System.out.print("계속 하시겠습니까? (y/n) ");
					    yn = sc.next().charAt(0);						
					} else { //yn == 'n'
						System.out.println("게임을 종료합니다");
					}
					
				}
			} else { //userNum == sysNum
				System.out.println("맞았습니다!");
				break;
			}
		}
	}
	
	
	
	
}

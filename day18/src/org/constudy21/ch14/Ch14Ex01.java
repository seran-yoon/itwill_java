package org.constudy21.ch14;

//멀티 쓰레드 
//MyThread클래스와 main클래스 동시에 진행

class MyThread extends Thread {
	@Override
	public void run() {
		int i = 0;

		while (i < 100) {
			try {
				Thread.sleep(10); // 0.01초 마다 일시정지
			} catch (InterruptedException e) {
				e.printStackTrace();
			} // 일시정지하는 문장(얘네를 빼버리면 한번에 다 출력됨 시간을 딜레이 시켜주는 역할을 함)

			System.out.println("MyThread -> " + i);

			i++;
		}
	}
}

public class Ch14Ex01 {

	public static void main(String[] args) {
		Thread t = new MyThread();
		t.start();

		int i = 0;

		while (i < 100) {
			try {
				Thread.sleep(10); // 0.01초 마다 일시정지
			} catch (InterruptedException e) {
				e.printStackTrace();
			} // 일시정지하는 문장(얘네를 빼버리면 한번에 다 출력됨 시간을 딜레이 시켜주는 역할을 함)

			System.out.println("main -> " + i);

			i++;
		}
	}

}

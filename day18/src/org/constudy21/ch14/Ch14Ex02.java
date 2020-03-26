package org.constudy21.ch14;

class MyThread2 extends Thread {

	// run메소드 재정의
	@Override
	public void run() { // 쓰레드 재정의
		int i = 0;
		while (i < 100) {
			// 일시정지하는 try-catch문 만들기
			try {
				Thread.sleep(100);
				if(i==10){
					synchronized (this) { //동시성 오류 방지용 (비동기 -> 동기)
						//this.wait(1000);
						this.wait();
					}
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			System.out.println("run() -> " + this.getName() + ":" + i);

			i++;
		}

	}
}

public class Ch14Ex02 {

	public static void main(String[] args) {
		// 쓰레드 객체 생성 및 실행
		Thread t = new MyThread2();
		
		t.start();
		
		int i = 0;
		while (i < 100) {
			// 일시정지하는 try-catch문 만들기
			try {
				Thread.sleep(100);
				if(i==30){
					synchronized (t) { // synchronized -> 동기화할 객체 또는 클래스명
						t.notify(); //같은 쓰레드의 입장에서 다른 쓰레드에게 멈추라고 명령할 수 없기 때문에 에러 //에러를 잡기위해서 synchronized 작성
					}
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			System.out.println("main => " + Thread.currentThread().getName()); // main은 this없음 왜냐면 static을 쓰기 때문

			i++;
		}
	}

}

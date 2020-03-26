package org.constudy21.ch14;

// 30번째일때 멈추고 60번일때 다시 돌아가게
// main ->30  thread ->멈추고, main ->60 thread ->다시 시작 (main은 계속 돌아감)

class MyThread3 extends Thread {
	
	boolean b = false;

	public void Notify(boolean b) {
		this.b = b;
		if (!b) { // b가 true일때 다시 재진행
			synchronized (this) {
				this.notify();
			}
		}
	}

	@Override
	public void run() {

		int i = 0;
		while (i < 100) {
			try {
				Thread.sleep(100);
				if (b) { //b가 false일때 멈추기
					synchronized (this) { 
						this.wait();
					}
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			System.out.println("MyThread3 -> " + i);

			i++;
		}
	}
	
}

public class Ch14Ex03 {
	
	public static void main(String[] args) {

		MyThread3 t = new MyThread3();
		t.start();

		int i = 0;
		while (i < 100) {
			try {
				if(i==30){ //main이 30일때
					t.Notify(true);
				}
				if(i==60){ //main이 60일때
					t.Notify(false);
				}
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			System.out.println("main -> " + i); 

			i++;
		}
	}

}

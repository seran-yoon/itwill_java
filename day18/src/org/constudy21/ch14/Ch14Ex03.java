package org.constudy21.ch14;

// 30��°�϶� ���߰� 60���϶� �ٽ� ���ư���
// main ->30  thread ->���߰�, main ->60 thread ->�ٽ� ���� (main�� ��� ���ư�)

class MyThread3 extends Thread {
	
	boolean b = false;

	public void Notify(boolean b) {
		this.b = b;
		if (!b) { // b�� true�϶� �ٽ� ������
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
				if (b) { //b�� false�϶� ���߱�
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
				if(i==30){ //main�� 30�϶�
					t.Notify(true);
				}
				if(i==60){ //main�� 60�϶�
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

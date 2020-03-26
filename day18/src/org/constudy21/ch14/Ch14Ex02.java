package org.constudy21.ch14;

class MyThread2 extends Thread {

	// run�޼ҵ� ������
	@Override
	public void run() { // ������ ������
		int i = 0;
		while (i < 100) {
			// �Ͻ������ϴ� try-catch�� �����
			try {
				Thread.sleep(100);
				if(i==10){
					synchronized (this) { //���ü� ���� ������ (�񵿱� -> ����)
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
		// ������ ��ü ���� �� ����
		Thread t = new MyThread2();
		
		t.start();
		
		int i = 0;
		while (i < 100) {
			// �Ͻ������ϴ� try-catch�� �����
			try {
				Thread.sleep(100);
				if(i==30){
					synchronized (t) { // synchronized -> ����ȭ�� ��ü �Ǵ� Ŭ������
						t.notify(); //���� �������� ���忡�� �ٸ� �����忡�� ���߶�� ����� �� ���� ������ ���� //������ ������ؼ� synchronized �ۼ�
					}
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			System.out.println("main => " + Thread.currentThread().getName()); // main�� this���� �ֳĸ� static�� ���� ����

			i++;
		}
	}

}

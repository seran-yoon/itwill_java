package org.constudy21.ch14;

//��Ƽ ������ 
//MyThreadŬ������ mainŬ���� ���ÿ� ����

class MyThread extends Thread {
	@Override
	public void run() {
		int i = 0;

		while (i < 100) {
			try {
				Thread.sleep(10); // 0.01�� ���� �Ͻ�����
			} catch (InterruptedException e) {
				e.printStackTrace();
			} // �Ͻ������ϴ� ����(��׸� �������� �ѹ��� �� ��µ� �ð��� ������ �����ִ� ������ ��)

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
				Thread.sleep(10); // 0.01�� ���� �Ͻ�����
			} catch (InterruptedException e) {
				e.printStackTrace();
			} // �Ͻ������ϴ� ����(��׸� �������� �ѹ��� �� ��µ� �ð��� ������ �����ִ� ������ ��)

			System.out.println("main -> " + i);

			i++;
		}
	}

}

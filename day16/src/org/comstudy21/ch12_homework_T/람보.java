package org.comstudy21.ch12_homework_T;

public class ���� {
	
	private Box wp;
	
	public void ����(Box wp) {
		this.wp = wp;
		
		if(wp instanceof ����) {
			run((����)wp);
		}
		if(wp instanceof Ż��) {
			run((Ż��)wp);
		}
		if(wp instanceof �����ķ�) {
			run((�����ķ�)wp);
		}
		
//		if(wp instanceof ����){
//			((����)wp).play();
//		}
//		if(wp instanceof Ż��){
//			((Ż��)wp).play();
//		}
//		if(wp instanceof �����ķ�){
//			((�����ķ�)wp).eat();
//		}
		
	}
	
	private void run(���� wp){
		wp.play();
	}
	private void run(Ż�� wp){
		wp.play();
	}
	private void run(�����ķ� wp){
		wp.eat();
	}

}

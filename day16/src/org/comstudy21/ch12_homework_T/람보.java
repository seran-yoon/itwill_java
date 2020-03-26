package org.comstudy21.ch12_homework_T;

public class 람보 {
	
	private Box wp;
	
	public void 실행(Box wp) {
		this.wp = wp;
		
		if(wp instanceof 무기) {
			run((무기)wp);
		}
		if(wp instanceof 탈것) {
			run((탈것)wp);
		}
		if(wp instanceof 전투식량) {
			run((전투식량)wp);
		}
		
//		if(wp instanceof 무기){
//			((무기)wp).play();
//		}
//		if(wp instanceof 탈것){
//			((탈것)wp).play();
//		}
//		if(wp instanceof 전투식량){
//			((전투식량)wp).eat();
//		}
		
	}
	
	private void run(무기 wp){
		wp.play();
	}
	private void run(탈것 wp){
		wp.play();
	}
	private void run(전투식량 wp){
		wp.eat();
	}

}

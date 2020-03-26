package org.comstudy21.ch12;

public class TvClient {

	public static void main(String[] args) {
		
		Tv tv = new LgTv(new SpeakerImpl());
		tv.run();
		
		tv = new LgTv(new Speaker(){
			@Override
			public void sound(){
				System.out.println("���� ����Ŀ�� ����ȴ�");
			}
		});
		tv.run();
	
	}

}

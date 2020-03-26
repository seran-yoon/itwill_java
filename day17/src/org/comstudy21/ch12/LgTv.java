package org.comstudy21.ch12;

public class LgTv extends Tv {
	
	private Speaker Speaker;
	
	public LgTv(Speaker speaker) {
		this.Speaker = speaker;
	}

	@Override
	public void sound() {
		Speaker.sound();
	}

}

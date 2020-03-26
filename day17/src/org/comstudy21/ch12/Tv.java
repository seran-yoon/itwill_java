package org.comstudy21.ch12;

public abstract class Tv implements Speaker {
	
	public void run(){
		System.out.println("tv가 실행된다!");
		sound();
	}

}

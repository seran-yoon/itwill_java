package org.comstudy21.ch07;

//¼¼Å¹±â Å¬·¡½º ¼±¾ð
class ¼¼Å¹±â {
	private String name;
	private int kg;
	
	public void setName(String _name){
		name = _name;
	}
	
	public void setKg(int _kg){
		kg = _kg;
	}
	
	public void ¼¼Å¹(){
		System.out.println(name+" ¼¼Å¹±â°¡ "+kg+"kgÀÇ »¡·¡¸¦ µ¹¸°´Ù.");
	}
	
	public void Å»¼ö(){
		System.out.println(name+" Å»¼ö ±â´É");
	}
	
}

public class Ch07Ex04 {

	public static void main(String[] args) {
		
		¼¼Å¹±â wm = new ¼¼Å¹±â();
		
		wm.setName("»ï¼º ¼¼Å¹±â");
		wm.setKg(100);
		
		wm.¼¼Å¹(); //»ï¼º ¼¼Å¹±â°¡ 100kgÀÇ »¡·¡¸¦ µ¹¸°´Ù
		wm.Å»¼ö(); //»ï¼º ¼¼Å¹±â Å»¼ö ±â´É
		
	}

}

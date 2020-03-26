package org.comstudy21.ch07;

class Music{
	private String singer;
	private String song;
	
	public Music(){
		
	}
	
	public Music(String singer, String song){
		this.singer=singer;
		this.song=song;
	}

	//각 변수에 해당하는 값을 넣어주기 위한 메소드 생성
	public void setSinger(String singer){
		this.singer=singer;
	}
	
	public void setSong(String song){
		this.song=song;
	}
	
	//출력을 위한 메소드
	public void play(){
		System.out.println(singer+"(이)가 "+song+" 을 부른다");
	}
}


class MusicPlayer {
	
	final int Max = 10;
	Music[] musicArr = new Music[Max];
	int top = 0;
	
	public void add(Music music){
		if(top>=Max) {
			System.out.println("더이상 추가 불가능");
			return;
		}
		musicArr[top++] = music;
	}
	
	public void musicPlay(){
		for(int i=0; i<top; i++){
			musicArr[i].play();
		}
	}
	
//	public void musicPlay(int top, Music[] musicArr){
//		for(int i=0; i<top; i++){
//			musicArr[i].play();
//		}
//	}
	

}


public class Ch07Ex06 {
	public static void main(String[] args) {
		
		Music song1 = new Music();
		song1.setSinger("이선희");
		song1.setSong("아~ 옛날이여~");
		
		Music song2 = new Music("조용필", "킬리만자로의 표범");

//		song1.play(); //이선희가 아~ 옜날이여~를 부른다.
//		song2.play(); //조용필(이)가 킬라만자로의 표범을 부른다.
		
//		Music[] musicArr = new Music[10];
//		int top = 0;
		
//		musicArr[top++] = song1;
//		musicArr[top++] = song2;
//		musicArr[top++] = new Music("임재범", "고해");	
		
//		for(int i=0; i<top; i++){
//			musicArr[i].play();
//		}
		
		MusicPlayer mp = new MusicPlayer();
		
		mp.add(song1);
		mp.add(song2);
		mp.add(new Music("임재범","고해"));
		mp.add(new Music("아이유","노래"));
		
		//mp.musicPlay(top, musicArr);
		mp.musicPlay();
		
	}

}

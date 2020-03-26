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

	//�� ������ �ش��ϴ� ���� �־��ֱ� ���� �޼ҵ� ����
	public void setSinger(String singer){
		this.singer=singer;
	}
	
	public void setSong(String song){
		this.song=song;
	}
	
	//����� ���� �޼ҵ�
	public void play(){
		System.out.println(singer+"(��)�� "+song+" �� �θ���");
	}
}


class MusicPlayer {
	
	final int Max = 10;
	Music[] musicArr = new Music[Max];
	int top = 0;
	
	public void add(Music music){
		if(top>=Max) {
			System.out.println("���̻� �߰� �Ұ���");
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
		song1.setSinger("�̼���");
		song1.setSong("��~ �����̿�~");
		
		Music song2 = new Music("������", "ų�����ڷ��� ǥ��");

//		song1.play(); //�̼��� ��~ �����̿�~�� �θ���.
//		song2.play(); //������(��)�� ų���ڷ��� ǥ���� �θ���.
		
//		Music[] musicArr = new Music[10];
//		int top = 0;
		
//		musicArr[top++] = song1;
//		musicArr[top++] = song2;
//		musicArr[top++] = new Music("�����", "����");	
		
//		for(int i=0; i<top; i++){
//			musicArr[i].play();
//		}
		
		MusicPlayer mp = new MusicPlayer();
		
		mp.add(song1);
		mp.add(song2);
		mp.add(new Music("�����","����"));
		mp.add(new Music("������","�뷡"));
		
		//mp.musicPlay(top, musicArr);
		mp.musicPlay();
		
	}

}

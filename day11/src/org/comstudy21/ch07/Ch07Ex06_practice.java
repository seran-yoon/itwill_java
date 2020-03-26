package org.comstudy21.ch07;

class Movie{ //Movie class ����
	//��� �ʵ� ���� (�ʵ�=�ν��Ͻ� ����)
	private String name; //private�� ���ִ� ������ class�ۿ����� �����Ҽ� ���� �ϱ� ���� => ��ü ���������� ����ϴ� ������ �޼ҵ忡 �����ϸ� �����ڰ� �ǵ����� ���� �������� ����Ű�� �ɼ��� �ֱ� ������ �̷��� �����κ��� ��ü�� ������ ��ȣ�ϱ� ���ؼ��� ����� ���� �ܺ��� ������ ����ϰų� �����ؾ� �� �ʿ䰡 �����. ���� �����ڸ� ����Ͽ� ����ڿ��� ��ü�� ������ �� �ִ� ���ܸ��� ���������ν� ��������� ��ü�� ��뿡 ���� �� �� �ֵ��� ���� ����
	private String type;
	//private -> ����������
	
	//�����ڴ� �ʱ�ȭ ����
	//������ �޼ҵ� �����ε�(�����ε� : �������� �̸��� ������ �Ű������� ������ Ÿ���� �ٸ� �޼ҵ带 �����ϴ°�!)
	//�������� �ʾƵ� �ڵ����� ����� ������, ���� �����ڸ� �Ѱ��� ���ָ� �������� �� �ۼ��ؾ� ��
	public Movie(){ //�Ű������� ���� ������ => ����Ʈ ������
	}
	
	public Movie(String name, String type){ //�Ű������� �ִ� ������ => ������ �����ε�
		this.name=name;
		this.type=type;
	}
	
	public Movie(String name){
		this(name,"�׼ǿ�ȭ");
	}
	
	//��� �޼ҵ� ����
	public void setName(String name){
		this.name=name;
	}
	
	public void setType(String type){
		this.type=type;
	}
	
	//����� ���� �޼ҵ� ����
	public void ticket(){
		System.out.println("["+name+"] ��ȭ�� '"+type+"' �Դϴ�.");
	}
}


class MovieTicket{ //MovieTicket class ����
	
	//�޼ҵ带 �����Ҷ� ���ִ°� �ƴ϶� �޼ҵ� �ۿ� class�� �����ص� ��
	Movie[] movieArr = new Movie[5]; 
	int top = 0;
	
	//��ü �߰��� ���� �޼ҵ�
	public void add(Movie movie){ //Movie class���� movie ��ü ����
		if(top>=5) {
			System.out.println("���̻� �߰� �Ұ���");
			return;
		} //���� �迭�� ������ 5���� �Ѱ� �߰��Ϸ��� �ϸ� ���̻� �߰��� �Ұ��� �ϴٴ� �ȳ� �޼����� ��������
		
		movieArr[top++] = movie; //movie�� �߰��� �����Ǵ°� movieArr �迭�� �ϳ��� �ִ´�
	}
	
	//����� ���� �޼ҵ� ����
	public void movieticket(){
		for(int i=0; i<top; i++){
			movieArr[i].ticket();
		}
	}
	

	/*
	//����� ���� �޼ҵ� ����
	public void movieticket(int top, Movie[] movieArr){
		for(int i=0;i<top;i++){
			movieArr[i].ticket();
		}
	}
	*/
}



public class Ch07Ex06_practice {
	public static void main(String[] args) {

		// Movie movie1; -> Ŭ���� Movie�� �����ϴ� �������� movie1 ���� 
		// new Movie(); -> Ŭ���� Movie�� '�ν��Ͻ�'�ϴ°�
		Movie movie1 = new Movie(); //class Movie�� ���� movie1 ��ü ���� (�ν��Ͻ�=��ü)
		movie1.setName("����Ʈ"); //****************************>> Movie class���� �ʵ带 �������ٶ� private�� ���־��� ������ main���� ���������� �ʵ���� �ҷ��� �� ����, �׷��� Movie class�� set�޼ҵ带 �����ؼ� main���� ���ļ� ������ �� �ְ� ��
		movie1.setType("�糭��ȭ");
		
		Movie movie2 = new Movie("�װ�", "������ȭ"); //class Movie�� ���� movie2 ��ü ���� (�ʱ�ȭ���� ���� ����)

		Movie movie3 = new Movie("������ ����"); //class Movie�� ���� movie3 ��ü ���� (�Ű����� ���� �ٸ�)
		
		/*
		//�ϳ��ϳ� ������ֱ�
		movie1.ticket();
		movie2.ticket();
		movie3.ticket();
		*/
		
		/*
		//�迭�� ���� �迭�ȿ� ��°��� �ְ� �ݺ����� ���ؼ� ������ֱ�
		Movie[] movieArr =  new Movie[5];
		int top = 0;
		movieArr[top++] = movie1;
		movieArr[top++] = movie2;
		movieArr[top++] = movie3;

		for(int i=0;i<top;i++){
			movieArr[i].ticket();
		}
		*/
		
		MovieTicket mt = new MovieTicket(); //class MovieTicket�� ���� mt ��ü ����
		
		/*
		//MovieTicket class�� ������ �迭�� ����ϱ�
		Movie[] movieArr =  new Movie[5];
		int top = 0;
		
		movieArr[top++] = movie1;
		movieArr[top++] = movie2;
		movieArr[top++] = movie3;

		mt.movieticket(top, movieArr);
		*/
		
		//��ü�� �� �߰��ؼ� ����ϱ�
		mt.add(movie1);
		mt.add(movie2);
		mt.add(movie3);
		mt.add(new Movie("������ ���Ǿٹ�", "��ο�ȭ"));
		mt.add(new Movie("�츮��", "��󸶿�ȭ"));
		
		mt.movieticket(); //���
	}
}

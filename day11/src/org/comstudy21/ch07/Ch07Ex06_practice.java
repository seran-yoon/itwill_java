package org.comstudy21.ch07;

class Movie{ //Movie class 생성
	//멤버 필드 생성 (필드=인스턴스 변수)
	private String name; //private을 써주는 이유는 class밖에서는 접근할수 없게 하기 위함 => 객체 내부적으로 사용하는 변수나 메소드에 접근하며 개발자가 의도하지 못한 오동작을 일으키게 될수도 있기 때문에 이러한 문제로부터 객체의 로직을 보호하기 위해서는 멤버에 따라서 외부의 접근을 허용하거나 차단해야 할 필요가 생긴다. 접근 제어자를 사용하여 사용자에세 객체를 조작할 수 있는 수단만을 제공함으로써 결과적으로 객체의 사용에 집중 할 수 있도록 돕기 위함
	private String type;
	//private -> 접근제어자
	
	//생성자는 초기화 개념
	//생성자 메소드 오버로딩(오버로딩 : 생성자의 이름은 같은데 매개변수의 갯수나 타입이 다른 메소드를 생성하는것!)
	//선언하지 않아도 자동으로 생기긴 하지만, 만약 생성자를 한개라도 써주면 나머지도 다 작성해야 함
	public Movie(){ //매개변수가 없는 생성자 => 디폴트 생성자
	}
	
	public Movie(String name, String type){ //매개변수가 있는 생성자 => 생성자 오버로딩
		this.name=name;
		this.type=type;
	}
	
	public Movie(String name){
		this(name,"액션영화");
	}
	
	//멤버 메소드 생성
	public void setName(String name){
		this.name=name;
	}
	
	public void setType(String type){
		this.type=type;
	}
	
	//출력을 위한 메소드 생성
	public void ticket(){
		System.out.println("["+name+"] 영화는 '"+type+"' 입니다.");
	}
}


class MovieTicket{ //MovieTicket class 생성
	
	//메소드를 생성할때 써주는게 아니라 메소드 밖에 class에 생성해도 됨
	Movie[] movieArr = new Movie[5]; 
	int top = 0;
	
	//객체 추가를 위한 메소드
	public void add(Movie movie){ //Movie class에서 movie 객체 생성
		if(top>=5) {
			System.out.println("더이상 추가 불가능");
			return;
		} //만약 배열의 길이인 5개를 넘게 추가하려고 하면 더이상 추가가 불가능 하다는 안내 메세지를 내보낸다
		
		movieArr[top++] = movie; //movie가 추가로 생성되는걸 movieArr 배열에 하나씩 넣는다
	}
	
	//출력을 위한 메소드 생성
	public void movieticket(){
		for(int i=0; i<top; i++){
			movieArr[i].ticket();
		}
	}
	

	/*
	//출력을 위한 메소드 생성
	public void movieticket(int top, Movie[] movieArr){
		for(int i=0;i<top;i++){
			movieArr[i].ticket();
		}
	}
	*/
}



public class Ch07Ex06_practice {
	public static void main(String[] args) {

		// Movie movie1; -> 클래스 Movie를 참조하는 참조변수 movie1 선언 
		// new Movie(); -> 클래스 Movie를 '인스턴스'하는것
		Movie movie1 = new Movie(); //class Movie에 대한 movie1 객체 생성 (인스턴스=객체)
		movie1.setName("엑시트"); //****************************>> Movie class에서 필드를 선언해줄때 private을 써주었기 때문에 main에서 직접적으로 필드명을 불러올 수 없음, 그래서 Movie class에 set메소드를 생성해서 main으로 거쳐서 가져올 수 있게 함
		movie1.setType("재난영화");
		
		Movie movie2 = new Movie("그것", "공포영화"); //class Movie에 대한 movie2 객체 생성 (초기화까지 같이 해줌)

		Movie movie3 = new Movie("봉오동 전투"); //class Movie에 대한 movie3 객체 생성 (매개변수 갯수 다름)
		
		/*
		//하나하나 출력해주기
		movie1.ticket();
		movie2.ticket();
		movie3.ticket();
		*/
		
		/*
		//배열을 만들어서 배열안에 출력값을 넣고 반복문을 통해서 출력해주기
		Movie[] movieArr =  new Movie[5];
		int top = 0;
		movieArr[top++] = movie1;
		movieArr[top++] = movie2;
		movieArr[top++] = movie3;

		for(int i=0;i<top;i++){
			movieArr[i].ticket();
		}
		*/
		
		MovieTicket mt = new MovieTicket(); //class MovieTicket에 대한 mt 객체 생성
		
		/*
		//MovieTicket class에 보내서 배열로 출력하기
		Movie[] movieArr =  new Movie[5];
		int top = 0;
		
		movieArr[top++] = movie1;
		movieArr[top++] = movie2;
		movieArr[top++] = movie3;

		mt.movieticket(top, movieArr);
		*/
		
		//객체를 더 추가해서 출력하기
		mt.add(movie1);
		mt.add(movie2);
		mt.add(movie3);
		mt.add(new Movie("유열의 음악앨범", "멜로영화"));
		mt.add(new Movie("우리집", "드라마영화"));
		
		mt.movieticket(); //출력
	}
}

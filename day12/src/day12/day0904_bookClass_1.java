package day12;

class Book{ //Book class 생성
	String title; //이름 필드
	String author; //작가 필드
	
	public Book(String title, String author){
		this.title = title;
		this.author = author;
	}
	
	public Book(String title){
		this(title,"작자미상");
	}
}

public class day0904_bookClass_1 {
	public static void main(String[] args) {
		
		Book littlePrince = new Book("어린왕자", "생텍쥐페리");
		Book loveStory = new Book("춘향전");
		
		System.out.println(littlePrince.title+" "+littlePrince.author);
		System.out.println(loveStory.title+" "+loveStory.author);
	}
}

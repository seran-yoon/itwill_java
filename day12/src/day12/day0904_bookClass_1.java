package day12;

class Book{ //Book class ����
	String title; //�̸� �ʵ�
	String author; //�۰� �ʵ�
	
	public Book(String title, String author){
		this.title = title;
		this.author = author;
	}
	
	public Book(String title){
		this(title,"���ڹ̻�");
	}
}

public class day0904_bookClass_1 {
	public static void main(String[] args) {
		
		Book littlePrince = new Book("�����", "�������丮");
		Book loveStory = new Book("������");
		
		System.out.println(littlePrince.title+" "+littlePrince.author);
		System.out.println(loveStory.title+" "+loveStory.author);
	}
}

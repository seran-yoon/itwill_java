package day12_2;

import java.util.Scanner;

class Book{
	String title;
	String author;
	
	public Book(String title, String author){
		this.title=title;
		this.author=author;
	}
}

public class day0904_bookClass_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Book[] book = new Book[2];
		
		for(int i=0;i<book.length;i++){
			System.out.print("제목 >>> ");
			String title = sc.nextLine();
			
			System.out.print("저자 >>> ");
			String author = sc.nextLine();
			
			book[i] = new Book(title, author);
		}
		
		for(int i=0;i<book.length;i++){
			System.out.println("("+book[i].title+", "+book[i].author+")");
		}
		sc.close();
	}

}
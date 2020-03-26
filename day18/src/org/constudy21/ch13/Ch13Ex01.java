package org.constudy21.ch13;

//강제로 예외 발생
//

class MyException extends Exception{ 
	public MyException(){
		super("MyException 발생!");
	}
}

public class Ch13Ex01 {
	
	static void exceptionManager() throws MyException{
		
		throw new MyException();
		
//		try {
//			throw new MyException();
//		} catch (MyException e) {
//			System.out.println(e.getMessage());
//			//e.printStackTrace();
//		}
	}
	public static void main(String[] args) {
		
		try {
			throw new MyException();
		} catch (MyException e) {
			System.out.println(e.getMessage());
			//e.printStackTrace();
		}
		
	}

}

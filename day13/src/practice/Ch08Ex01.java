package practice;

class Account{
	int count;
	static int total;
	
	public Account(int count){ //생성자
		this.count=count;
	}
	
	public void sum(){ //메소드
		total += count;
		System.out.println(total);
	}
}

public class Ch08Ex01 {
	public static void main(String[] args) {
		
		Account acc01 = new Account(10); //객체를 인스턴스화
		acc01.sum();
		Account acc02 = new Account(10);
		acc02.sum();
		Account acc03 = new Account(10);
		acc03.sum();


//		Account.total;
	}
}

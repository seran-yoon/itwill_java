package org.comstudy21.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcTest {

	public static void main(String[] args) {
		//JRE System Library 우클릭 -> Build Patch -> configure Build path -> Libraries -> Add External JARs... 클릭 
		//-> C:\Program Files\Java\jre1.8.0_221\lib\ext\ojbdc6.jar 지정
		//Referenced Libraries 클릭 -> oracle.jdbc.driver 클릭 -> OracleDriver.class 우클릭 -> Copy Qualified Name클릭
		//main 안에 Class.forName(" 이곳에 복사한 OracleDriver.class의 주소를 붙여넣기(뒤에 .class는 없애준다) ");
		//try-catch 하라고 빨간줄 뜨면 바꿔줌
		
		String url = "jdbc:oracle:thin:@localhost:1521/xe"; //oracle은 포트번호 1521
		String user = "comstudy21";
		String password = "comstudy21";
		
		Connection conn = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 검색 성공!");
			conn = DriverManager.getConnection(url, user, password); //밑에 catch (SQLException e)써줘서 예외처리 해줘야 함
			System.out.println(conn);
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 검색 실패!");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("DB 접속 실패!");
			e.printStackTrace();
		}
		
	}

}

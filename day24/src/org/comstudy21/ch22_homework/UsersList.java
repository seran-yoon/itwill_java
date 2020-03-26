package org.comstudy21.ch22_homework;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.comstudy21.util.JdbcUtil;

public class UsersList {
	
	public UsersList() {
		Connection conn = JdbcUtil.getConnection();
		
		String sql = "SELECT * FROM USERS";
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			System.out.println("회원번호\t | 이름\t | 아이디\t | 패스워드\t | 나이");
			System.out.println("--------------------------------------");

			while(rs.next()){
				int 회원번호 = rs.getInt("회원번호");
				String 이름 = rs.getString("이름");
				String 아이디 = rs.getString("아이디");
				String 패스워드 = rs.getString("패스워드");
				String 나이 = rs.getString("나이");
				
				System.out.printf("%d\t | %s\t | %s\t | %s\t | %s\t\n", 회원번호, 이름, 아이디, 패스워드, 나이);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs != null) rs.close();
				if(stmt != null) stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
			JdbcUtil.close(conn);
		}
	
	}

	public static void main(String[] args) {
		new UsersList();
	}

}

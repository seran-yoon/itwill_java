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
			
			System.out.println("ȸ����ȣ\t | �̸�\t | ���̵�\t | �н�����\t | ����");
			System.out.println("--------------------------------------");

			while(rs.next()){
				int ȸ����ȣ = rs.getInt("ȸ����ȣ");
				String �̸� = rs.getString("�̸�");
				String ���̵� = rs.getString("���̵�");
				String �н����� = rs.getString("�н�����");
				String ���� = rs.getString("����");
				
				System.out.printf("%d\t | %s\t | %s\t | %s\t | %s\t\n", ȸ����ȣ, �̸�, ���̵�, �н�����, ����);
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

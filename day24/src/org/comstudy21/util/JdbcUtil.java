package org.comstudy21.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcUtil {

	public static Connection getConnection() {
		
		String url = "jdbc:oracle:thin:@localhost:1521/xe"; //oracle�� ��Ʈ��ȣ 1521
		String user = "comstudy21";
		String password = "comstudy21";
		
		Connection conn = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, user, password); //�ؿ� catch (SQLException e)���༭ ����ó�� ����� ��
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return conn;
		
	}

	public static void close(Connection conn){
		if(conn != null)
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	
	
}

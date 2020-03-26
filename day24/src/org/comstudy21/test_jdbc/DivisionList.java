package org.comstudy21.test_jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.comstudy21.util.JdbcUtil;

public class DivisionList {

	public DivisionList() {
		Connection conn = JdbcUtil.getConnection();
		
		String sql = "SELECT * FROM DIVISION";
		Statement stmt = null; //요청
		ResultSet rs = null; //받음
		
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while(rs.next()){
				int dno = rs.getInt("dno");
				String dname = rs.getString("dname");
				String phone = rs.getString("phone");
				String position = rs.getString(4);
				
				System.out.printf("%d | %s | %s | %s\n", dno, dname, phone, position);
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
		new DivisionList();
	}

}

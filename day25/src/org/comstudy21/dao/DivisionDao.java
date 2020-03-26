package org.comstudy21.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import org.comstudy21.dto.DivisionDto;
import org.comstudy21.jdbc.JdbcUtil;

public class DivisionDao {
	
	Connection conn;
	private Statement stmt;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	private final String SELECT_ALL = "select * from division"; //상수로 만들어줌
	private final String INSERT = "insert into division(dno, dname, phone, position) values(?,?,?,?)";
	
	public DivisionDao(){
		
	}
	
	public DivisionDao(Connection conn){
		this.conn = conn;
	}
	
	public void setConn(Connection conn){
		this.conn = conn;
	}
	
	public DivisionDto[] selectAll(){
		
		DivisionDto[] dtoArr = null;
		ArrayList<DivisionDto> list = new ArrayList<>();
		
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(SELECT_ALL);
			
			while(rs.next()){
				int dno = rs.getInt(1);
				String dname = rs.getString(2);
				String phone = rs.getString(3);
				String position = rs.getString(4);
				
				list.add(new DivisionDto(dno, dname, phone, position));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.close(rs);
			JdbcUtil.close(stmt);
		}
		
		if(list.size() != 0){
			dtoArr = new DivisionDto[list.size()];
			list.toArray(dtoArr); //list가 Array(배열)로 바뀜
		}
		
		return dtoArr;
		
	}
	
	public void insert(DivisionDto dto){
		
		try {
			pstmt = conn.prepareStatement(INSERT);
			
			pstmt.setInt(1, dto.getDno());
			pstmt.setString(2, dto.getDname());
			pstmt.setString(3, dto.getPhone());
			pstmt.setString(4, dto.getPosition());
			
			int cnt = pstmt.executeUpdate();
			
			if(cnt > 0) {
				System.out.println("데이터 입력 성공!");
				conn.commit();
			} else {
				System.out.println("데이터 입력 실패!");
				conn.rollback();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.close(pstmt);
		}
		
	}

}

package org.comstudy21.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import org.comstudy21.dto.SaramDto;
import org.comstudy21.jdbc.JdbcUtil;

public class SaramDao {

	private Connection conn;
	private Statement stmt;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	private final String INSERT = "insert into saram (id, name, age) values(?,?,?)"; //입력
	private final String SELECT_ALL = "select * from saram order by id desc"; //출력
	private final String SELECT = "select * from saram where id = ?"; //검색
	private final String UPDATE = "update saram set name = ?, age = ? where id = ?"; //수정 //물음표의 순서대로 밑에 <pstmt.setString(1, dto.getId());>에서의 번호
	private final String DELETE = "delete from saram where id = ?"; //삭제
	
	public SaramDao() {
		
	}

	public SaramDao(Connection conn){
		this.conn = conn;
	}

	public void setConnection(Connection conn) {
		this.conn = conn;
	}
	
	public void insert(SaramDto dto){ //입력
		
		try { //insert는 selectAll과 다르게 반환되는 값이 없으므로 ResultSet객체가 필요 없음
			
			pstmt = conn.prepareStatement(INSERT); //쿼리수행을 위한 Statement객체 생성 (동적으로 할당되는 값이므로 prepareStatement()메서드로 호출)
			
			pstmt.setString(1, dto.getId());
			pstmt.setString(2, dto.getName());
			pstmt.setInt(3, dto.getAge());
			
			int cnt = pstmt.executeUpdate(); //작성한 쿼리(INSERT)의 결과가 없으면 executeUpdate()메서드를 호출하여 int형 변수에 결과값을 할당
			
			if(cnt>0){
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
	
	public SaramDto[] selectAll(){ //출력
		
		SaramDto[] dtoArr = null; //원본의 복사본을 넣을 배열 만들기
		ArrayList<SaramDto> list = new ArrayList<>();
		
		try {
			stmt = conn.createStatement(); //쿼리수행을 위한 Statement객체 생성 (동적으로 할당되는 값이 없으므로 crateStatement()메서드로 호출)
			rs = stmt.executeQuery(SELECT_ALL); //작성한 쿼리(SELECT_ALL)의 결과가 있으면 executeQuery()메서드를 호출하여 결과값을 ResultSet객체 rs에 할당
			
			while(rs.next()){
				//레코드의 칼럼은 배열과 달리 0부터 시작하지 않고 1부터 시작
				String id = rs.getString(1);
				String name = rs.getString(2);
				int age = rs.getInt(3);
				
				list.add(new SaramDto(id, name, age));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.close(rs);
			JdbcUtil.close(stmt);
		}
		
		if(list.size() != 0){
			dtoArr = new SaramDto[list.size()];
			list.toArray(dtoArr);
		}
		
		return dtoArr;
		
	}

	public SaramDto select(SaramDto dto){ //검색
		
		SaramDto saram = null;

		try {
			pstmt = conn.prepareStatement(SELECT);
			String id = dto.getId();
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			
			while(rs.next()){				
				String name = rs.getString("name");
				int age = rs.getInt("age");
				
				saram = new SaramDto(id, name, age);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.close(pstmt);
		}
		
		return saram;
		
	}
	
	public void update(SaramDto dto){ //수정
				
		try {
			pstmt = conn.prepareStatement(UPDATE);
			
			String id = dto.getId();
			pstmt.setString(3, id);
			pstmt.setString(1, dto.getName());
			pstmt.setInt(2, dto.getAge());
			
			int cnt = pstmt.executeUpdate();
			
			if(cnt>0){
				System.out.println("데이터 수정 성공!");
				conn.commit();
			} else {
				System.out.println("데이터 수정 실패!");
				conn.rollback();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.close(pstmt);
		}
		
	}	
	
	public void delete(SaramDto dto){ //삭제
		
		try {
			pstmt = conn.prepareStatement(DELETE);
			String id = dto.getId();
			pstmt.setString(1, id);
			
			int cnt = pstmt.executeUpdate();
			
			if(cnt>0){
				System.out.println("데이터 삭제 성공!");
				conn.commit();
			} else {
				System.out.println("데이터 삭제 실패!");
				conn.rollback();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.close(pstmt);
		}
		
	}
	
}

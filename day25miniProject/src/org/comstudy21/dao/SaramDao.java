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
	
	private final String INSERT = "insert into saram (id, name, age) values(?,?,?)"; //�Է�
	private final String SELECT_ALL = "select * from saram order by id desc"; //���
	private final String SELECT = "select * from saram where id = ?"; //�˻�
	private final String UPDATE = "update saram set name = ?, age = ? where id = ?"; //���� //����ǥ�� ������� �ؿ� <pstmt.setString(1, dto.getId());>������ ��ȣ
	private final String DELETE = "delete from saram where id = ?"; //����
	
	public SaramDao() {
		
	}

	public SaramDao(Connection conn){
		this.conn = conn;
	}

	public void setConnection(Connection conn) {
		this.conn = conn;
	}
	
	public void insert(SaramDto dto){ //�Է�
		
		try { //insert�� selectAll�� �ٸ��� ��ȯ�Ǵ� ���� �����Ƿ� ResultSet��ü�� �ʿ� ����
			
			pstmt = conn.prepareStatement(INSERT); //���������� ���� Statement��ü ���� (�������� �Ҵ�Ǵ� ���̹Ƿ� prepareStatement()�޼���� ȣ��)
			
			pstmt.setString(1, dto.getId());
			pstmt.setString(2, dto.getName());
			pstmt.setInt(3, dto.getAge());
			
			int cnt = pstmt.executeUpdate(); //�ۼ��� ����(INSERT)�� ����� ������ executeUpdate()�޼��带 ȣ���Ͽ� int�� ������ ������� �Ҵ�
			
			if(cnt>0){
				System.out.println("������ �Է� ����!");
				conn.commit();
			} else {
				System.out.println("������ �Է� ����!");
				conn.rollback();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.close(pstmt);
		}
		
	}
	
	public SaramDto[] selectAll(){ //���
		
		SaramDto[] dtoArr = null; //������ ���纻�� ���� �迭 �����
		ArrayList<SaramDto> list = new ArrayList<>();
		
		try {
			stmt = conn.createStatement(); //���������� ���� Statement��ü ���� (�������� �Ҵ�Ǵ� ���� �����Ƿ� crateStatement()�޼���� ȣ��)
			rs = stmt.executeQuery(SELECT_ALL); //�ۼ��� ����(SELECT_ALL)�� ����� ������ executeQuery()�޼��带 ȣ���Ͽ� ������� ResultSet��ü rs�� �Ҵ�
			
			while(rs.next()){
				//���ڵ��� Į���� �迭�� �޸� 0���� �������� �ʰ� 1���� ����
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

	public SaramDto select(SaramDto dto){ //�˻�
		
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
	
	public void update(SaramDto dto){ //����
				
		try {
			pstmt = conn.prepareStatement(UPDATE);
			
			String id = dto.getId();
			pstmt.setString(3, id);
			pstmt.setString(1, dto.getName());
			pstmt.setInt(2, dto.getAge());
			
			int cnt = pstmt.executeUpdate();
			
			if(cnt>0){
				System.out.println("������ ���� ����!");
				conn.commit();
			} else {
				System.out.println("������ ���� ����!");
				conn.rollback();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.close(pstmt);
		}
		
	}	
	
	public void delete(SaramDto dto){ //����
		
		try {
			pstmt = conn.prepareStatement(DELETE);
			String id = dto.getId();
			pstmt.setString(1, id);
			
			int cnt = pstmt.executeUpdate();
			
			if(cnt>0){
				System.out.println("������ ���� ����!");
				conn.commit();
			} else {
				System.out.println("������ ���� ����!");
				conn.rollback();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.close(pstmt);
		}
		
	}
	
}

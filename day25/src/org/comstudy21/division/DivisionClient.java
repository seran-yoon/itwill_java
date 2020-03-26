package org.comstudy21.division;

import org.comstudy21.dao.DivisionDao;
import org.comstudy21.dto.DivisionDto;
import org.comstudy21.jdbc.JdbcUtil;

public class DivisionClient {
	
	private static DivisionDao dao = new DivisionDao(JdbcUtil.getConnection());
	
	public static void main(String[] args) {
	
		DivisionDto dto = new DivisionDto();
		dto.setDno(50);
		dto.setDname("student");
		dto.setPhone("010-1234-5678");
		dto.setPosition("Gangnam");
		
		dao.insert(dto);
		
		selectAll();
		
	}
	
	public static void selectAll() {
		
		DivisionDto[] arr = dao.selectAll();
		
//		System.out.println(Arrays.toString(arr)); //보기 불편해서 확장포문으로 바꿈
		for(DivisionDto dto : arr){
			System.out.println(dto);
		}
		
	}

}

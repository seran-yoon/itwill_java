package org.comstudy21.phonebook.model;

import java.util.ArrayList;

public class DAO {
	
	private ArrayList<DTO> list = new ArrayList<>();
	private int squence = 1;
	
	public void insert(DTO dto) {
		
		dto.setIdx(squence++);
		list.add(dto);
		
		System.out.println(list);

	}

	public DTO[] selectAll() {
		
		DTO[] arr = new DTO[list.size()];
		list.toArray(arr);
		
		return arr;
		
	}
}

package org.comstudy21.phonebook.model;

import java.util.ArrayList;

public class PhonebookDao {
	
	private ArrayList<PhonebookDto> list = new ArrayList<>(); //배열 대신, ArrayList를 만듬 (list는 중복이 있을 수 있고, 순서대로 저장된다)
	private int squence = 1; //고유번호 idx
	
	//입력 input의 기능
	public void insert(PhonebookDto dto){ 
		dto.setIdx(squence++);
		list.add(dto); //ArrayList에 dto값 추가(add)

		System.out.println(list); //저장되는 list(배열리스트)를 보여줌 -> 잘 저장되는지 확인 하려고 출력시켜주는것
	}

	//출력 output의 기능
	public PhonebookDto[] selectAll(){ 
		PhonebookDto[] arr = new PhonebookDto[list.size()]; //배열리스트 list의 복사본 배열을 만듬(원본값이 변하지 않게 하기 위해서)
		list.toArray(arr); //배열리스트를 배열로 변환(toArray)해 arr값을 넣는다
		
		return arr;  //OutputCmd로 리턴해줌
	}
	
	
}

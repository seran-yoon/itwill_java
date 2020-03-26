package org.comstudy21.phonebook.model;

import java.util.ArrayList;

public class PhonebookDao {
	
	private ArrayList<PhonebookDto> list = new ArrayList<>(); //�迭 ���, ArrayList�� ���� (list�� �ߺ��� ���� �� �ְ�, ������� ����ȴ�)
	private int squence = 1; //������ȣ idx
	
	//�Է� input�� ���
	public void insert(PhonebookDto dto){ 
		dto.setIdx(squence++);
		list.add(dto); //ArrayList�� dto�� �߰�(add)

		System.out.println(list); //����Ǵ� list(�迭����Ʈ)�� ������ -> �� ����Ǵ��� Ȯ�� �Ϸ��� ��½����ִ°�
	}

	//��� output�� ���
	public PhonebookDto[] selectAll(){ 
		PhonebookDto[] arr = new PhonebookDto[list.size()]; //�迭����Ʈ list�� ���纻 �迭�� ����(�������� ������ �ʰ� �ϱ� ���ؼ�)
		list.toArray(arr); //�迭����Ʈ�� �迭�� ��ȯ(toArray)�� arr���� �ִ´�
		
		return arr;  //OutputCmd�� ��������
	}
	
	
}

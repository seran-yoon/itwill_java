package org.comstudy21.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcTest {

	public static void main(String[] args) {
		//JRE System Library ��Ŭ�� -> Build Patch -> configure Build path -> Libraries -> Add External JARs... Ŭ�� 
		//-> C:\Program Files\Java\jre1.8.0_221\lib\ext\ojbdc6.jar ����
		//Referenced Libraries Ŭ�� -> oracle.jdbc.driver Ŭ�� -> OracleDriver.class ��Ŭ�� -> Copy Qualified NameŬ��
		//main �ȿ� Class.forName(" �̰��� ������ OracleDriver.class�� �ּҸ� �ٿ��ֱ�(�ڿ� .class�� �����ش�) ");
		//try-catch �϶�� ������ �߸� �ٲ���
		
		String url = "jdbc:oracle:thin:@localhost:1521/xe"; //oracle�� ��Ʈ��ȣ 1521
		String user = "comstudy21";
		String password = "comstudy21";
		
		Connection conn = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("����̹� �˻� ����!");
			conn = DriverManager.getConnection(url, user, password); //�ؿ� catch (SQLException e)���༭ ����ó�� ����� ��
			System.out.println(conn);
		} catch (ClassNotFoundException e) {
			System.out.println("����̹� �˻� ����!");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("DB ���� ����!");
			e.printStackTrace();
		}
		
	}

}

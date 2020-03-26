package org.comstudy21.ch22;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableModel;

class ScoreModel extends AbstractTableModel {
	
	Object[][] data = {
			{"hong",40,50},
			{"kim",70,80},
			{"park",10,20},
			{"lee",40,50},
			{"park",40,50},
			{60,70,80},
			{90,10,20},
			{30,40,50},
			{30,40,50},
			{60,70,80},
			{90,10,20},
			{30,40,50}
	};
	
	String[] columnNames = { "국어","영어","수학" };

	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return data.length;
	}

	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return data[0].length;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub
		return data[rowIndex][columnIndex];
	}
	
	public String getColumnName(int column){
		return columnNames[column];
	}
	
}

public class Ch22Ex09 extends JFrame implements MouseListener{
	
	JPanel contentPane;
	JTable table;
	ScoreModel tableModel = new ScoreModel();
	
	public Ch22Ex09() {
		
		contentPane = (JPanel)getContentPane();
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(640, 250);
		
		init();
		start();
		
	}
	
	private void init(){
		
		table = new JTable(tableModel);
		
		contentPane.add(new JScrollPane(table));
		
	}
	
	private void start(){
		
		table.addMouseListener(this);
		
	}
	
	public static void main(String[] args) {
		new Ch22Ex09().setVisible(true);
	}

	@Override
	public void mouseClicked(MouseEvent e) {}

	@Override
	public void mousePressed(MouseEvent e) {

		int row = table.getSelectedRow();
		
		System.out.print(table.getValueAt(row, 0)+", ");
		System.out.print(table.getValueAt(row, 1)+", ");
		System.out.println(table.getValueAt(row, 2));
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {}

	@Override
	public void mouseEntered(MouseEvent e) {}

	@Override
	public void mouseExited(MouseEvent e) {}

}

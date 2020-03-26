package org.comstudy21.phonebook.view;

public class Viewer {

	private View view;

	public void setView(View view) {
		this.view = view;
	}

	public void display() {
		view.show();
		// controller.service();
	}

}

package org.system;

public class Desktop extends Computer {
	public void desktopSize() {
		System.out.println("Desktop size is 14 inch");
	}
	public static void main(String[] args) {
		Desktop model = new Desktop ();
	model.computerModel();
	model.desktopSize();
	
	}
}

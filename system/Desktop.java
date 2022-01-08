package org.system;

public class Desktop extends Computer{
	
	public void desktopSize() {
		System.out.println("Desktop-desktopsize");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Desktop PC=new Desktop();
		PC.computerModel();
		PC.desktopSize();
	}

}

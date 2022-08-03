package org.system;

public class Desktop extends Computer {
	public void desktopSize() {
		String size="1260*1010";
		System.out.println("Desktop size:"+size);
		}

	public static void main(String[] args) {
		Desktop obj=new Desktop();
		obj.desktopSize();
		obj.computerModel();
		
		
	}

}

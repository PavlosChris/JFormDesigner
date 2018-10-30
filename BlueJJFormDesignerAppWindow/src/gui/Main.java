package gui;

import javax.swing.UIManager;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		      UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		    } catch (Exception e) {
		      System.out.println("Substance Raven Graphite failed to initialize");
		    }
		MainApplicationWindow mainframe = new MainApplicationWindow();
		mainframe.setVisible(true);
	}	

}

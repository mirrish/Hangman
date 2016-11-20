package main;
import javax.swing.JOptionPane;


public class InputWindow extends JOptionPane {
	private String s;
	
	public InputWindow() {
		s = showInputDialog("Enter a word");
	}
	
	public String getString(){
		return s;
	}

}

package main;

import java.util.Scanner;

public class Hangman {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	public String enterWord(){
	    /*System.out.println("Enter word: ");
	    Scanner s = new Scanner(System.in);
	    String line = s.nextLine();
	    s.close();*/
	    return "GRODA";
	}

    public Boolean guessLetter(String string) {
        //TODO
        return "GRODA".contains(string);
    }

}

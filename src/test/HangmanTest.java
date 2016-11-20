package test;

import static org.junit.Assert.*;

import main.Hangman;

import org.junit.*;


public class HangmanTest {

    @Test
    public void testEnterWord() {
        //fail("Not yet implemented");
        Hangman h = new Hangman();
        Assert.assertTrue(h.enterWord().equals("GRODA"));
    }
    
    @Test
    public void testGuessLetter() {
        Hangman h = new Hangman();
        //h.enterWord();
        Assert.assertTrue(h.guessLetter("G"));
        Assert.assertFalse(h.guessLetter("K"));
    }
    

}

//Test tutorial:
//https://courses.cs.washington.edu/courses/cse143/11wi/eclipse-tutorial/junit.shtml#creating
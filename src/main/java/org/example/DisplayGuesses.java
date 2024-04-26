package org.example;

import java.util.Scanner;

public class DisplayGuesses {

    private String word;

    // Constructor to initialize the DisplayGuesses object with the random word
    public DisplayGuesses(String word) {
        this.word = word;
    }

    public void printWord() {

        // Loops through each character of the word and replaces with "_"
        for (int i = 0; i < word.length(); i++) {
            System.out.print("_ ");  // do I want to print it only or return?
        }
        System.out.println( );

    }
}
// want 2 instance variables, one that stores the word and one that stores the hidden word, not just prints it out and
// we want to then create another method that updatesWord() so that if the word is correct, it shows

// Prints each character of the word
//        for (int i = 0; i < word.length(); i++) {
//            char letter = word.charAt(i);
//            System.out.print(letter); // Prints the character
//        }
//        System.out.println(); // Print a new line

// ==> this prints each character, do i want java to take the word as one or by seperate letters


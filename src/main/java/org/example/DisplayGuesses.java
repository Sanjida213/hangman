package org.example;

import java.util.Scanner;

public class DisplayGuesses {
    private String word;
    private String hiddenWord;

    public String getHiddenWord() {
        return hiddenWord;
    }

    public void setHiddenWord(String hiddenWord) {
        this.hiddenWord = hiddenWord;
    }

    // Constructor to initialize the DisplayGuesses object with the random word
    public DisplayGuesses(String word) {
        this.word = word;
    }

    public String printWord() {
        StringBuilder hiddenWordBuilder = new StringBuilder();

        // Loops through each character of the word and replaces with "_"
        for (int i = 0; i < word.length(); i++) {
            hiddenWordBuilder.append("_ ");
        }
        hiddenWord = hiddenWordBuilder.toString();

        // Print the hidden word
        System.out.println(hiddenWord);

        // Return the hidden word
        return hiddenWord;
    }
//
    public void updatesWord(UserInputs userInputs) {
        int lives = word.length();
        String input = userInputs.getInput();
        char guessedLetter = input.toLowerCase().charAt(0);

//        StringBuilder sb = new StringBuilder(word);

        // now have to get the correct letter to be revealed
        // loop over and guess until all letters are correct of if lives are over
        if (word.indexOf(guessedLetter) != -1) {
            for (int i = 0; i < hiddenWord.length(); i++) {
                char ch = hiddenWord.charAt(i);
                if (ch == guessedLetter) {
                    ch.replace()
                }
            }
            System.out.println("Well done! The letter '" + input + "' is in the word.");
        } else {
            System.out.println("Oh-uh! This is incorrect, you have " + --lives + " left");
        }
    }
}

// if word is correct, uncover the unhidden character
// want 2 instance variables, one that stores the word and one that stores the hidden word, not just prints it out and
// we want to then create another method that updatesWord() so that if the word is correct, it shows


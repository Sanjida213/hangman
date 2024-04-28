package org.example;

import java.util.Scanner;

public class RunningGame {
    private Scanner scanner;

    // constructor
    public RunningGame(Scanner scanner) {
        this.scanner = scanner;
    }

    public void startGame() {
        System.out.println("Welcome to Sanjida's Hangman game!");
        System.out.println("Press enter to start the game :)");
        String pressEnter = scanner.nextLine();

        if (!pressEnter.isEmpty()) {
            System.out.println("Take your time, press enter when you're ready");
            startGame();
        }

        System.out.println("Let's play!");

        // this gets my random word from word Array
        RandomWords randomWords = new RandomWords();  // object
        String word = randomWords.getRandomWord();  // this calls my getRandomWord method and stores in a variable
        int wordLength = randomWords.getRandomWordLength();
        System.out.println("Your word has " + wordLength + " letters.");
        System.out.println(word);


        // this prints my random word as "---"
        DisplayGuesses displayGuess = new DisplayGuesses(word);   // creates an object of my DisplayGuesses class and passes the random word as a param
        displayGuess.printWord();

        // allows user to choose a letter & error handling so only one character is chosen
//        UserInputs userInput = new UserInputs(scanner);
//        String input = userInput.getInput();
//        System.out.println(input);

        UserInputs userInputs = new UserInputs(scanner);

        displayGuess.updatesWord(userInputs);
    }
}

// create startGame method, so if player wants to start game, they will automatically be given a randomWord
// do we want validating userInput to be in here or userInput class?
// we want to create lives -> however many characters in the word == no. of lives
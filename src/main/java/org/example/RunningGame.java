package org.example;

import java.util.Scanner;

public class RunningGame {
    private Scanner scanner;

    public RunningGame(Scanner scanner) {
        this.scanner = scanner;
    }

    public void startGame() {
        String pressEnter = scanner.nextLine();

        if (!pressEnter.isEmpty()) {
            System.out.println("Take your time, press enter when you're ready");
            startGame();
        } else {
            System.out.println("Let's play!");
        }
    }

    public void playGame() {
        System.out.println("Welcome to Sanjida's Hangman game!");
        System.out.println("Press enter to start the game :)");
        startGame();

        RandomWords randomWords = new RandomWords();
        String word = randomWords.getRandomWord();
        int wordLength = randomWords.getRandomWordLength();
        System.out.println("Your word has " + wordLength + " letters.");


        DisplayGuesses displayGuess = new DisplayGuesses(word);
        displayGuess.printWord();

        UserInputs userInputs = new UserInputs(scanner);

        displayGuess.updatesWord(userInputs);
    }

}


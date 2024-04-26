package org.example;

import java.util.Scanner;

import static java.nio.file.Files.readString;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // this gets my random word from word Array
//        RandomWords randomWords = new RandomWords();  // object
//        String word = randomWords.getRandomWord();   // this calls my getRandomWord method and stores in a variable
//        System.out.println("Random word: " + word);
//
//        // this prints my random word as "---"
//        DisplayGuesses displayGuess = new DisplayGuesses(word); // creates an object of my DisplayGuesses class and passes the random word as a param
//        displayGuess.printWord();
//
////      // allows user to choose a letter & error handling so only one character is chosen
//        UserInputs userInput = new UserInputs();
//        userInput.getInput(scanner);

        RunningGame runningGame = new RunningGame(scanner);
        runningGame.startGame();

    }



}



//        DisplayGuesses displayGuess = new DisplayGuesses(randomWord);
//        String hideWord = displayGuess.hiddenWord();
////        String hideWord = displayGuess.DisplayGuesses(randomWords);
////        String hideLetters = word.replaceAll("", "_");
//        System.out.println(hideWord);
//        DisplayGuesses displayGuesses = new DisplayGuesses(randomWords);
//        System.out.println(displayGuesses);

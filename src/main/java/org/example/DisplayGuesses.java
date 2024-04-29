package org.example;

import java.util.Scanner;

public class DisplayGuesses {
    private String word;
    private String hiddenWord;
    private int lives = 8;
    private HangmanAnimation hangmanAnimation = new HangmanAnimation();

    public String getHiddenWord() {
        return hiddenWord;
    }

    public void setHiddenWord(String hiddenWord) {
        this.hiddenWord = hiddenWord;
    }

    public int getLives() {
        return lives;
    }

    public void setLives(int lives) {
        this.lives = lives;
    }

    public DisplayGuesses(String word) {
        this.word = word;
    }

    public String printWord() {
        StringBuilder hiddenWordBuilder = new StringBuilder();

        for (int i = 0; i < word.length(); i++) {
            hiddenWordBuilder.append("_ ");
        }
        hiddenWord = hiddenWordBuilder.toString();
        System.out.println(hiddenWord);
        return hiddenWord;
    }

    public void updatesWord(UserInputs userInputs) {
        StringBuilder updatedHiddenWord = new StringBuilder(hiddenWord);

        while (lives > 0 && hiddenWord.contains("_")) {
            String guessedLetter = userInputs.getInput().toLowerCase();

            if (word.contains(guessedLetter)) {
                System.out.println("Well done! The letter '" + guessedLetter + "' is in the word.");
                for (int i = 0; i < word.length(); i++) {
                    if (word.charAt(i) == guessedLetter.charAt(0)) {
                        updatedHiddenWord.setCharAt(i * 2, guessedLetter.charAt(0));
                    }
                }
                hiddenWord = updatedHiddenWord.toString();
                System.out.println("Updated word: " + hiddenWord);
            } else {
                System.out.println("Oh-uh! This is incorrect, you have " + --lives + " lives left");
                hangmanAnimation.createHangman(lives);
            }
        }

        if (!hiddenWord.contains("_")) {
            System.out.println("Congratulations! You've guessed the word correctly: " + word);
        } else {
            System.out.println("Game over! The correct word was: " + word);
        }
    }
}

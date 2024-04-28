package org.example;

import java.util.Arrays;

public class RandomWords {
    private String[] wordBank = new String[]{"hospital", "laptop", "random", "ideology", "intellectual", "palace", "cultivating", "geography"};
    private String randomWord;

    public void setRandomWord(String randomWord) {
        this.randomWord = randomWord;
    }

    public String[] getWordBank() {
        return wordBank;
    }

    public void setWordBank(String[] wordBank) {
        this.wordBank = wordBank;
    }

    public String getRandomWord () {
        if (randomWord == null) {
            int randomIndex = (int) (Math.random() * wordBank.length);
            randomWord = wordBank[randomIndex];
        }
        return randomWord;
    }


    public int getRandomWordLength () {
        String word = getRandomWord();
        return word.length();
    }
}



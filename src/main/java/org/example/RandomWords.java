package org.example;

import java.util.Arrays;

public class RandomWords {

    private String[] wordBank = new String[]{"hospital", "laptop", "random", "ideology", "intellectual", "palace", "cultivating"};

    public String[] getWordBank() {
        return wordBank;
    }

    public void setWordBank(String[] wordBank) {
        this.wordBank = wordBank;
    }

    public String getRandomWord () {
        int randomIndex = (int) (Math.random() * wordBank.length);
        String randomWord = wordBank[randomIndex];
        return randomWord;
    }

}



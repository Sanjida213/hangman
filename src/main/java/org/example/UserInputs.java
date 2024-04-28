package org.example;

import java.util.Scanner;

import static java.nio.file.Files.readString;

public class UserInputs {
    private Scanner scanner = new Scanner(System.in);

    public UserInputs(Scanner scanner) {
        this.scanner = scanner;
    }

        public String getInput() {
        System.out.println("Enter your guess here:  ");
        String letterChosen = scanner.nextLine();

        if (letterChosen.length() > 1) {
            System.out.println("Please select only one letter");
            return getInput();
        } else {
            return letterChosen;
        }
    }
}
//    public String getInput() {
//        System.out.println("Enter your guess here :  ");
//        char letterChosen = scanner.next().charAt(0);
//
//        return ("letter chosen is: " + letterChosen);
//    }
//}

// The player is prompted to enter a letter as a guess.The program needs to capture their guess.
// If the letter is in the word the program should recognize this.
// If the letter is not in the word the player loses a life.
// The program should store the guesses
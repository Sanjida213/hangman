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
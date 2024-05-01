package org.example;

import java.util.Scanner;

import static java.nio.file.Files.readString;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RunningGame runningGame = new RunningGame(scanner);

        while(true) {
            runningGame.playGame();

            System.out.println("Press enter to play another round or type 'exit' to quit");
            String usersInput = scanner.nextLine();
            if (usersInput.equals("exit")) {
                System.out.println("Thanks for playing! Exiting the game.");
                break;
            }
        }
    }
}


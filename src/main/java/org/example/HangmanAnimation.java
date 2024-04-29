package org.example;

public class HangmanAnimation {

    public void createHangman (int lives) {

        if (lives == 7) {
            System.out.println("_______");
        }

        if (lives == 6) {
            System.out.println
                    ("|\n" +
                     "|\n" +
                     "|\n" +
                     "|\n" +
                     "|\n" +
                     "|\n" +
                  "|_______");
        }

        if (lives == 5) {
            System.out.println
                     ("_________\n" +
                     "|\n" +
                     "|\n" +
                     "|\n" +
                     "|\n" +
                     "|\n" +
                     "|\n" +
                  "|_______");
        }

        if(lives == 4) {
            System.out.println
                    ("_________\n" +
                    "|         |\n" +
                    "|\n" +
                    "|\n" +
                    "|\n" +
                    "|\n" +
                    "|\n" +
                 "|_______");
        }

        if(lives == 3) {
            System.out.println
                    ("_________\n" +
                    "|         |\n" +
                    "|       (. .)\n" +
                    "|\n" +
                    "|\n" +
                    "|\n" +
                    "|\n" +
                    "|_______");
        }

        if(lives == 2) {
            System.out.println
                    ("_________\n" +
                    "|         |\n" +
                    "|       (. .)\n" +
                    "|         |\n" +
                    "|         |\n" +
                    "|\n" +
                    "|\n" +
                 "|_______");
        }

        if(lives == 1) {
            System.out.println
                    ("_________\n" +
                    "|         |\n" +
                    "|       (. .)\n" +
                    "|         |\n" +
                    "|         |\n" +
                    "|        / \\ \n" +
                    "|\n" +
                 "|_______");
        }

        if(lives == 0) {
            System.out.println
                    ("_________\n" +
                    "|         |\n" +
                    "|       (. .)\n" +
                    "|       \\ | / \n" +
                    "|         |\n" +
                    "|        / \\ \n" +
                    "|\n" +
                 "|_______");
        }




    }
}

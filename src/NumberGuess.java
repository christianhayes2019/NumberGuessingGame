import java.util.Scanner;

public class NumberGuess {
    public static void main(String [] args) {

        int pickedNumber;
        Scanner keyboard;
        int userGuess;
        String userChoice;
        int totalTurns;

        boolean play = true;

        keyboard = new Scanner(System.in);

        do {
            totalTurns = 10;
            boolean wonGame = false;
            int numberOfTries = 0;
            pickedNumber = (int) (Math.random() * 100);
            System.out.println("The system is thinking of a number.");
            System.out.println("Guess a number from 0-100.");
            while (!wonGame && numberOfTries < totalTurns) {
                userGuess = keyboard.nextInt();
                numberOfTries++;
                if (userGuess == pickedNumber) {
                    System.out.println("CONGRATS YOU WIN!");
                    System.out.println("It took you " + numberOfTries + " tries to guess the number " + pickedNumber + "!");
                    System.out.println("Thanks for playing!");
                    wonGame = true;
                }
                else {
                    System.out.println("You have only "+ (totalTurns-numberOfTries) + " tries left!");

                    if (userGuess > pickedNumber) {
                        System.out.print("You're too high!");
                    } else if (userGuess < pickedNumber) {
                        System.out.print("You're too low!");
                    }
                }

                if (numberOfTries == totalTurns){

                    System.out.println("\nYOU LOSE!");

                }
            }
            do {
                System.out.print("Would you like to play again?");
                System.out.print(" Type \"Y or N\"");
                userChoice = keyboard.next().toLowerCase();
                if (userChoice.equalsIgnoreCase("y")) {
                    play = true;
                } else if (userChoice.equalsIgnoreCase("n")) {
                    play = false;
                } else {
                    System.out.println("I don't understand your answer, please answer again");
                }

            } while (!userChoice.equalsIgnoreCase("y") && !userChoice.equalsIgnoreCase("n"));
        }while(play);
        }
    }



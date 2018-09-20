import java.util.Scanner;

public class NumberGuess {
    public static void main(String [] args) {

        int pickedNumber;
        Scanner keyboard;
        int userGuess;
        int numberOfTries = 0;
        boolean wonGame =false;
        boolean play =true;
        pickedNumber = (int) (Math.random() * 100);
        keyboard = new Scanner(System.in);




            System.out.println("The system is thinking of a number.");
            System.out.println("Guess a number from 0-100.");
            while (!wonGame && numberOfTries < 10) {
                userGuess = keyboard.nextInt();
                numberOfTries++;

                if (userGuess > pickedNumber) {
                    System.out.print("You're too high!");
                } else if (userGuess < pickedNumber) {
                    System.out.println("You're too low!");
                }
                if (userGuess == pickedNumber) {
                    System.out.println("CONGRATS YOU WIN!");
                    System.out.println("It took you " + numberOfTries + " tries to guess the number " + pickedNumber + "!");
                    System.out.println("Thanks for playing!");
                }
                if (numberOfTries == 10) {
                    System.out.println("YOU LOSE!");
                    System.out.print("Please try again.");
                }
            }

    }
}



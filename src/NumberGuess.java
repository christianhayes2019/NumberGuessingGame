import java.util.Scanner;

public class NumberGuess {
    public static void main(String [] args) {

        int pickedNumber;
        Scanner keyboard;
        int userGuess;
        boolean wonGame =false;
        pickedNumber = (int) (Math.random() * 100);
        keyboard = new Scanner(System.in);


        System.out.println(pickedNumber);

        while (!wonGame) {
            System.out.println("The system is thinking of a number.");
            System.out.println("Guess a number from 0-100.");
            userGuess = keyboard.nextInt();
            if (userGuess > pickedNumber) {
                System.out.print("You're too high!");
            } else if (userGuess < pickedNumber) {
                System.out.println("You're too low!");
            }
            if (userGuess == pickedNumber) {
                System.out.println("CONGRATS!");
                System.out.print("The number is " + pickedNumber +"!");

                //wonGame = true;
                break;
            }

        }
        System.out.println(" Thanks for playing!");
    }
}



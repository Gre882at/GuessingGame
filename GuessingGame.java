import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int secretNumber = 10; // The number the user will try to guess
        int guess;
        int attempts = 3; // How many tries the user has

        System.out.println("Welcome to the Guessing Game!");
        System.out.println("You have " + attempts + " attempts to guess the number between 1 and 10.");

        // USING FOR LOOP → To give the user 3 attempts
        for (int i = 1; i <= attempts; i++) {
            System.out.print("Enter your guess: ");
            guess = input.nextInt();

            if (guess == secretNumber) {
                System.out.println("You guessed right!");
                break; // Stop the loop when the user guesses correctly
            } else {
                System.out.println("Wrong guess.");
            }
        }

        System.out.println("Thanks for playing!");
        input.close();
    }
}

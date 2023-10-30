import java.util.Random;
import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        // Define the range
        int min = 1;
        int max = 100;

        // Create a Random object
        Random random = new Random();

        // Generate a random number within the specified range
        int randomNumber = random.nextInt(max - min + 1) + min;

        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        int attempts = 0;
        boolean correctGuess = false;

        System.out.println("Guess the random number between " + min + " and " + max + ":");

        while (!correctGuess) {
            // Prompt the user for their guess
            System.out.print("Enter your guess: ");
            int userGuess = scanner.nextInt();
            attempts++;

            if (userGuess == randomNumber) {
                System.out.println("Congratulations! You guessed the correct number (" + randomNumber + ") in "
                        + attempts + " attempts.");
                correctGuess = true;
            } else if (userGuess < randomNumber) {
                System.out.println("Try again. Your guess is too low.");
            } else {
                System.out.println("Try again. Your guess is too high.");
            }
        }

        // Close the scanner
        scanner.close();
    }
}

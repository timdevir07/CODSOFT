import java.util.Random;
import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        boolean playAgain = true;

        while (playAgain) {
            playGame(); // Call the playGame() method for a single round

            // Ask the user if they want to play again
            System.out.print("Do you want to play again? (yes/no): ");
            String response = scanner.next().toLowerCase();

            if (!response.equals("yes")) {
                playAgain = false;
            }
        }

        // Close the scanner
        scanner.close();
    }

    public static void playGame() {
        // Define the range
        int min = 1;
        int max = 100;

        // Create a Random object
        Random random = new Random();

        // Generate a random number within the specified range
        int randomNumber = random.nextInt(max - min + 1) + min;

        int maxAttempts = 10; // Maximum number of attempts allowed
        int attempts = 0;
        boolean correctGuess = false;

        System.out.println("Guess the random number between " + min + " and " + max + ".");

        while (attempts < maxAttempts && !correctGuess) {
            // Prompt the user for their guess
            System.out.print("Enter your guess: ");
            Scanner scanner = new Scanner(System.in);
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

        if (!correctGuess) {
            System.out.println("Sorry, you've reached the maximum number of attempts (" + maxAttempts
                    + "). The correct number was " + randomNumber + ".");
        }
    }
}

import java.util.Random;

public class task1 {
    public static void main(String[] args) {
        int min = 1;
        int max = 10;
        Random random = new Random();

        // Generate a
        int randomNumber = random.nextInt(max - min + 1) + min;

        // Print the random number
        System.out.println("Random number between " + min + " and " + max + ": " + randomNumber);
    }
}

import java.util.Scanner;
import java.util.Random;

public class NumberGuessGame {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int secretNumber = random.nextInt(100) + 1;
        int guess = 0;
        int attempts = 0;

        System.out.println("=== Number Guessing Game ===");
        System.out.println("Guess a number between 1 and 100");

        while (guess != secretNumber) {

            System.out.print("Enter your guess: ");
            guess = sc.nextInt();

            attempts++;

            if (guess > secretNumber) {
                System.out.println("Too High!");
            }
            else if (guess < secretNumber) {
                System.out.println("Too Low!");
            }
            else {
                System.out.println("Correct!");
                System.out.println("You guessed it in " + attempts + " attempts.");
            }
        }

        sc.close();
    }
}
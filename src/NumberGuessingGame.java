import java.util.Random;
import java.util.Scanner;


public class NumberGuessingGame {
    public void numberGuessingGame() {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int guess;
        int attempts = 0;
        int min = 1;
        int max = 100;

        int randomNumber = random.nextInt(min, max + 1);

        System.out.println("Welcome to the number guessing game");
        System.out.printf("Guess a number between %d - %d\n", min, max);

        do{
            System.out.println("Enter your best guess: ");
            guess = scanner.nextInt();
            attempts++;

            if(guess < randomNumber) {
                System.out.println("Too low! Try again.");
            }
            else if (guess > randomNumber){
                System.out.println("Too high! Try again.");
            }
            else {
                System.out.println("Exellent! You guessed the number " + randomNumber);
                System.out.println("Number of attempts: " + attempts);
            }
        }
        while (guess != randomNumber);

        scanner.close();
    }
}

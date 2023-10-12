import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int minRange = 1;
        int maxRange = 100;
        int targetNumber = random.nextInt(maxRange - minRange + 1) + minRange;
        int attempts = 0;
        int score = 0;
        
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have generated a random number between " + minRange + " and " + maxRange + ".");
        
        boolean isCorrect = false;
        while (!isCorrect) {
            System.out.print("Enter your guess: ");
            int guess = scanner.nextInt();
            attempts++;
            
            if (guess == targetNumber) {
                System.out.println("Congratulations! You guessed the correct number.");
                isCorrect = true;
            } else if (guess < targetNumber) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("Too high! Try again.");
            }
        }
        
        score = maxRange - attempts + 1;
        System.out.println("Game over!");
        System.out.println("Your score: " + score);
        
        scanner.close();
    }
}

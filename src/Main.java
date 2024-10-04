import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Create a Scanner for user input and Random for computer choice
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Define the available choices
        String[] choices = {"Rock", "Paper", "Scissors"};

        // Start the game
        System.out.println("Welcome to Rock, Paper, Scissors!");
        System.out.print("Enter your move (Rock, Paper, or Scissors). To exit the game, type 'exit': ");

        // Game loop
        while (true) {
            // Get user input
            String userMove = scanner.nextLine();

            // If the user types "exit", break the loop and end the game
            if (userMove.equalsIgnoreCase("exit")) {
                System.out.println("Thanks for playing!");
                break;
            }

            // Check if the user entered a valid move
            if (!userMove.equalsIgnoreCase("Rock") && !userMove.equalsIgnoreCase("Paper") && !userMove.equalsIgnoreCase("Scissors")) {
                System.out.println("Invalid move! Please enter Rock, Paper, or Scissors.");
                continue;
            }

            // Get the computer's move
            int randomIndex = random.nextInt(3); // 0, 1, or 2
            String computerMove = choices[randomIndex];

            // Print the computer's move
            System.out.println("Computer move: " + computerMove);

            // Determine the winner
            if (userMove.equalsIgnoreCase(computerMove)) {
                System.out.println("It's a tie!");
            } else if (userMove.equalsIgnoreCase("Rock") && computerMove.equals("Scissors") ||
                    userMove.equalsIgnoreCase("Paper") && computerMove.equals("Rock") ||
                    userMove.equalsIgnoreCase("Scissors") && computerMove.equals("Paper")) {
                System.out.println("You win!");
            } else {
                System.out.println("You lose!");
            }

            System.out.println();
            System.out.print("Enter your next move (Rock, Paper, or Scissors). To exit, type 'exit': ");
        }

        // Close the scanner
        scanner.close();
    }
}
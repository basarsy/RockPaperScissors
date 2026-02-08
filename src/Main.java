import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        String[] options = {"rock", "paper", "scissors"};
        String userChoice;
        String computerChoice;
        String playAgain = "yes";

        do {
            System.out.print("Rock, Paper or Scissors? ");
            userChoice = sc.nextLine().toLowerCase();
            if (!userChoice.equals("rock") && !userChoice.equals("paper") && !userChoice.equals("scissors")){
                System.out.println("Invalid choice.");
                continue;
            }
            System.out.println("You chose: " + userChoice);

            computerChoice = options[random.nextInt(3)];
            System.out.println("Computer chooses: " + computerChoice);

            if (computerChoice.equals(userChoice)){
                System.out.println("It's a Tie!");
            }
            else if ((userChoice.equals("rock") && computerChoice.equals("scissors")) || (userChoice.equals("paper") && computerChoice.equals("rock")) || (userChoice.equals("scissors") && computerChoice.equals("paper"))){
                System.out.println("You win!");
                System.out.println("Would you like to play again? (yes/no) ");
                playAgain = sc.nextLine().toLowerCase();
            }
            else {
                System.out.println("You lose!");
                System.out.println("Would you like to play again? (yes/no) ");
                playAgain = sc.nextLine().toLowerCase();
            }
        }while (playAgain.equals("yes"));
        System.out.println("Thanks for playing!");
    }
}

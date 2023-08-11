package androidStd;

import java.util.Random;
import java.util.Scanner;

public class guessGame {
    public static void main(String[] args) {
        System.out.println("Welcome to the Guess game");

        Scanner aj = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String name = aj.nextLine();

        System.out.println("Hello " + name + "\nShould we START?");
        System.out.println("Enter Yes to continue or No to cancel.");
        String answer = aj.nextLine();

        if (answer.equalsIgnoreCase("yes")) {
            Random random = new Random();
            int numb = random.nextInt(20) + 1;
            System.out.println("There exist a number between 1 to 20.");
            System.out.println("Guess the number...");
            int guess = aj.nextInt();

            int count = 1;
            while (guess != numb) {
                count++;
                System.out.println("Guess the number...");
                guess = aj.nextInt();

                if (guess == numb) {
                    System.out.println("You did it!");
                    break;
                } else if (count == 5) {
                    System.out.println("Game Over!!!");
                    break;
                }
            }

        } else {
            System.out.println("You cancelled the game!!");
        }
    }
}

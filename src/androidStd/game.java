package androidStd;

import java.util.Random;
import java.util.Scanner;

public class game {
    public static void main(String[] args) {
        Scanner aj = new Scanner(System.in);

        System.out.println("shall we start?");
        System.out.println("1.Yes\n2.No");
        int begin = aj.nextInt();

        Random rn = new Random();
        int answer = rn.nextInt(20) + 1;
        System.out.println("Guess the number");
        int guess = aj.nextInt();

        int count = 0;
        boolean hasWon = false;
        boolean finished = false;

        while (!finished) {
            count++;
            if (count < 5) {
                if (guess == answer) {
                    hasWon = true;
                    finished = true;
                } else {
                    System.out.println("Try again..");
                    guess = aj.nextInt();
                }
            } else {
                finished = true;
            }
        }
        if (hasWon) {
            System.out.println("Congratulations!");
        } else {
            System.out.println("Game Over!!");
        }
    }
}

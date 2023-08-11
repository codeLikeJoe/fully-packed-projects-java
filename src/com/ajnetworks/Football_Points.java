package com.ajnetworks;

import java.util.Scanner;

public class Football_Points {
    static int wins, draws, losses, points, winsP, drawsP, lossesP;

    static void ask() {
        Scanner in = new Scanner(System.in);
        System.out.print("Wins : ");
        wins = in.nextInt();
        System.out.print("Draws : ");
        draws = in.nextInt();
        System.out.print("Losses : ");
        losses = in.nextInt();
        System.out.println();
    }

    public Football_Points(int Wins, int Draws, int Losses) {
        wins = Wins;
        draws = Draws;
        losses = Losses;
    }

    static void cal() {
        winsP = wins * 3;
        drawsP = draws;
        lossesP = 0;
        points = winsP + drawsP + lossesP;
    }

    static void main() {
        ask();
        cal();
        System.out.print("footballPoints(" + wins + "," + draws + "," + losses + ")");
        System.out.print("  >>> ");
        System.out.print(points + " points");
    }

    public static void main(String[] args) {
        //Football_Points point = new Football_Points();
        main();
    }
}

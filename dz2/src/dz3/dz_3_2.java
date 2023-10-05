package dz3;

import java.util.Scanner;

public class dz_3_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int currentScoreValue = scanner.nextInt();
        if (currentScoreValue >= 90) {
            System.out.println("Вы набрали - " + currentScoreValue + " очков и заняли первое место!");
        } else if (currentScoreValue < 90 && currentScoreValue >= 80) {
            System.out.println("Вы набрали - " + currentScoreValue + " очков и заняли второе место!");
        } else if(currentScoreValue < 80 && currentScoreValue >= 70) {
            System.out.println("Вы набрали - " + currentScoreValue + " очков и заняли третье место!");
        } else if (currentScoreValue < 70 ) {
            System.out.println("Вы не набрали достаточное количество очков");
        }

    }
}

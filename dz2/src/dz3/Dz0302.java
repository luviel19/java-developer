package dz3;

import java.util.Scanner;

public class Dz0302 {
    public static final String RED = "\033[0;31m";
    public static final String GREEN = "\033[0;32m";
    public static final String YELLOW = "\033[0;33m";
    public static final String BLUE = "\033[0;34m";
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int currentScoreValue = scanner.nextInt();
        if (currentScoreValue >= 90) {
            System.out.println(GREEN +"Вы набрали - " + currentScoreValue + " очков и заняли первое место!");
        } else if (currentScoreValue < 90 && currentScoreValue >= 80) {
            System.out.println(YELLOW+"Вы набрали - " + currentScoreValue + " очков и заняли второе место!");
        } else if(currentScoreValue < 80 && currentScoreValue >= 70) {
            System.out.println(BLUE+"Вы набрали - " + currentScoreValue + " очков и заняли третье место!");
        } else if (currentScoreValue < 70 ) {
            System.out.println(RED+"Вы не набрали достаточное количество очков");
        }

    }
}

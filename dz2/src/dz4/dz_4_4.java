package dz4;

import java.util.Random;
import java.util.Scanner;

public class dz_4_4 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int min = 1;
        int max = 101;
        int mid = (min + max) / 2;
        while (true) {
            mid = (min + max) / 2;
            System.out.println(mid);
            System.out.println("Если число больше введите 1");
            System.out.println("Если число меньше введите 2");
            System.out.println("Если компьютер угадал число введите 3");
            int var = scanner.nextInt();
            if (var == 1) {
                min = mid;
            } else if (var == 2) {
                max = mid;
            } else {
                System.out.println("Угадал число " + mid);
                return;
            }

        }
    }
}


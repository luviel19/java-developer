package dz5;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Dz0503 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int end = 0;
        int i = scanner.nextInt();
        int[] nummers = new int[i];

        while (i > end) {
            int massive_number = random.nextInt(300);
            if (massive_number > 0) {
                nummers[end] = massive_number;
                end++;
            }
        }
        int middle = 0;
        for(int avg_i = 0;avg_i < nummers.length;avg_i++) {
            middle += nummers[avg_i];
        }
        middle/=nummers.length;
        Arrays.sort(nummers);
        System.out.println(Arrays.toString(nummers));
        System.out.println("Максимально знчение " + nummers[nummers.length-1]);
        System.out.println("Минимальное значение " + nummers[0]);
        System.out.println("Cреднее арифметическое  значение " + middle );
    }
}


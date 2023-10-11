package dz5;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class dz5_3 {
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
        int max = nummers[0];
        int max_m;
        for (max_m = 0; max_m < nummers.length; max_m++) {
            if (max < nummers[max_m]) {
                max = nummers[max_m];
            }
        }
        int min = nummers[0];
        for (int min_m = 0; min_m < nummers.length; min_m++) {
            if (min > nummers[min_m]) {
                min = nummers[min_m];
            }
       }
int avg = 0;
        for(int avg_i = 0;avg_i < nummers.length;avg_i++){
            avg +=nummers[avg_i]/ nummers.length;
        }


        Arrays.sort(nummers);
        System.out.println(Arrays.toString(nummers));
        System.out.println("Максимально знчение " + max);
        System.out.println("Минимальное значение " + min);
        System.out.println("Cреднее арифметическое  значение " + avg);
    }
}


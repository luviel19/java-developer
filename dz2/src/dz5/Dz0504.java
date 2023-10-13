package dz5;

import static java.lang.Math.max;

public class Dz0504 {
    public static void main(String[] args) {
        int[] task04 =  {88, 34, 12, 55, 90, 4, 10, 44};

        int max_sum = 0;
        for (int i = 0; i < 4; ++i) {
            max_sum += task04[i];
        }
        int current_sum = max_sum;

        for (int i = 1; i < task04.length; ++i) {
            current_sum += task04[(i+3)%task04.length] - task04[i - 1];
            max_sum = max(max_sum, current_sum);
        }
        System.out.println(max_sum);
    }
    }


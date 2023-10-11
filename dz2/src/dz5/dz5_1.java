package dz5;
import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;

public class dz5_1 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int[] n1 = new int[14];
        int i = 0;
        while (n1.length > i) {
            int massive_number = random.nextInt(90)+10;
            if (massive_number > 11 && massive_number < 101 && massive_number % 2 == 0 ) {
                n1[i] = massive_number;
                i++;
            }
        }
        Arrays.sort(n1);
        System.out.println(Arrays.toString(n1));
    }
}

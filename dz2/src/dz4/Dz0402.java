package dz4;

import java.util.Scanner;

public class Dz0402 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = 0;
        int n2 = 0;
        while (true) {
            n2 = scanner.nextInt();
            n1 = n1 + n2;
            if (n2 == 0) {
                break;
            }
        }
        System.out.println(n1);
    }
}

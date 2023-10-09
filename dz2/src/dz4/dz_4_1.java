package dz4;

import java.util.Scanner;

public class dz_4_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите кол-во циклов");
        int x = scanner.nextInt();
        System.out.println("Введите шаг");
        int k = scanner.nextInt();
        int n = 0;
        for (int i = 1; i <= x; i++) {
            n += k;
            System.out.println(n);
        }
    }
}

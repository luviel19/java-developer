package dz4;

import java.util.Scanner;

public class dz_4_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите кол-во циклов");
        int x = scanner.nextInt(); //кол-во шагов в for i<=x
        System.out.println("Введите шаг");
        int k = scanner.nextInt(); // размер шага в n+=k
        int n = 0;
        for (int i = 1; i <= x/*кол-во шагов считываемый с консоли*/; i++) {
            n += k;//размер шага
            System.out.println(n);
        }
    }
}


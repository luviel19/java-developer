package dz3;

import java.util.Scanner;

public class Dz0303 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите координату х");
        int x = scanner.nextInt();
        System.out.println("Введите координату y");
        int y = scanner.nextInt();
        if (x > 0 && y > 0) {
            System.out.println("Точка пренадлежит к первой четверти");
        } else if (x < 0 && y > 0) {
            System.out.println("Точка пренадлежит ко второй четверти");
        } else if (x < 0 && y < 0) {
            System.out.println("Точка пренадлежит к третьей  четверти");
        } else if (x > 0 && y < 0) {
            System.out.println("Точка пренадлежит к четвертой четверти");
        }
    }
}

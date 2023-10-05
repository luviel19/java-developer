// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberFloor = scanner.nextInt();
        switch (numberFloor) {
            case 1, 2 -> System.out.println("На этаже " + numberFloor + " - 7 квартир");
            case 3, 4 -> System.out.println("На этаже " + numberFloor + " - 5 квартир");
            case 5, 6 -> System.out.println("На этаже " + numberFloor + " - 2 квартиры");
            default -> System.out.println("error");
        }

    }
}
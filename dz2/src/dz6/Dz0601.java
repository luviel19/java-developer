package dz6;

import java.util.Scanner;

public class Dz0601 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        String revers = new StringBuilder(str).reverse().toString();
        System.out.println(str.equalsIgnoreCase(revers));


    }
}

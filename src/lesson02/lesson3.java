package lesson02;

import java.util.Scanner;

public class lesson3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n1 = scanner.nextDouble();
        while (true) {
            String n2 = scanner.next();

            if (n2.equals("S")) {
                System.out.println(n1);
                break;}
            double n3 = scanner.nextDouble();
           if (n2.equals("-")) {
                n1 = n1 - n3;
            } else if (n2.equals("*")) {
                n1 = n1 * n3;
            } else if (n2.equals("/")) {
                n1 = n1 / n3;
            } else if (n2.equals("+")) {
                n1 = n1 + n3;
            } else {
                System.out.println("error");
                break;
            }
        }

    }
}

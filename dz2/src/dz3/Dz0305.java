package dz3;

import java.util.Scanner;

public class Dz0305 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер купона");
        int couponNumber = scanner.nextInt(); //номер купона
        System.out.println("Введите сумму к оплате");
        double resultSum = scanner.nextDouble(); // сумма покупки
        double discound;
        switch (couponNumber) {
            case 1111:
                //10%
                discound = (resultSum / 100)*90 ;
                System.out.println("Сумма к оплате - " + discound + " рублей");
                break;
            case 3333:
                //20%
                discound = (resultSum / 100)*80;
                System.out.println("Сумма к оплате - " + discound + " рублей");
                break;
            case 5555:
                //30%
                discound = (resultSum / 100)*70;
                System.out.println("Сумма к оплате - " + discound + " рублей");
                break;
            default:
                System.out.println("Сумма к оплате - " + resultSum + " рублей");
                break;
        }

    }
}

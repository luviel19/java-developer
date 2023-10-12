package dz3;
import java.util.Scanner;
public class Dz0304 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите месяц");
        int monthNumber = scanner.nextInt();
        System.out.println("Год високосный?");
        System.out.println("1-Да");
        System.out.println("2-Нет");
        int isLeap = scanner.nextInt();
        int days;
        if (isLeap == 1){
            switch (monthNumber){
            case 1,3,5,7,10,12-> System.out.println("31");
            case 2 ->System.out.println("28") ;
            case 4,6,9,11->System.out.println("30");
            }

        } else if (isLeap == 2) {
             switch (monthNumber){
            case 1,3,5,7,10,12-> System.out.println("31");
            case 2 -> System.out.println("29");
            case 4,6,9,11->System.out.println("30");
            };
        }

    }
}

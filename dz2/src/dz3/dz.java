package dz3;
import java.util.Scanner;
public class dz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = 0;
        int n2 = 0;
        int n3 = 0;
        while (scanner.hasNext() && (n1 = scanner.nextInt())>0){
            n1=scanner.nextInt();
            n2++;
            n3=n3+n1;
        }
        System.out.println("колличество введёных чисел" + n2);
        System.out.println("Среднее арифметическое"+ n3/n2);
        System.out.println("макс значение "+n3);
    }
}

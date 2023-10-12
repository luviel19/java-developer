package dz4;
import java.util.Random;
import java.util.Scanner;
public class Dz0403 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int n = random.nextInt(9);
        int n2;
        while (true){
            n2 = scanner.nextInt();
            if(n<n2){
                System.out.println("Загаданное число меньше");
            }else if (n==n2){
                System.out.println("Вы угадали число");
                break;
            }else{
                System.out.println("Загаданное число больше");
            }
        }
    }
}
   
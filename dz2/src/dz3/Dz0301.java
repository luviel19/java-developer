package dz3;
import java.util.Random;

public class Dz0301 {
    public static void main(String[] args) {
Random random = new Random();
int n1 = random.nextInt(490)+10;
        System.out.println(n1);
        if (n1>25 && n1<200){
            System.out.println("Число " + n1 + " содержиться в интервале (25;200)");
        }else{
            System.out.println("Число " + n1 + " не содержиться в интервале (25;200)");

        }
    }
}

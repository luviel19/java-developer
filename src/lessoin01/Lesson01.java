
package lessoin01;
import java.util.Scanner;
public class Lesson01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n1, n2;
        n1 = -0;
        String m;
        while (true) {
            n2 = scanner.nextDouble();
            m = scanner.next();
            if (m.equals("S"))
            {
                break;}
            if (m.equals("-")) {
                n1=n1 - n2;
            } else {
                n1 = n1 + n2;
            }

        }
        System.out.println(n1);
    }
}


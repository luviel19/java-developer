import java.util.Scanner;


public class lesson02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите мбо ");
        int mbo = scanner.nextInt();
        System.out.println("введите выставелнное мбо ");
        int m = scanner.nextInt();
        System.out.println("введите часы касира ");
        int k = scanner.nextInt();
        System.out.println("введите часы опп ");
        int o = scanner.nextInt();

        System.out.println("введите часы продавца ");
        int p = scanner.nextInt();
        System.out.println("введите кол-во штат ");
        int s = scanner.nextInt();
        System.out.println("введите то ");
        int to = scanner.nextInt();
        int prem, zp;
        if (mbo >= 120) {
            prem = (24000 * s) / 100 * m;
        } else if (mbo >= 110) {
                prem = (22000 * s) / 100 * m;
            } else if (mbo >= 100) {
                    prem = (20000 * s) / 100 * m;
                } else if (mbo >= 90){

                prem = (18000 * s) / 100 * m;
            } else if (mbo >= 80) {
                    prem = (16000 * s) / 100 * m;
                } else {
                    prem = 0;
                }


            double tov = ((to * 0.5) / 1080) * (k + o + p);
            k = k * 138;
            o = o * 172;
            p = p * 133;
            double Zp = k + o + p + tov + prem;
            System.out.println("ваша зарплата = " + Zp);

        }
        }

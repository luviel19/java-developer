import java.util.Scanner;

public class dz_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер задания к которому хотите перейти - 1,2,3,4.");
        String variant = scanner.next();
        if (variant.equals("1")) {
            //Задача 1
            System.out.println("Введите общее число сообщений.");
            int allMail = scanner.nextInt();
            System.out.println("Введите число отправленных сообщений.");
            int sendMail = scanner.nextInt();
            int mail = allMail - sendMail;
            System.out.println("Осталось отправить - " + mail + " Сообщений");
            //Задача 2
        } else if (variant.equals("2")) {
            System.out.println("Выберите что вы хотите сделать");
            System.out.println("1-перевести км/ч в м/c");//1
            System.out.println("2-перевести m/c в км/ч");//2
            System.out.println("3-Узнать скорость движения");//3
            System.out.println("4-Узнать время");//4
            System.out.println("5-Узнать расстояние");//5
            String dz2 = scanner.next();
            if (dz2.equals("1")) { //1 км/ч в м/c
                System.out.println("Введите км/ч");
                Double kH = scanner.nextDouble();
                Double mS = kH * 1000 / 3600;
                System.out.println(kH + " км/ч = " + mS + " м/c");

            } else if (dz2.equals("2")) { //2 m/c в км/ч
                System.out.println("Введите м/c");
                Double mS = scanner.nextDouble();
                Double kH = mS * 3600 / 1000;
                System.out.println(mS + " M/c= " + kH + " Км/ч");

            } else if (dz2.equals("3")) {//3 Узнать скорость движения distance / time = speed
                System.out.println("Введите расстояние");
                double time = scanner.nextDouble();
                System.out.println("Введите время");
                double distance = scanner.nextDouble();
                double speed = distance / time;
                System.out.println("Скорость движения = " + speed);

            } else if (dz2.equals("4")) {//4 Узнать время distance / speed = time
                System.out.println("Введите расстояние");
                double distance = scanner.nextDouble();
                System.out.println("Введите скорость");
                double speed = scanner.nextDouble();
                double time = distance / speed;
                System.out.println("Затраченное время = " + time);

            } else if (dz2.equals("5")) {//5 Узнать расстояние speed * time = distance
                System.out.println("Введите скорость");
                double speed = scanner.nextDouble();
                System.out.println("Введите время");
                double time = scanner.nextDouble();
                double distance = time * speed;
                System.out.println("Дистанция = " + distance);
            } else {
                System.out.println("error");
            }
            //задание 3
        } else if (variant.equals("3")) {
            System.out.println("Введите двухзначное число");
            int first = scanner.nextInt();
            int second = first % 10;
            int w = first / 10;
            int u = second + w;
            System.out.println("Cумма цифер целого числа = " + u);
            //заданеи 4
        } else if (variant.equals("4")) {
            System.out.println("Введите первое число");
            int firstCount = scanner.nextInt();
            System.out.println("Введите первое число");
            int secondCount = scanner.nextInt();
            firstCount = firstCount + secondCount;
            secondCount = firstCount - secondCount;
            firstCount = firstCount - secondCount;
            System.out.println(firstCount);
            System.out.println(secondCount);

    } else {
            System.out.println("error");
        }

    }
}







package com.company.luviel19.lesson10;

import java.util.Scanner;

public class Lesson10 {
    public static void main(String[] args) {
        Item item01 = new Item("ПК", 280000);
        Item item02 = new Item("ПК", 280000);
        Item item03 = new Item("ручка", 391);
        Item copyItem = item01.clone();
        //toString() возвращение строковое представление
        //наследуется от класса object
        System.out.println(item01.toString());
        //Arrays.equadls
        //equadl()
        System.out.println(item01.equals(item03));
        //Arrays.equals(new  Item[]{item01,item02},new Item[]{item01,item02});
        Order order01 = new Order(new Item[]{item01, item02});
        Order order02 = new Order(new Item[]{item01, item02});
        Order copy = order01.clone();
        System.out.println(copy == order01);//false

        Scanner scanner = new Scanner(System.in);

       //Auth auth;
        System.out.println("имя пользовотеля ");
        String username = scanner.nextLine();
        System.out.println("Пароль");
        String password = scanner.nextLine();
        System.out.println();
        String authType = scanner.nextLine();
        Auth auth = Auth.getAuth(authType);
        /*if (authType.equals("github")) {
            auth = new GAuth();
        } else {
            auth = new AppAuth();
        }*/
        auth.login(username,password);





    }
}


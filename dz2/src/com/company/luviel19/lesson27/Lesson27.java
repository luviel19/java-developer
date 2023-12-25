package com.company.luviel19.lesson27;

import java.util.ArrayList;
import java.util.List;

public class Lesson27 {


    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("1");
        stringList.add("2");
        stringList.add("3");
        stringList.add("4");

        ThreadTask threadTask01 = new ThreadTask(stringList);
        threadTask01.setName("ThreadTast01");
        threadTask01.printList();
        threadTask01.run();
        threadTask01.start();


        ThreadTask threadTask02 = new ThreadTask(stringList);
        threadTask02.setName("ThreadTast02");
        threadTask02.printList();
        threadTask02.run();
        threadTask02.start();

        RunnableTask runnableTask = new RunnableTask("task");
        Thread threadWithRunnable = new Thread(runnableTask);
        System.out.println(threadWithRunnable.getState());
        threadWithRunnable.start();
Thread threadWithLambda = new Thread(()->{
            System.out.println(Thread.currentThread().getName());
        });
threadWithLambda.setDaemon(true);
threadWithLambda.start();
        System.out.println("main");
        threadWithLambda.start();
    }

}

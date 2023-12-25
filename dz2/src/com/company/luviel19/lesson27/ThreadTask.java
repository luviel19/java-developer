package com.company.luviel19.lesson27;

import java.util.List;

public class ThreadTask extends Thread {
    private List<String> stringList;


    public ThreadTask(List<String> stringList) {
        this.stringList = stringList;
        System.out.println("Constricrot " +
                Thread.currentThread().getName());
    }

    public void printList() {
        stringList.forEach(System.out::println);
        stringList.forEach(str -> System.out.println(str));
    }

    public void run() {
        System.out.println(Thread.currentThread().getName());
        printList();
    }

}

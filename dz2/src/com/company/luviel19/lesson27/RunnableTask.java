package com.company.luviel19.lesson27;

import java.util.List;

public class RunnableTask implements Runnable{
    private String string;
    public RunnableTask(String string){
        this.string = string;
    }
    public void print(){
        System.out.println(string.toUpperCase());
    }
    public void run(){
        print();
    }

}

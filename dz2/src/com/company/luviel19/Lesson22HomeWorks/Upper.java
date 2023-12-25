package com.company.luviel19.Lesson22HomeWorks;

public class Upper extends BaseDecorator {
    public Upper(AppLogger logger) {super(logger);}
    public void log(String message){
        super.log(message.toUpperCase());
    }
}

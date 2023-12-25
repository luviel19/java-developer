package com.company.luviel19.Lesson22HomeWorks;

public class BaseDecorator implements AppLogger{
    private AppLogger logger;
    public BaseDecorator(AppLogger logger){
        this.logger = logger;
    }
    public void log(String message){
        logger.log(message);
    }
}

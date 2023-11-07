package com.company.luviel19.exam.exam01;

import java.time.LocalTime;

public enum TypeOfSubscription {
    ONE_TIME("OneTime",LocalTime.of(8,00),LocalTime.of(22,00)),
    DAYTIME("DAYTIME",LocalTime.of(8,00), LocalTime.of(16,00)),
    FUL("FUL",LocalTime.of(8,00),LocalTime.of(22,00)),
    GYM("GYM"),
    POOL("POOL"),
    GROUP("GROUP");
   private String name;
    private LocalTime start;
    private LocalTime end;
    TypeOfSubscription(String name, LocalTime start, LocalTime end) {
        this.name = name;
        this.start = start;
        this.end = end;
    }

    TypeOfSubscription(String gym) {
    }


    public String getName() {
        return name;
    }

    public LocalTime getStart() {
        return start;
    }

    public LocalTime getEnd() {
        return end;
    }
}

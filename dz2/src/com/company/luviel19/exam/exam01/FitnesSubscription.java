package com.company.luviel19.exam.exam01;

import java.time.LocalDate;
import java.time.Month;

public class FitnesSubscription {
    private TypeOfSubscription typeOfSubscription;
    private int numberSubscription  = 30;
    private LocalDate registration = LocalDate.now();
    private LocalDate current_date = LocalDate.now();
    private LocalDate end_date_registration = LocalDate.of(9999, Month.OCTOBER, 25);;

    private Subscription subscription;

    public FitnesSubscription(TypeOfSubscription typeOfSubscription, Subscription subscription){
        this.typeOfSubscription = typeOfSubscription;
        this.subscription = subscription;
    }
    public void getDate() {
        System.out.println("текущая дата " + registration);
        System.out.println("end_date " + end_date_registration);
        boolean isBefore = registration.isBefore(end_date_registration);
        System.out.println("isBefore: " + isBefore);
    }

    public TypeOfSubscription getTypeOfSubscription() {
        return typeOfSubscription;
    }

    public int getNumberSubscription() {
        return numberSubscription;
    }

    public LocalDate getRegistration() {
        return registration;
    }

    public LocalDate getCurrent_date() {
        return current_date;
    }

    public LocalDate getEnd_date_registration() {
        return end_date_registration;
    }

    public Subscription getSubscription() {
        return subscription;
    }

    @Override
    public String toString() {
        return "FitnesSubscription{" +
                "typeOfSubscription=" + typeOfSubscription +
                ", numberSubscription=" + numberSubscription +
                ", registration=" + registration +
                ", current_date=" + current_date +
                ", end_date_registration=" + end_date_registration +
                ", subscription=" + subscription +
                '}';
    }
}

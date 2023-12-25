package com.company.luviel19.exam.exam01;

public class Name {
    public static void main(String[] args) {
Fitness fitness = new Fitness();

        Subscription subscription01 = new Subscription("Данила", "Сметанин", 2001);
        Subscription subscription02 = new Subscription("Роман", "Аверин", 1999);
        Subscription subscription03 = new Subscription("Валентина", "Миллер", 1995);
        Subscription subscription04 = new Subscription("Екатерина","Сметианина",2005 );

        FitnesSubscription fitnesSubscriptionOne = new FitnesSubscription(TypeOfSubscription.ONE_TIME, subscription01);
        FitnesSubscription fitnesSubscriptionDay = new FitnesSubscription(TypeOfSubscription.DAYTIME, subscription02);
        FitnesSubscription fitnesSubscriptionFull = new FitnesSubscription(TypeOfSubscription.FUL, subscription03);
        FitnesSubscription fitnesSubscriptionOne01 = new FitnesSubscription(TypeOfSubscription.ONE_TIME, subscription03);


        fitness.addClient(fitnesSubscriptionFull, TypeOfSubscription.GYM);
        fitness.closedFitness();
    }
}
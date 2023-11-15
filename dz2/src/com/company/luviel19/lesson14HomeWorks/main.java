package com.company.luviel19.lesson14HomeWorks;

public class main {
    public static void main(String[] args) {
       User<Number> user01 = new User<>();
        User<String> user02= new User<>();
        PairContainer<Number,String> pairContainer01 = new PairContainer<>(1,"Ufa");
        PairContainer<String,User<Number>> pairContainer02 = new PairContainer<>("Danil",user01);
        PairContainer<Number,User<String>> pairContainer03 = new PairContainer<>(19,user02);
        PairContainer<String,PairContainer<Number,User<String>>> pairContainer04 = new PairContainer<>("Danil",pairContainer03);
    }
}

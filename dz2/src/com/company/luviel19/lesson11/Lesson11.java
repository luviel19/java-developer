package com.company.luviel19.lesson11;

public class Lesson11 {
    public static void main(String[] args) {
        Country france = Country.FRANCE;
        Article article = new Article(Country.ITALY);
        System.out.println(france == article.getCountry());
        Country[] countries = Country.values();
    }
}

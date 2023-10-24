package com.company.luviel19.lesson11;

public class Article {

    private Country country; // null

        public Article(Country country) {
            this.country = country;
        }

        public Country getCountry() {
            return country;
        }

        public void setCountry(Country country) {
            this.country = country;
        }
    }

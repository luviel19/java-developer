package com.company.luviel19.lesson10;

public class GAuth implements  Auth{
    @Override
    public boolean login(String username, String password) {
        return false;
    }

    @Override
    public boolean logout() {
        return false;
    }


}

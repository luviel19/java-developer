package com.company.luviel19.lesson10;
// final / sealed . permits / non-sealed
public final class AppAuth implements Auth {
    public boolean login(String username, String password){
        return false;
    }
    @Override
    public boolean logout() {
        return false;
    }
}

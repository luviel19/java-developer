package com.company.luviel19.lesson10;

public interface Auth {
    static Auth getAuth(String authType) {
        Auth auth;
        if (authType.equals("github")) {
            auth = new GAuth();
        } else {
            auth = new AppAuth();
        }
        return auth;
    }

    boolean login(String username, String password);
    boolean logout();
}
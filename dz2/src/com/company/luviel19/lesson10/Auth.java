package com.company.luviel19.lesson10;

public sealed interface Auth //sealed - ограничение доступа для выделенных классов
    permits GAuth,AppAuth {
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
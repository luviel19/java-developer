package com.company.luviel19.lesson18;

public interface iPay {
    boolean pay(int amount);

    default iPay addPay(iPay another) {
        return (amount) -> {
            if (!pay(amount)) {
                return another.pay(amount);
                return false;
            }
        };
    }
}


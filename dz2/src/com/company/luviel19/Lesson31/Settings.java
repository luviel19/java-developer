package com.company.luviel19.Lesson31;

import java.io.Serializable;

public class Settings implements Serializable {
    private static Settings settings;

    private Settings() {
    }

    public static Settings getSettings() {
        if (settings == null) settings = new Settings();
        return settings;
    }



}
/*enum Settings01{
    APP_SETTINGS();
    private String string;
    private int anInt;
}
Settings01 obj = Settings01.APP_SETTINGS;
*/
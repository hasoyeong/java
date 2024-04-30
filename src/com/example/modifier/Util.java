package com.example.modifier;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Util {
    public static String getCurrentDate(String msg) {
        SimpleDateFormat sdf = new SimpleDateFormat();
        return sdf.format(new Date());

    }
}

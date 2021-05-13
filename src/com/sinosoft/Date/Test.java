package com.sinosoft.Date;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


/*
* string----->java.util.date
*
* 1.string--->java.sql.date
* 2.java.sql.date--->java.util.date
* */
public class Test {
    public static void main(String[] args) throws ParseException {
       /* java.sql.Date date = Date.valueOf("1996-05-06");
        java.util.Date d = date;*/
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //string--->Date
        Date d = df.parse("1996-05-06 06:06:06");
        //Date--->string
        String format = df.format(d);
        System.out.println(format);

    }
}

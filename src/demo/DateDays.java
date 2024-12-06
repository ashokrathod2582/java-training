package demo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.*;

public class DateDays {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdformat = new SimpleDateFormat("MM/dd/yyyy");
        String s1 = "4/23/2023";
        String s2 = "10/23/2023";
        Date date1 = sdformat.parse(s1);
        Date date2 = sdformat.parse(s2);
        long df = date2.getTime() - date1.getTime();
        long days = TimeUnit.DAYS.convert(df,TimeUnit.MILLISECONDS);
        System.out.println("days : "+ days);
    }
}

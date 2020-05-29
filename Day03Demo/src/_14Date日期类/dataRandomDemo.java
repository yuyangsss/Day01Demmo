package _14Date日期类;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;



public class dataRandomDemo {
    public static void main(String[] args) throws ParseException {
       // Random random=new Random();
        String s1="1995.01.01 00:00:00";
        String s2="1995.12.31 23:59:59";
        SimpleDateFormat sdf= new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
        Date date=sdf.parse(s1);
        Date date1=sdf.parse(s2);
        long a=date.getTime();
        long b=date1.getTime();
        long c=(long)(Math.random()*(b-a)+a);

        System.out.println(sdf.format(c));




    }
}

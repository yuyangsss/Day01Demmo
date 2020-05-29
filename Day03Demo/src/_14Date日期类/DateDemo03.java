package _14Date日期类;

import java.util.Date;

/**
 目标:Date类的有参数构造器的使用。

 构造器：
 -- public Date():创建当前系统的此刻日期时间对象。
 -- public Date(long time):把时间毫秒值转换成日期对象。
 流程：
 Date日期对象 -> getTime() -> 时间毫秒值
 时间毫秒值 -> new Date(时间毫秒值) -> Date日期对象
 小结：
 public Date(long time):把时间毫秒值转换成日期对象。
 */
public class DateDemo03 {
    public static void main(String[] args) {
        //拿到当前时间对象的毫秒值
        Date a=new Date();
        //获取100秒后的时间毫秒值
        long time=a.getTime()+100*10000;
        //创建一个有有参构造器，把毫秒值转换成时间对象
        Date a1=new  Date(time);

        System.out.println(a);
        System.out.println(a1);


    }
}

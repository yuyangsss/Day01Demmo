package _01DateFormat时间格式化类;
/**
 目标：DateFormat简单日期格式化类的使用。

 引入：
 我们之前得到的Date日期对象或者时间毫秒值的时间形式
 开发中并不喜欢，不符合有些时间格式的需求。

 DateFormat作用：
 1.可以把“日期对象”或者“时间毫秒值”格式化成我们喜欢的时间形式。（格式化时间）
 2.可以把字符串的时间形式解析成日期对象。（解析字符串时间）

 DateFormat是一个抽象类，不能直接使用，要找它的子类：SimpleDateFormat
 我们需要用的是简单日期格式化类：SimpleDateFormat

 SimpleDateFormat简单日期格式化类：
 包：java.text.SimpleDateFormat
 构造器：public SimpleDateFormat(String pattern)：
 指定时间的格式创建简单日期格式化对象。
 方法：
 -- public String format(Date date):可以把日期对象格式化成我们喜欢的时间形式，返回的是字符串!
 -- public String format(Object time):可以把时间毫秒值格式化成我们喜欢的时间形式，返回的是字符串!
 -- public Date parse(String date) throws ParseException:把字符串的时间解析成日期对象
 小结：
 简单日期格式化类SimpleDateFormat可以把日期对象格式化成我们喜欢的时间形式
 -- public String format(Date date):可以把日期对象格式化成我们喜欢的时间形式，返回的是字符串!

 */
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo01 {
    public static void main(String[] args) {
        Date d=new Date();
        d.getTime();
        System.out.println(d);

        SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd日  HH:mm:ss EEE a");
        // 3.开始调用方法格式化时间得到格式化的字符串时间形式
        System.out.println(sdf.format(d));
    }
}

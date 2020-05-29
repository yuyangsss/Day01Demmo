package _05Collections工具类;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 目标：Collections工具类的使用。

 java.utils.Collections:是集合工具类
 Collections并不属于集合，是用来操作集合的工具类。
 Collections有几个常用的API:
 - public static <T> boolean addAll(Collection<? super T> c, T... elements)
 给集合对象批量添加元素！
 - public static void shuffle(List<?> list) :打乱集合顺序。
 - public static <T> void sort(List<T> list):将集合中元素按照默认规则排序。
 - public static <T> void sort(List<T> list，Comparator<? super T> ):将集合中元素按照指定规则排序。

 */
public class CollectionDemo01 {
    public static void main(String[] args) {
        //1.给集合批量添加元素
        List<String> names=new ArrayList<>();
        /**
         1.被添加的元素的集合
         2.可变参数，一批元素
         */
        Collections.addAll(names,"嘈杂","王是","sds");
        System.out.println(names);

        //2.打乱集合的顺序：public static void shffle(List<?>list)
        //注意：只能打乱有序的List集合
        List<String> newnames=new ArrayList<>();
        Collections.addAll(newnames,"曹操","贾乃亮","王宝强","陈羽凡","陈羽凡");
        Collections.shuffle(newnames);//d打乱顺序
        System.out.println(newnames);

        //3.public static <T> void sort(List<T> list)给List集合升序排序
        List<Double> scores=new ArrayList<>();
        Collections.addAll(scores, 98.5, 66.5 , 59.5 , 66.5 , 99.5 );
        Collections.sort(scores);
        System.out.println(scores);
    }
}

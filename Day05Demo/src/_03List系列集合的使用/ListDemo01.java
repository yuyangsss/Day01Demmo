package _03List系列集合的使用;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

/**
 目标：Collection集合的遍历方式。

 什么是遍历? 为什么开发中要遍历？
 遍历就是一个一个的把容器中的元素访问一遍。
 开发中经常要统计元素的总和，找最值，找出某个数据然后干掉等等业务都需要遍历。

 Collection集合的遍历方式是全部集合都可以直接使用的，所以我们学习它。
 Collection集合的遍历方式有三种:
 （1）迭代器。
 （2）foreach(增强for循环)。
 （3）JDK 1.8开始之后的新技术Lambda表达式。
 c.JDK 1.8开始之后的新技术Lambda表达式。(暂时了解)
 */
public class ListDemo01 {
    public static void main(String[] args) {
        //1.创建一个ArrayList集合对象：这是一行经典代码！
        //list:有序，可重复，有索引的
        List<String> lists=new ArrayList<>();
        lists.add("java1");
        lists.add("java1");
        lists.add("java2");
        lists.add("java2");
        System.out.println(lists);

        //2.在某个索引位置插入元素
        lists.add(2,"mysql");
        System.out.println(lists);

        //3.根据索引删除元素，返回被删除元素
        System.out.println(lists.remove(2));
        System.out.println(lists);

        //4.根据索引获取元素
        System.out.println(lists.get(2));//java2

        //2.修改索引位置处的元素
        lists.set(3,"Mybatis");
        System.out.println(lists);
    }
}

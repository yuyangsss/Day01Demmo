package _03Map集合的遍历;

import java.util.HashMap;
import java.util.Map;
/**
 目标：Map集合的遍历方式。

 Map集合的遍历方式有：3种。
 （1）“键找值”的方式遍历：先获取Map集合全部的键，再根据键找值。
 （2）“键值对”的方式遍历：难度较大。
 （3）JDK 1.8开始之后的新技术：Lambda表达式。

 c.JDK 1.8开始之后的新技术：Lambda表达式。（暂时了解）

 */
public class MapDemo03 {
    public static void main(String[] args) {
        Map<String ,Integer> maps=new HashMap<>();
        maps.put("哇哇",30);
        maps.put("iphoneX",100);//  Map集合后面重复的键对应的元素会覆盖前面重复的整个元素！
        maps.put("huawei",1000);
        maps.put("生活用品",10);
        maps.put("手表",10);
        System.out.println(maps);
        // maps = {huawei=1000, 手表=10, 生活用品=10, iphoneX=100, 娃娃=30}


        maps.forEach((k,v)->{
            System.out.println(k+"=>"+v);
        });
    }
}

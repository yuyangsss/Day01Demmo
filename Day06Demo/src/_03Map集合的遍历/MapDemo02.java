package _03Map集合的遍历;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo02 {
    public static void main(String[] args) {
        Map<String ,Integer> maps=new HashMap<>();
        maps.put("哇哇",30);
        maps.put("iphoneX",100);//  Map集合后面重复的键对应的元素会覆盖前面重复的整个元素！
        maps.put("huawei",1000);
        maps.put("生活用品",10);
        maps.put("手表",10);
        System.out.println(maps);
        // maps = {huawei=1000, 手表=10, 生活用品=10, iphoneX=100, 娃娃=30}
        /**
         “键值对”的方式遍历：更加面向对象的方式，代码复杂。

         “键值对”想把键值对当成一个整体遍历，也就是直接使用foreac遍历：
         for(被遍历集合的元素类型 变量：集合名称){

         }
         但是发现Map集合的键值对数据直接是没有元素类型的，foreach无法直接遍历Map集合。
         👇
         把Map集合通过代码Set<Map.Entry<K, V>> entrySet()转换成Set集合。
         👇
         Set<Map.Entry<String,Integer>> entries = maps.entrySet();
         👇
         entries = [(huawei=1000), (手表=10), (生活用品=10), (iphoneX=100), (娃娃=30) ]
         //                         entry
         此时键值对元素才能作为一个整体就有了类型。类型是 Map.Entry<String,Integer>实体类型
         */


        Set<Map.Entry<String,Integer>> entries=maps.entrySet();
        for(Map.Entry<String,Integer> entry:entries){
            String key=entry.getKey();
            Integer value=entry.getValue();
            System.out.println(key+"=>"+value);



        }
    }
}

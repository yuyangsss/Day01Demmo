package _09泛型的好处;

import java.util.ArrayList;

/*
    目标：泛型的好处
    泛型在编译阶段约束了操作的数据类型，从而不会出现类型转换异常。
    体现了Java的严谨性和规范性，数据类型，经常需要进行统一！！
 */
public class GenericDemo {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("张无惧");
        list.add("赵敏");
//        list.add(false);
//        list.add(654);
        for(int i=0;i<list.size();i++){
            String ele=list.get(i);
            System.out.println(ele);
        }
    }
}

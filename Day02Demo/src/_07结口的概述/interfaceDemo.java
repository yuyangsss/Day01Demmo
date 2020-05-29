package _07结口的概述;
/**
 目标：接口的概述和定义等。（以理解和记住语法为主）

 什么是接口？
 接口是更加彻底的抽象，接口中全部是抽象方法和常量，没有其他成分。（JDK 1.8之前）

 接口有啥用?
 接口体现的是规范思想，实现接口的类必须重写完接口中全部的抽象方法。
 规范 == 约束。
 接口称为被实现，实现接口的类称为实现类。

 定义接口的格式：
 修饰符 interface 接口名称{

 }
 interface:定义接口的关键字。

 接口中的成分研究（JDK 1.8之前）：
 1.抽象方法
 a.接口中的抽象方法默认会加上public abstract修饰,所以可以省略不写。
 2.常量
 常量：是指有public static final修饰的成员变量，有且仅能被赋值一次，值不能改变。
 常量的名称规范上要求全部大写，多个单词下划线连接。
 常量修饰的public static final 可以省略不写，默认会加上。
 小结：
 定义接口使用的关键字：interface
 接口中的成分在JDK 1.8之前只能有：常量和抽象方法。
 在接口中常量的修饰符：public static final 可以省略不写，默认会加上。
 在接口中抽象方法的修饰符：public abstract 可以省略不写，默认会加上。
 除此之外没有其他成分。

 */
public interface interfaceDemo {
    //1.抽象方法。
    //结口中的抽象方法可以省略public abstract 不写，默认会加上！
    // public abstract void run():
     void run();

    //2.常量：变量只有一个，而且在程序运行只中不能更改
    //常量一般修饰符：public static final。
    //常量的变量名称建议字母大写，多个单词用“_"连接！、
    //结口中常量是可以省去public static final 不写，默认会加上！
    //public static final Strin SCHOOL_NAME="黑马"
    String SCHOOL_NAME ="黑马";

}

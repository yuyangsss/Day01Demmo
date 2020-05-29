package _15单例模式;
/**
 目标：面试必考（单例模式）。

 单例模式的含义： 单例模式，是一种常用的软件设计模式。通过单例模式可以保证系统中，
 应用该模式的这个类永远只有一个实例。即一个类永远只有一个对象实例。

 单例的应用场景：在实际开发中，有很多业务对象永远只需要一个，无论启动多少次
 我们只需要一个对象，例如任务管理对象，只需要一个对象。节约内存和性能。
 因为对象越多内存占用越大，极有可能出现内存溢出！

 实现单例模式两种方式：
 1.饿汉单例设计模式
 在用类获取对象的时候，对象已经提前创建好了。
 设计步骤：
 a.定义一个类，把构造器私有。
 b.定义一个静态变量存储一个对象。
 c.提供一个返回单例对象的方法。

 2.懒汉单例设计模式
 在真正需要该对象的时候，才去创建一个对象(延迟加载对象)。
 设计步骤：
     a.定义一个类，把构造器私有。
     b.定义一个静态变量存储一个对象。
     c.提供一个返回单例对象的方法。
 */
public class SingleInstanceDemo02 {
    public static void main(String[] args) {
        SingleInstance s2=SingleInstance.getInstance();
        SingleInstance s1=SingleInstance.getInstance();
        System.out.println(s1==s2);
    }
}
class SingleInstance{
    private  static SingleInstance ins;
    private SingleInstance(){}
    public static SingleInstance getInstance() {
        if (ins == null) {
         ins = new SingleInstance();
        }
        return  ins;
    }
}

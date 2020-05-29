package _01抽象类的概述;
/**
 目标：抽象类的入门概述。

 引入：
 父类知道子类一定要完成某个功能，但是每个子类实现的情况都不一样
 而且子类都会用自己的功能了，父类的该功能就可以定义成抽象的方法。
 拥有抽象方法的类必须定义成抽象类。
 什么是抽象方法?
 没有方法体，只有方法签名，必须用abstract修饰的方法就是抽象方法。
 什么是抽象类？
 拥有抽象方法的类必须定义成抽象类。
 抽象类必须用abstract关键字修饰。
 小结：
 抽象方法：没有方法体，只有方法签名，必须用abstract修饰的方法就是抽象方法。
 抽象类：拥有抽象方法的类必须定义成抽象类，必须用abstract修饰。
 */
public class AbstractDemo{
    public static void main(String[] args) {
        Dog taiDi=new Dog();
        taiDi.run();
    }
}
class Dog extends Animal {
    @Override
    public void run(){
        System.out.println("狗跑得贼快啊");
    }

}
class Cat extends Animal {
    @Override
    public void run(){
        System.out.println("猫跑的贼六·····");
    }

}

abstract class Animal{
    //子类要完成这个功能，但是由自己重写完成！
    //抽象方法：没有方法体，只有方法签名，必须用abstract修饰
    //拥有抽象方法的类必须定义抽象类
    public abstract void run();
}
package _01多态的概述;

/**
    目标：多态的入门概述。
    面向对象的三大特征：封装，继承，多态

    态的形式：
        父类类型 对象名称=new 子类构造器；
        接口    对象名称=new 实现类的构造器；
            父类类型的范围  > 子类类型的范围
    多态的概念：
        同一个类型的对象，执行同一个行为，在不同的状态下会表现出不同的行特征。

    多态的识别技巧：
        对于方法的调用：编译看左边，运行看右边
        对于变量的调用：编译看左边，运行看左边
    ·
    多态的使用前提：
        1.必须存在继承或者实现关系
        2.必须存在父类类型的变量引用子类类型的对象
        3.需要存在方法重写
 */
public class PolymorphicDemo {
    public static void main(String[] args) {
        //父类类型 对象名称=new 子类构造器；
        Animal dlam=new Cat();
        dlam.run();//对于方法的调用：编译看左边，运行看右边
        System.out.println(dlam.name);//对于变量的调用：编译看右边，运行看左边

        Animal taidi=new Dog();
        taidi.run();
        System.out.println(taidi.name);
    }
}
class Dog extends Animal{
    public String name="🐕的name";
    @Override
    public void run(){
        System.out.println("🐕p跑的贼快");
    }
}
class Cat extends Animal{
    public String name="🐱的的name";
    @Override
    public  void run(){
        System.out.println("🐱跑的飞快");
    }
}
class  Animal{
    public String name="父类的name";
    public void run(){
        System.out.println("动物跑");
    }
}
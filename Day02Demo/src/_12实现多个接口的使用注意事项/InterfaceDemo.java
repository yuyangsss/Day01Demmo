package _12实现多个接口的使用注意事项;

/**
 拓展：实现多个接口的使用注意实现。(非常偏的语法，理解和了解即可)

 1.如果实现了多个接口，多个接口中存在同名的静态方法并不会冲突，
 原因是只能通过各自接口名访问静态方法。

 2.当一个类，既继承一个父类，又实现若干个接口时，(重点)
 父类中的成员方法与接口中的默认方法重名，子类就近选择执行父类的成员方法。

 3.当一个类实现多个接口时，多个接口中存在同名的默认方法。
 实现类必须重写这个方法。

 4.接口中，没有构造器，不能创建对象。(重点)
 接口是更彻底的抽象，连构造器都没有，自然不能创建对象！！



 */
public class InterfaceDemo {
    public static void main(String[] args) {
      //  A.test();
      //  B.test();
        Cat a=new Cat();
        a.run();
    }
}
/**
    3.当一个类实现多个接口时，多个接口中存在同名的默认方法
    实现类必须重写这个方法
 */
class  C2 implements A2,B2{
    @Override
    public void test(){}
}
interface A2{
    default void test(){
        System.out.println("A2");
    }
}
interface B2{
    default void test(){
        System.out.println("B2");
    }
}

/**
 2.当一个类，既继承一个父类，又实现若干个接口是（重点）
 父类中的成员方法与接口中的默认方法重名，子类就近选择执行父类的成员方法。
 */
class  Cat extends Animal implements A1{

}
class Animal{
    public void run(){
        System.out.println("父类动物跑得贼溜");
    }
}
interface A1{
    default void run(){
        System.out.println("接口中的方法跑得贼溜");
    }

}
/**
    1.如果实现了多个接口，多个接口中存在同名的静态方法并不会冲突。
    原因是只能通过各自接口名访问各自静态方法。
 */
class C implements A,B{

}
interface  A{
    static  void test(){
        System.out.println("A");
    }
}
interface  B{
    static  void test(){
        System.out.println("A");
    }
}
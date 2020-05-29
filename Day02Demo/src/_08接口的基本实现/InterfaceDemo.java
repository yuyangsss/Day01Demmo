package _08接口的基本实现;
/**
 目标：接口的基本实现。

 接口是用来被类实现的。

 引入：
 类与类是继承关系：一个类只能直接继承一个父类。
 类与接口是实现关系：一个类可以实现多个接口。
 实现接口的类称为“实现类”。

 子类   继承   父类
 实现类 实现   接口

 实现类实现接口的格式：
 修饰符 class 实现类名称 implements 接口1,接口2,接口3,....{

 }
 implements:实现的含义。
 接口是可以被多实现的：一个类可以实现多个接口。

    小结：一个类实现接口，这个称为实现类。
        接口是用来被类实现的，实现的关键字是implements，接口可以多实现。
        一个类实现接口必须重写完接口中的全部的抽象方法，否则这个类要定义成抽象类！！
 */
public class InterfaceDemo {
    public static void main(String[] args) {
        PingPongMan zjk=new PingPongMan("张继科");
        zjk.run();
        zjk.competion();

    }
}
class  PingPongMan implements SportMan{
    private String name;
    public PingPongMan(String name){
        this.name=name;
    }

    @Override
    public void run() {
        System.out.println(name+"乒乓球运动员要跑步~~~~~");
    }

    @Override
    public void competion() {
        System.out.println(name+"乒乓球运动员要参加比赛~~~~~~~~");
    }
}

interface SportMan{
    void run();
    void competion();
}
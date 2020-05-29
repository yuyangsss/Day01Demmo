package _09接口的多实现;
/**
 目标：接口的多实现介绍。

 实现类实现接口的格式：
 修饰符 class 实现类名称 implements 接口1,接口2,接口3,....{

 }

 类与类是单继承。
 类与接口是多实现。

 小结：
 一个类可以实现多个接口。
 一个类如果实现了多个接口，必须重写完全部接口中的全部抽象方法
 否则这个类必须定义抽象类。
 */
public class InterfaceDemo {
    public static void main(String[] args) {
        //创建实现类对象调用重写的方法执行！
        BasketBall yaoMing=new BasketBall();
        yaoMing.rule();
        yaoMing.copetition();
        yaoMing.run();
    }
}
class BasketBall implements SportMan,law{
    @Override
    public void run() {

    }

    @Override
    public void copetition() {

    }

    @Override
    public void rule() {

    }
}
interface  SportMan{
    void run();
    void copetition();
}
interface law{
    void rule();
}

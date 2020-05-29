package _11JDK开始之后接口新增的方法;
/*
        目标：JDK1.8开始之后接口新增的三个方法。

        JDK 1.8之前接口中只能是抽象方法和常量。
        JDK 1.8开始之后接口不再纯洁。
        JDK 1.8开始之后接口新增了三个方法。
            (1)默认方法：其实就是实例方法。
            -----必须用deafult修饰
            ----只能用接口的实现类的对象来调用。
            (2)静态方法：
            ----可以直接加static修饰
            -----默认会加public修饰。
            ------接口的静态方法只能用接口的类名称本身调用。
            (3)私有方法：(JDK 1.9开始支持的)  本电脑1.8 下面的private 会报错
            ---私有的实例方法，必须加private修饰
 */
public class InterfaceDemo {
    public static void main(String[] args) {
        PingPangMan zjk=new PingPangMan();
        zjk.run();

        //接口中静态方法只能 用 接口来调用
        SportMan.inAddr();
    }

}
//实现类
class PingPangMan implements SportMan{

}
interface SportMan{
    //1.默认方法：其实就是实例方法。
    //只能用接口的实现类的对象来调用。
    default void run(){
        //go();  下面go()方法private 修饰 1.8不支持在接口中用private修饰方法。
        System.out.println("跑得贼溜~~~~~~");
    }

    //2.静态方法：可以直接加static修饰。默认会加public修饰。
    //接口的静态方法只能用接口的类名称本身调用。
    static void inAddr(){
        System.out.println("我们在奉节~~~~");
    }
    //私有方法：私有的实例方法。只能在本接口中被访问
    //私有方法通常是给其他私有方法或者给默认方法调用的！


 //   private void go(){
 //       System.out.println("开始····");
  //  }

}

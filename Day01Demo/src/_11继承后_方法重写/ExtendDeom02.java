package _11继承后_方法重写;
/**
 目标：super调用父类被重写的方法。

 super:代表了父类引用。
 super可以用在子类的实例方法中调用父类被重写的方法。

 */
public class ExtendDeom02 {
    public static void main(String[] args) {
        SportMan YaoMing=new SportMan();
        YaoMing.run();
        YaoMing.go();
    }
}

class People{
    public void run(){
        System.out.print("人会跑");
    }
}

class SportMan extends People{
    @Override
    public void run (){
        System.out.println("运动员跑得贼快");
    }

    //中转调用父类的方法
    public void go(){
        super.run();
    }

}
package _11继承后_方法重写;

/**
 目标：静态方法和私有方法是否可以被重写（拓展语法）

 可以吗?  都不可以.
 */
public class ExtendDemo03 {
}

class Computer{
    public static  void test(){

    }
    private void run(){

    }
}

class Mac extends Computer{
   // @Override  不能重写静态方法，
   // 此语句会报错。
    public static void test() {
    }
    // @Override 不能重写私有方法
    //此语句会报错。
   private void run(){

        }

}

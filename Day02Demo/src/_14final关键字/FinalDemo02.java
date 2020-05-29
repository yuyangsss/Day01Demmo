package _14final关键字;

/**
 目标：final修饰变量-局部变量。

 final修饰变量的总规则：有且仅能被赋值一次。

 变量有几种？
 成员变量
 -- 静态成员变量：有static修饰，属于类，只加载一份。
 -- 实例成员变量：无static修饰，属于每个对象,与对象一起加载。
 局部变量
 -- 只能方法中，构造器中，代码块中，for循环中，用完作用范围就消失了。
 final修饰局部变量：
 -- 让值被固定或者说保护起来，执行的过程中防止被修改。
*/
public class FinalDemo02 {
    public static void main(String[] args) {
        final int age = 10;
        //age=100;//报错，第二次赋值了！

        final double rate = 3.14;
    }
    public static void buy(final double r){
            //r=0.1;//报错，第二次赋值了！


    }
}

package _05抽象类设计模板模式;

/**
 目标：抽象类设计模板模式。

 什么是设计模式？
    设计模式是前人或者技术大牛或者软件行业在生产实战中发现的优秀软件设计架构和思想。
    后来者可以直接用这些架构或者思想就可以设计出优秀，提高开发效率，提高软件可以扩张性和可维护性
    模板设计模式就是一种经典的设计模式思想。

    模板设计模式的作用：优化代码架构，提高代码的复用性，相同功能的重复代码无需反复书写
                    可以做到部分实现，部分抽象，抽象的东西交给使用模板的人重新实现！

    作文模板：
            标题固定：《我的爸爸》
            第一段固定：请介绍你的爸爸，说一下你的爸爸有多好，有多牛逼
            正文部分：抽象出来。
            结尾部分：我爸爸真棒，有这样的爸爸，简直太棒了。
 */
public class AbstractDemo {
    public static void main(String[] args) {
        Studnet a=new Studnet();
        a.write();

    }
}
class Studnet extends Template{
    @Override
   public String witeMain() {
        return "\t\t我爸爸很帅，而且很流弊，我都是闭着眼睛开车的";
    }
}

//1.设计一个模板
abstract  class  Template{
    private String title="\t\t\t\t\t《我的爸爸》";
    private String one="\t\t请介绍你的爸爸，说一下你的爸爸有多好，有多牛逼";
    private String last="\t\t我爸爸真棒，有这样的爸爸，简直太棒了。";


    //2.写作文的功能。
    public void write(){
        System.out.println(title);
        System.out.println(one);
        //3.写正文部分：正文部分模板不能确定，交个使用模板的子类来写！
        System.out.println(witeMain());
        System.out.println(last);
    }
    abstract String witeMain();
}

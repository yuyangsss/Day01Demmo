package _03抽象类的特征;

/**
        目标：抽象类的特征
            抽象列的特征是：有得有失。
                有得：抽象类得到了拥有抽象方法的能力。
                有失：抽象类失去了创建对象的能力。（抽象类不能创建对象）
        面试题：抽象类是否有构造器，抽象类是否可以创建对象，为什么？
                答：抽象类作为类一定有构造器，而且抽象类必须有构造器
                    提供给子类创建对象调用父类构造器使用的。

                    抽象类虽然有构造器但是抽象类不能创建对象。
                    反证法：假如抽象类可以创建对象。
                    Animal a=new Aniaml();
                        a.run();//抽象方法不能执行，因为它没有方法体，所以抽象类不能创建对象1
                注意：抽象类除了有得有失，类的其它成分它都具备

            小结：
                抽象类不能创建对象，抽象类可以包含抽象方法。
                除此之外,类有的成分，抽象类都具备
 */
public class AbstractDemo {
    public static void main(String[] args) {
        //Animal a=new Animal();报错
    }
}
abstract class Animal{
    private  String naem;
    public abstract void run();
    //实例方法
    public void test(){}
    //静态方法
    public static  void inAddr(){}

    public String getNaem() {
        return naem;
    }

    public void setNaem(String naem) {
        this.naem = naem;
    }
}

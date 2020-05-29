package _16引用类型作为方法参数和返回值;

/**
    目标：应用类型作为方法的参数和返回值

    应用类型作为Java的数据类型，自然可以作为方法的参数类型和返回值类型
    除了基本数类型都是引用数据类型。

 小结:引用类型作为数据类型可以在一切可以使用引用类型的地方使用！！
 */
public class TestDemo {
    public static void main(String[] args) {
        Dog jinMao=new Dog();
        go(jinMao);

        System.out.println("---------");
        Dog dog=createDog();
        dog.run();
    }

    //引用类型作为方法的返回值:创建一个狗对象返回！
    public  static Dog createDog(){
//        Dog taiDi=new Dog();
//          return taiDi;
        return  new Dog();
    }
    //提供一个方法让狗进入比赛··
    public static  void go(Dog a){
        System.out.println("比赛开始");
        a.run();
        System.out.println("比赛结束");
    }
}

class Dog{
    public void run(){
        System.out.println("🐕跑的贼溜");
    }
}
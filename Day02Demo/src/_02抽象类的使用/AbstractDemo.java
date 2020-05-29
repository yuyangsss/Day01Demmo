package _02抽象类的使用;
/**
 目标：抽象类的使用。

 抽象类是为了被继承。

 总结：
 一个类继承了抽象类，必须重写完抽象类的全部抽象方法，否则这个类必须定义成抽象类。
 因为拥有抽象方法的类必须定义成抽象类。
 */
public class AbstractDemo {
    public static void main(String[] args) {
        Teacher boZai=new Teacher();
        boZai.work();

        Manager boNiu=new Manager();
        boNiu.work();
    }
}
class Manager extends Employee{
    @Override
    public void work() {
        System.out.println("班主任需要管理提醒学生上课····");
    }
}
class Teacher extends Employee{
    @Override
    public void work() {
      System.out.println("讲师需要上课····");
    }
}
//需求：一家公司开发人员管理系统（讲师，班主任）
abstract class  Employee{
   public abstract void work();
//   public abstract void run(); 报错，必须重新抽象类的全部方法
}

package _07内部类_静态内部类;
/**
 目标：静态内部类的研究（了解语法即可）

 什么是静态内部类？
 有static修饰，属于外部类本身，会加载一次。

 静态内部类中的成分研究：
 类有的成分它都有，静态内部类属于外部类本身，只会加载一次
 所以它的特点与外部类是完全一样的，只是位置在别人里面而已。

 外部类=宿主
 内部类=寄生

 静态内部类的访问格式：
 外部类名称.内部类名称

 静态内部类创建对象的格式：
 外部类名称.内部类名称 对象名称 = new 外部类名称.内部类构造器;
]]
 静态内部类的访问拓展：
 静态内部类中是否可以直接访问外部类的静态成员?可以的，外部类的静态成员只有一份，可以被共享！
 静态内部类中是否可以直接访问外部类的实例成员?不可以的,外部类的是成员必须用外部类对象访问！！
 小结：
 静态内部类属于外部类本身，只会加载一次
 所以它的特点与外部类是完全一样的，只是位置在别人里面而已。

 */
public class InnerClass {
    public static void main(String[] args) {
        Outer.Inner c=new Outer.Inner();
        c.setAge(12);
        c.setName("黑马");
        System.out.println(c.getName());
        System.out.println(c.getAge());
        c.show();
    }
}
class Outer{
    //静态内部类：有static修饰，属于外部类本身，只会加载一次
    public static class Inner{
        public static String schoolName="黑马";
        private String name;
        private int age;

        public void show(){
            System.out.println(name+"已经"+age);
        }
        public Inner(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public Inner() {
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }
}
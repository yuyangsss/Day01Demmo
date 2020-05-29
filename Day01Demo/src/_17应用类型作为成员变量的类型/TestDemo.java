package _17应用类型作为成员变量的类型;

public class TestDemo {
    public static void main(String[] args) {
        Student zcq=new Student();
        zcq.setName("喻杨");
        zcq.setAge(19);
        Address addr=new Address("110","重庆",2,6);
        zcq.setAddress(addr);


        Address add1=zcq.getAddress();
        System.out.println(add1.getCode()+"---"+add1.getName());
        System.out.println(zcq.getName());
        System.out.println(zcq.getAge());
    }
}

package _14this和super关键字使用总结;

public class ThisDemo {
    public static void main(String[] args) {
        Student zbj = new Student("天蓬元帅", 1000 );
        System.out.println(zbj.getName());
        System.out.println(zbj.getAge());
        System.out.println(zbj.getSchooleName());

        Student swk = new Student("齐天大圣", 2000, "清华大学" );
        System.out.println(swk.getName());
        System.out.println(swk.getAge());
        System.out.println(swk.getSchooleName());
    }
}


class Student{
    private  String name;
    private int age;
    private String schooleName;

    public Student() {

    }
    public Student (String name,int age ){
        //借用兄弟构造器的功能！
        this(name,age, "黑马");
    }

    public Student(String name, int age, String schooleName) {
        this.name = name;
        this.age = age;
        this.schooleName = schooleName;
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

    public String getSchooleName() {
        return schooleName;
    }

    public void setSchooleName(String schooleName) {
        this.schooleName = schooleName;
    }
}
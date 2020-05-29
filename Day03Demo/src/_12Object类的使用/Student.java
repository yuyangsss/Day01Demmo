package _12Object类的使用;

import java.util.Objects;

public class Student {
    private String name;
    private int age;
    private int sex;

    public Student() {
    }

    public Student(String name, int age, int sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    //重写equals只要两个队形的内容一样，我们就认为他们是相等的。
    //yy.eauals(yy1)
    //比较者：yy==this
    //被比较者：yy1==obj
    //@Override
 //   public boolean equals(Object obj) {
   //     //1.判断obj是否是学生类型。学生只能和学生比较
  //      if (obj instanceof Student) {
  //          //obj是学生类型
  //          Student yy1 = (Student) obj;
   //         //判断内容是否一样，一样返回true
   //         return  this.name.equals(yy1.name) && this.age == yy1.age && this.sex == yy1.sex;
    //    } else {
    //            //Obj不是学生类型
    //            return false;
   //         }
    //    }


    @Override
    public boolean equals(Object o) {
        //1.判断自己是否和自己比较，如果是同一个对象比较直接返回true
        if (this == o) return true;
        //2.判断被比较者是否为null，以及是否是学生类型
        if (o == null ||this.getClass() != o.getClass()) return false;
        //3.O一定是学生类型，强制转换成学生，开始比较内容！
        Student student = (Student) o;
        return age == student.age &&
                sex == student.sex &&
                Objects.equals(name, student.name);
    }



    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }
}

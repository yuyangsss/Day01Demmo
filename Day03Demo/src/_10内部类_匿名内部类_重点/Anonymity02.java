package _10内部类_匿名内部类_重点;

public class Anonymity02 {
    public static void main(String[] args) {
        Swim s=new Swim() {
            @Override
            public void swimming() {
                System.out.println("老师跑的最快啊");
            }
        };
        go(s);


        Swim boniu =new Swim() {
            @Override
            public void swimming() {
                System.out.println("波妞快乐的狗爬式");
            }
        };
        go(boniu);

        go(new Swim() {
            @Override
            public void swimming() {
                System.out.println("波妞快乐的狗爬式");
            }
        });

    }
    public static void go(Swim swim){
        System.out.println("开始");
        swim.swimming();
        System.out.println("结束");
    }
}
interface Swim{
    void swimming();
}
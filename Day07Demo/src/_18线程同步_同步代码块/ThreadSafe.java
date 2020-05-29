package _18线程同步_同步代码块;

public class ThreadSafe {
    public static void main(String[] args) {
        Account acc=new Account(10000,"ssss");

        Thread Li= new DrawThread(acc,"小李");
        Li.start();

        Thread ti= new DrawThread(acc,"小太");
        ti.start();
    }
}

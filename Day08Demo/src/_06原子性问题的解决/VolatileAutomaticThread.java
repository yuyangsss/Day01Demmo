package _06原子性问题的解决;

/**
 目标：问题解决。

 如何保证变量访问的原子性呢?
 1.加锁实现线程安全。
 2.基于CAS方式的原子类。
 */
public class VolatileAutomaticThread {
    public static void main(String[] args) {
        Runnable target=new VolatileAutomaticRunnable();
        for(int x=1;x<=100;x++){
            new Thread(target).start();
        }

    }
}
class VolatileAutomaticRunnable implements Runnable{
    private int count=0;
    @Override
    public void run(){
        synchronized(this){
            for(int x=1;x<=100;x++){
                count++;
                System.out.println(Thread.currentThread().getName()+"的值："+count);
            }
        }
    }
}
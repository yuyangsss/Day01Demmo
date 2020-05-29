package _02线程池;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 目标：创建一个线程池

 线程池在Java中代表类：ExchtorService(接口)

 java在Excutor类下提供一个静态方法得到一个线程池的对象：
    1.public static ExcutorService newFixedThreadPool(int Threads):
    创建一个线程池返回
 ExcutorService提交线程任务对象执行的方法：
    2.Future<?>submit(Runnable task):提交一个Runable的任务对象给线程池执行
    1.Future<?> submit(Callable task):提交一个Runnable的任务对象给线程池执行。
 小结：
 Callable做线程池的任务，可以得到它执行的结果！！
 */
public class ThreadPoolsDemo03 {
    public static void main(String[] args) {
        //a.创建一个线程池，指定线程的固定数量是3
        // new ThreadPoolExecutor(nThreads, nThreads, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue());
        ExecutorService pools= Executors.newFixedThreadPool(3);
        Future<String> t1 = pools.submit(new MyCallable(10)); // 提交任务，此时会创建一个新线程,自动启动线程执行！
        Future<String> t2 = pools.submit(new MyCallable(20)); // 提交任务，此时会创建一个新线程,自动启动线程执行！
        Future<String> t3 = pools.submit(new MyCallable(30)); // 提交任务，此时会创建一个新线程,自动启动线程执行！
        Future<String> t4 = pools.submit(new MyCallable(40)); // 复用之前的某个线程

        try{
            //b.可以得到线程池执行的任务结构
            String rs1=t1.get();
            String rs2=t2.get();
            String rs3=t3.get();
            String rs4=t4.get();
            System.out.println(rs1);
            System.out.println(rs2);
            System.out.println(rs3);
            System.out.println(rs4);
        }catch(Exception e){
            e.printStackTrace();
        }


    }
}
//1.定义一个线程任务类实现Callabl接口，申明线程执行结果类型
class MyCallable implements Callable<String> {
    private int n;
    public MyCallable(int n){
        this.n=n;
    }
   @Override
    public String call(){
       int sum=0;
       for( int i=1;i<=n;i++){
           System.out.println(Thread.currentThread().getName()+"==>"+i);
           sum+=i;
       }
       return Thread.currentThread().getName()+"计算1-"+n+"的和"+sum;
   }


}
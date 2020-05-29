package _12并发包_Exchanger;

import java.util.concurrent.Exchanger;
import java.util.concurrent.TimeUnit;

/**

 延续上一个类的：讲超时问题
 */
public class exchangerDemo02 {
    public static void main(String[] args) {
        Exchanger<String> exchanger=new Exchanger<>();
        new Boy1(exchanger).start();
        new Girl1(exchanger).start();
    }
}
class  Boy1 extends Thread{
    private Exchanger<String> exchanger;
    public Boy1(Exchanger<String> exchanger){
        this.exchanger=exchanger;
    }
    @Override
    public void run(){
        try{
            System.out.println("男孩子开始做自己的定情物：同心锁");
            //开始交换礼物，参数是送给其他线程的礼物
           // String rs=exchanger.exchange("同心锁");
            String rs=exchanger.exchange("同心锁",5, TimeUnit.SECONDS);

            System.out.println("男孩子收到礼物："+rs);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
class Girl1 extends Thread{
    private Exchanger<String> exchanger;
    public Girl1 (Exchanger<String> exchanger){
        this.exchanger=exchanger;
    }
    @Override
    public void run(){
        try{
            System.out.println("女孩子开始做自己的定情物：钥匙");
            Thread.sleep(8000);
            //开始交换礼物，参数是送给其他线程的礼物
           String rs=exchanger.exchange("钥匙");
            System.out.println("女孩子收到礼物："+rs);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
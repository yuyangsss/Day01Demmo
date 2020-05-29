package _19线程同步_同步方法;

public class DrawThread extends Thread{
    private  Account acc;
    public DrawThread(Account acc,String name){
        super(name);
        this.acc=acc;
    }
    @Override
    public void run (){
        acc.DrawMoney(10000);
    }
}

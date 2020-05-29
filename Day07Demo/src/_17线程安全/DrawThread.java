package _17线程安全;

public class DrawThread extends Thread{
    //定义一个成员变量接收账户对象
    private Account acc;
    public DrawThread(Account acc,String name){
        super(name);
        this.acc=acc;
    }
    @Override
    public void run(){
        acc.drawMoney(100000);
    }
}

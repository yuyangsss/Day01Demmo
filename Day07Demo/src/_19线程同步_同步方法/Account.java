package _19线程同步_同步方法;
//账户类
public class Account {
    private double money;
    private  String carID;

    public Account() {
    }

    public Account(double money, String carID) {
        this.money = money;
        this.carID = carID;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public String getCarID() {
        return carID;
    }

    public void setCarID(String carID) {
        this.carID = carID;
    }

    public synchronized void  DrawMoney(double money) {
        //判断是谁来取钱
        String name=Thread.currentThread().getName();
        if(this.money>=money){
            System.out.println(name+"来取钱，余额足够"+this.money);
            this.money-=money;
            System.out.println(name+"取钱后，余额剩余"+this.money);
        }
        else {
            System.out.println(name+"来取钱，余额不足！");
        }
    }
}

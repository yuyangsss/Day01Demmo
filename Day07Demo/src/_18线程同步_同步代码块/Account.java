package _18线程同步_同步代码块;
//账户类
public class Account {
    private double money;
    private String carID;

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

    public void DrawMoney(double money) {
        //判断是谁来取钱
        String name=Thread.currentThread().getName();
       synchronized (this){
           if (this.money>=money){

               System.out.println(name+"来取钱，余额足够"+money);
               //3.更新余额
               this.money-=money;
               System.out.println(name+"来取钱后，余额剩余"+ this.money);
           }else {
               System.out.println(name+"来取钱，余额不足！");
           }
       }
    }
}

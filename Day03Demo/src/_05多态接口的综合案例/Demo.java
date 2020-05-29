package _05多态接口的综合案例;

public class Demo
{
    public static void main(String[] args) {
        //买一部电脑
        Computer c=new Computer();
        //2.买一个鼠标
        USB xiaomi=new Mouse("小米");
        c.install(xiaomi);

        USB sfy=new KeyBoard("双飞燕");
        c.install(sfy);

    }
}
class Computer{
    //提供一个安装USB设备的入口
    public void install(USB usb){
        usb.connect();
        //usb.dblick();
        //usb可能是鼠标，也可能是键盘
        if (usb instanceof Mouse){
            Mouse m=(Mouse)usb;
            m.dbclick();
        }else  if(usb instanceof KeyBoard){
            KeyBoard k=(KeyBoard)usb;
            k.keyDown();
        }
        usb.unconnect();
    }
}
//定义两个usb设备：鼠标，键盘
class Mouse implements USB{
    private String name;

    public Mouse(String name) {
        this.name = name;
    }
    //双击
    public void dbclick(){
        System.out.println(name+"双击6666");
    }

    @Override
    public void connect() {
        System.out.println(name+"成功接入了设备");
    }

    @Override
    public void unconnect() {
        System.out.println(name+"成功拔出了设备");

    }
}
class KeyBoard implements USB{
    private String name;

    public KeyBoard(String name) {
        this.name = name;
    }
    //按键
    public void keyDown(){
        System.out.println(name+"写下，来了老弟");
    }
    @Override
    public void connect() {
        System.out.println(name+"成功接入了设备");

    }
    @Override
    public void unconnect() {
        System.out.println(name+"成功拔出了设备");
    }
}
//定义usb的规范，必须要完成接入和拔出的功能！！
interface USB{
    void connect();     //接入
    void unconnect();   //拔出
}
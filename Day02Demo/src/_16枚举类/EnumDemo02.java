package _16枚举类;

/**
        目标：枚举类用于做信息标志和信息分类。
        这段代码引入枚举，枚举详细看03
 */
public class EnumDemo02 {
    public static final int UP=0;
    public static final int DOWN=1;
    public static final int LEFT=2;
    public static final int RIGHT=3;
    public static void main(String[] args) {
        move(RIGHT);
    }
    //控制玛丽的移动
    public  static void move(int oritation){
        switch(oritation){
            case UP:
                System.out.println("控制玛丽👆");
                break;
            case DOWN:
                System.out.println("控制玛丽👇");
                break;
            case LEFT:
                System.out.println("控制玛丽👈");
                break;
            case RIGHT:
                System.out.println("控制玛丽👉");
                break;
        }
    }
}

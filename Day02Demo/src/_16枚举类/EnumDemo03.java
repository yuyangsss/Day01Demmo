package _16枚举类;
enum Oritation{
    UP,DOWN,LEFT,RIGHT;
}
public class EnumDemo03 {
    public static void main(String[] args) {
        move(Oritation.DOWN);//枚举的优雅之处，严谨
    }

public  static void move(Oritation oritation){
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

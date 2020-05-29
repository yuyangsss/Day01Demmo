package _04Map集合存储自定义类型;


public class Test {

   public static void main(String[] args) {
        int a =  7410;
        int b = 11;
        exChange(a, b);
        System.out.println("a: " + a + " : " + "b: " + b);

    }

    private static void exChange(Integer a, Integer b) {
        int t;
        t = a;
        a = b;
        b = t;
    }
}
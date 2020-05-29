package _04System系统类的使用;

import java.text.SimpleDateFormat;
import java.util.Arrays;

public class SystemDemo {
    public static void main(String[] args) {
        System.out.println("程序开始");
      //  System.exit(0); 0代表正常终止！

        //2.得到系统当前的时间毫秒值
        long time=System.currentTimeMillis();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        System.out.println(sdf.format(time));

        // 3.可以做数组的拷贝（了解）
        int[] arrs1 = new int[]{10 ,20 ,30 ,40 ,50 ,60 ,70};
        int[] arrs2 = new int[6]; // [ 0 , 0 , 0 , 0 , 0 , 0]
        // arrs2 = [0 , 30 , 40 , 50 , 0 , 0 ]
        /**
         arraycopy(Object src,int  srcPos ,Object dest, int destPos,  int length)
         参数一：原数组
         参数二：从哪个索引位置开始赋值
         参数三：目标数组
         参数四：目标数组的开始索引：
         参数五：复制几个
         */
        System.arraycopy(arrs1,2, arrs2 , 1 , 3);
        System.out.println(Arrays.toString(arrs2));

        System.out.println("程序结束");
    }
}

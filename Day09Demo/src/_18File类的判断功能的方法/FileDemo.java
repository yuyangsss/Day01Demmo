package _18File类的判断功能的方法;

import java.io.File;

/**
 目标：File类的判断功能的方法
 - public boolean exists() ：此File表示的文件或目录是否实际存在。
 - public boolean isDirectory()：此File表示的是否为目录。
 - public boolean isFile() ：此File表示的是否为文件
 */
public class FileDemo {
    public static void main(String[] args) {
        //1.文件对象。
        File f1=new File("D:\\桌面1\\Desktop\\2018级软件工程4班刘倩.jpg");
        //a.判断文件路径是否存在
        System.out.println(f1.exists());
        //b.判断文件对象是否是文件，是文件返回True，反之
        System.out.println(f1.isFile());
        //c.判断文件对象是否是文件夹，是文件夹返回true，反之
        System.out.println(f1.isDirectory());
    }
}

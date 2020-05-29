package _07正则表达式的演示;

import java.util.Scanner;

public class RegexDemo03 {
    public static void main(String[] args) {
          //  checkEmail();
        //checkTel();
        checkphone();
    }

    private static void checkphone() {

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入电话号");
        String email = sc.nextLine();
        if (email.matches("0\\d{2,5}-?\\d{1,}"))
        {
            System.out.println("电话号合法");
        }else{
            System.err.println("电话号格式不正确");
        }
    }
    //校验手机号
    private static void checkTel() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入手机号");
        String email = sc.nextLine();
        if (email.matches("1[3-9]\\d{9}"))
        {
            System.out.println("手机号合法");
        }else{
            System.err.println("手机号格式不正确");
        }
    }

    //校验邮箱
    private static void checkEmail() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入QQ号");
        String email = sc.nextLine();
        if (email.matches("\\w{1,}@\\w{2,10}(\\.\\w{2,10}){1,2}"))
        {
            System.out.println("邮箱合法");
        }else{
            System.err.println("邮箱格式不正确");
        }
    }
}
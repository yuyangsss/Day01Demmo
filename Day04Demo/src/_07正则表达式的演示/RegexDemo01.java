package _07正则表达式的演示;
/**
 目标：正则表达式的演示。

 正则表达式的作用：
 是一些特殊字符组成的校验规则，可以校验信息的正确性，校验邮箱是否合法
 电话号码，金额等。

 需求：演示不用正则表达式和用正则表达式校验QQ号码。

 小结：
 正则表达式很适合做校验，代码简单，优雅！
 */
public class RegexDemo01 {
    public static void main(String[] args) {
        System.out.println(checkQQ("5465454"));
        System.out.println(checheQQRegex("645564"));
    }
    //用正则表达式
    public static boolean checheQQRegex(String qq){
        return qq!=null&&qq.matches("\\d{4,}");
    }

    public static boolean checkQQ(String qq){
        //1.判断是否为空
        if(qq==null){
            return  false;
        }else {
            //2.判断长度是否正确
            if(qq.length()>=4){
                //3.判断是都全部是数字
                //先定义一个比那辆存储最终校验的结果
                boolean rs=true;//默认是为合法的
                for (int i=0;i<qq.length();i++){
                    char ch=qq.charAt(i);
                    if(ch<'0'||ch>'9'){
                        rs=false;
                    }
                }
                return rs;
            }else {
                return false;
            }

        }
    }
}

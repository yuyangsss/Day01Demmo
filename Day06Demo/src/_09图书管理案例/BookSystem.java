package _09图书管理案例;

import java.util.*;
/**
 目标：图书管理系统的开发。

 业务需求分析：
 （1）查看全部书籍。query
 （2）添加书本信息。add
 （3）删除书本信息。delete
 （4）修改书本信息。update
 （5）退出系统。 exit

 书本信息的结构:
 类型                书名            价格        作者
 ---------------------------------------------------
 言情小说
 《金瓶梅》         99.9        阿猫
 《红楼梦》         198.2       曹雪芹
 武侠小说
 《三少爷的剑》      98.2        古龙
 《神雕侠侣》        98.2        金庸
 ------------------------------------------------------
 分析：
 （1）定义一个书本类。
 （2）定义一个集合表示图书馆用于存储书本信息数据：Map<String,List<Book>>。
 （3）展示操作界面。
 （4）完成相应功能。
 */
public class BookSystem {
    /**
        1.定义一个集合表示图书馆用于存储书本信息数据：Map<String,List<Book>)
     使用Map集合，键是橱柜的栏目类名称，值是橱柜的List集合对象存储书本信息
     */
    public static final Map<String, List<Book>> BOOK_STORE=new HashMap<>();
    //定义一个扫描器
    public static final Scanner SYS_SCANNER=new Scanner(System.in);

    public static void main(String[] args) {
        /**
         2.展示操作界面，队里功能建立封装成方法调用，方便互相之间的逻辑调用
         */
        showCommand();
    }
    /**\
     展示操作界面命令
     */
    private static void showCommand(){
        System.out.println("（1）查看全部书籍。query");
        System.out.println("（2）添加书本信息。add");
        System.out.println("（3）删除书本信息。delete");
        System.out.println("（4）修改书本信息。update");
        System.out.println("（5）退出系统。 exit");
        System.out.print("请您输入您的操作命令：");
        String command =SYS_SCANNER.nextLine();

        //判断用户的命令是想干什么
        switch(command){
            case "query":
                //查看书籍
                    queryBook();
                break;
            case "add":
                //添加书籍
                addBook();
                break;
            case "update":
                //修改书籍
                updateBook();
                break;
            case "delete":
                //修改书籍
                deleteBook();
                break;
            case "exit":
                //退出系统
                System.out.println("退出成功，期待您下次光临");
                System.exit(0);
                break;
            default:
                System.out.println("您的命名输入有误，请重新输入");
        }
       showCommand();
    }
    /**
     删除书本信息数据
     */
    private static void deleteBook(){
        queryBook();
        System.out.println("========欢迎您进入删除书本业务========");
       while (true){
           System.out.println("请您输入要删除书本的栏目：");
           String type=SYS_SCANNER.nextLine();
           //判断是否有栏目、
           if(BOOK_STORE.containsKey(type)){
               while (true) {
                   //1.存在该栏目
                   System.out.println("请问您要删除的书本名称是：");
                   String name = SYS_SCANNER.nextLine();
                   //3.根据栏目和书名去寻找这个栏目中的书本对象
                   Book book = getBookByTypeAndName(type, name);
                   if (book == null) {
                       System.out.println("不存在这本书");
                   } else {
                       //这本书存在了
                       //应该取出这个栏目的橱柜集合
                       List<Book> books = BOOK_STORE.get(type);
                       books.remove(book);
                       System.out.println("删除成功");
                       queryBook();
                       return;
                   }
               }

           }else {
               //2.不存在该栏目
               System.out.println("您的栏目输入有误，请确认");
           }
       }
    }

    /**
     修改书本信息
     */
    private static void updateBook(){

        if(BOOK_STORE.size()==0){
            System.out.println("没有改书的栏目可以修改");
        }else {
            queryBook();
            System.out.println("========欢迎您进入修改书本业务");
            while (true){
                System.out.println("输入您修改的书本的栏目");
                String type=SYS_SCANNER.nextLine();
                //1.判断是否存在改栏目
                if(BOOK_STORE.containsKey(type)){
                    //存在改栏目
                    //2.请输入修改的书名
                    while (true){
                        System.out.println("请输入修改书本的名称");
                        String name=SYS_SCANNER.nextLine();
                        //3.判断该栏目下是否存在改书本对象
                        //根据栏目和书名去栏目下查询出这本书对象
                        Book book=getBookByTypeAndName(type,name);
                        if (book==null){
                            System.out.println("您输入的书名不存在，请重新确认");
                        }else {
                            //书名正确了，开始正式修改
                            System.out.println("请您输入添加书本的新名称：");
                            String newName = SYS_SCANNER.nextLine();
                            System.out.println("请您输入添加书本的新价格：");
                            String newPrice = SYS_SCANNER.nextLine();
                            System.out.println("请您输入添加书本的新作者：");
                            String newAuthor = SYS_SCANNER.nextLine();
                            book.setName(newName);
                            book.setPrice(Double.valueOf(newPrice));
                            book.setAuthor(newAuthor);
                            queryBook();
                            System.out.println("您修改的书本成功，请看如上信息确认");
                            return; //结束修改的方法！
                        }
                    }


                }else {
                    //不存在改栏目
                    System.out.println("您输入的栏目不存在，重新输入");
                }
            }
        }
    }

    /**
     * 在某个栏目下，根据书名查询出这本书对象返回！
     * @param type 栏目名称
     * @param name 书名称
     * @return 书本对象
     */
    public static Book getBookByTypeAndName(String type,String name) {
        //1.先提取这个栏目的橱柜，根据栏目提取他的值
        List<Book> books = BOOK_STORE.get(type);
        for (Book book : books) {
            //如果书名的名称与我们要找的名称一样，改书就是我们要的，直接返回！
            if (book.getName().equals(name)) {
                return book;
            }
        }
        return null; //没有这本书
    }

    /**
     查询全部书本信息
     Map<String ,List<Book>>    BOOK_SPORE={type=[b1,b2,b3],type2=[b1,b2...]}
     */

    private static  void queryBook(){
        System.out.println("==========欢迎您进入查询书本业务==========");

        if(BOOK_STORE.size()==0){
            System.out.println("图书馆没有书");
        }else {
            System.out.println("类型\t\t\t书名\t\t\t价格\t\t\t作者");
            BOOK_STORE.forEach((type,books)->{
                System.out.println(type);
                //遍历改类型下的橱柜中全部书本对象
                for (Book book:books){
                    System.out.println("\t\t\t\t"+book.getName()+"\t\t\t"+book.getPrice()+"\t\t\t"+book.getAuthor());
                }
            });
        }
    }

    /**
     添加书本信息数据
     Map<String ,List<Book>> BOOK_STORE={type1[book1,book2,type=[...]}
     */
    private static void addBook() {
        System.out.println("=========欢迎您进入添加书本业务========");
        System.out.print("请您输入添加书本的栏目：");
        String type=SYS_SCANNER.nextLine();

        //定义一个List集合用于指向栏目的橱柜
        //这个橱柜变量要根据栏目是够存在来确定是用已经存在的橱柜，还是创建一个新的橱柜

        List<Book> books=null;
        //1.判断是否存在改栏目
        if (BOOK_STORE.containsKey(type)) {
            //3.存在改栏目
            //直接得到改栏目存在的橱柜的对象
             books=BOOK_STORE.get(type);

        }else {
            //2.改栏目是第一次添加
            //为该栏目创建一个橱柜对象（List<Book>）
           books=new ArrayList<>();
           //新橱柜和新栏目必须手工加入到图书馆
           BOOK_STORE.put(type,books);
        }
        System.out.println("请您输入添加书本的名称：");
        String name = SYS_SCANNER.nextLine();
        double price=0;
        while (true) {
            try {
                System.out.println("请您输入添加书本的价格：");
                String doubleprice = SYS_SCANNER.nextLine();
                price = Double.valueOf(doubleprice);
                break;
            } catch (Exception e) {
                System.err.println("价格输入有误");
            }
        }
        System.out.println("请您输入添加书本的作者：");
        String author = SYS_SCANNER.nextLine();
        // 定义一个书本对象封装用户输入的书本信息。
        Book book = new Book(name,price,author);
        books.add(book);
        System.out.println("您添加在"+type+"下的书本"+book.getName()+"成功！");
    }
}

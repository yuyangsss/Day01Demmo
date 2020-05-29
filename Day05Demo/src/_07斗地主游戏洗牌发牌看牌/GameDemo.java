package _07斗地主游戏洗牌发牌看牌;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 目标：斗地主游戏的案例开发。

 业务需求分析:
 斗地主的做牌，洗牌，发牌,排序（拓展知识）, 看牌
 业务:总共有54张牌。
 点数: "3","4","5","6","7","8","9","10","J","Q","K","A","2"
 花色: "♠", "♥", "♣", "♦"
 大小王: "👲" , ""
 点数分别要组合4种花色，大小王各一张。
 斗地主：发出51张牌，剩下3张作为底牌。

 功能：
 1.做牌。
 2.洗牌
 3.定义3个玩家。
 4.发牌。
 5.排序（拓展，了解）
 6.看牌。

 用面向对象设计案例：
 a.定义一个牌类，代表牌对象。 一个牌对象代表一张牌。
 b.定义一个集合存储54张牌，集合只需要一个(因为牌只需要一副)
 */
public class GameDemo {
    //定义一个静态集合，存储54张牌对象，集合需要一
    public static final List<Card> ALL_CARDS=new ArrayList<>();
    //做牌r
    static {
        //1.定义一个数组存储拍的点数，类型确定，个数确定请用数组存储
        String[] numbers={"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
        //2.定义一个数组存储花色，额理性确定，个数确定请用数组存储
        String[] colors={ "♠", "♥", "♣", "♦" };

        int index=0;
        //3.先遍历点数与四种花色组装成牌对象存入到集合中去
        for(String number:numbers){
            //遍历花色
            for(String color:colors){
                //创建一张牌的对象封装点数和花色
                Card card=new Card(number,color,index++);
                ALL_CARDS.add(card);
            }
        }
        //4.单独加入大小王
        Collections.addAll(ALL_CARDS ,  new Card("","🃏",index++) ,new Card("","👲",index++) );
        System.out.println("输出新牌："+ALL_CARDS);


    }
    public static void main(String[] args) {
        //3.洗牌（把新牌得 顺序打乱）
        Collections.shuffle(ALL_CARDS);
        System.out.println("洗牌后："+ALL_CARDS);
        //定义三个玩家
        List<Card> ling=new ArrayList<>();
        List<Card> jiu=new ArrayList<>();
        List<Card> dong=new ArrayList<>();
        /*发牌
        [3♠, 3♥, 3♣, 3♦, 4♠, 4♥, 4♣, 4♦, 5♠, 5♥, 5♣, 5♦, 6♠ ....轮循环 %3
         0   1   2   3   4   5   6   7   8    9
         */

        for(int i=0;i<ALL_CARDS.size()-3;i++){
            //得到当前这张牌对象
            Card c=ALL_CARDS.get(i);
            //判断这张牌发给谁
            if(i%3==0){
                ling.add(c);
            }else if(i%3==1){
                jiu.add(c);
            }else if(i%3==2){
                dong.add(c);
            }
        }
        /*
        对牌进行排序（拓展，了解）
         */

        sortCards(ling);
        sortCards(dong);
        sortCards(jiu);

        /*
        看牌
         */
        System.out.println("令狐冲:"+ling);
        System.out.println("鸠摩智:"+jiu);
        System.out.println("东方不败:"+dong);
       // System.out.println("底牌："+ALL_CARDS.get(53)+"-"+ALL_CARDS.get(52)+"-"+ALL_CARDS.get(51));

        //拓展：截取集合到最后三张牌到一个新的List的集合中去。集合。.sublist()
        List<Card> lastThreeCard=ALL_CARDS.subList(ALL_CARDS.size()-3,ALL_CARDS.size());
        System.out.println("底牌："+lastThreeCard);

    }
    private static void sortCards(List<Card> cards){
        Collections.sort(cards, new Comparator<Card>() {
            @Override
            public int compare(Card o1, Card o2) {

                //牌的大小就是索引值
                if(o1.getIndex()>o2.getIndex()) return -1;
                if(o1.getIndex() < o2.getIndex()) return 1;
                return 0;
            }
        });
    }
}

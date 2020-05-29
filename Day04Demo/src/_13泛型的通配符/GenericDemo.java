package _13泛型的通配符;
/*
    目标：泛型的通配符

    需求：开发一个极品飞车的游戏，所有的汽车都能一起参与比赛

    注意：
        虽然b和a都继承了Car
        但是ArrayList<A>和ArrayList<B>与ArrayList<Car>没有关系的！

        通配符：？
        ？可以用在使用泛型的时候代表一切类型
        E,TK,V是在定义泛型的时候使用代表一切类型

        泛型的上下限：
            ？extends Car ：那么？必须是Car或者子类。（泛型的上限）
               ? super  Car :那么?必须是Car或者其父类。（泛型的下限。不是很常见）
    小结：
        通配符：?可以用在使用泛型的时候代表一切类型。
        ? extends Car : 那么?必须是Car或者其子类。(泛型的上限)
 */
import java.util.ArrayList;

public class GenericDemo {
    public static void main(String[] args) {
        ArrayList<b> bs=new ArrayList<>();
        bs.add(new b());
        bs.add(new b());
        bs.add(new b());
        run(bs);


        ArrayList<a> bs1=new ArrayList<>();
        bs1.add(new a());
        bs1.add(new a());
        bs1.add(new a());
        run(bs1);
    }
    //定义一个方法，可以让很多汽车一起进入参加比赛
    public static void run(ArrayList<? extends Car> cars){

    }
}
class  Car{

}
class b extends Car{

}
class a extends  Car{

}
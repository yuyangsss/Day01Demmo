package _12自定义泛型接口;
//泛型接口
public interface Data<E> {
    void add(E stu);
    void delete(E stu);
    void update(E stu);
    void query(int id);

}

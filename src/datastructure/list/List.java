package datastructure.list;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/6/12 21:59
 */
public interface List<E> {

    public static final  int ELEMENT_NOT_FOUND = -1;
    //元素大小
    int size();
    //判断是否为空
    boolean isEmpty();
    //添加元素到指定位置
    void add(int index, E element);
    //添加元素的末尾
    void add(E element);
    //删除指定元素
    E remove(int index);
    //清空元素
    void clear();
    //修改元素
    E set(int index, E element);
    //判断是否含有
    boolean contain(E element);
    //查找元素
    E get(int index);
    int indexOf(E element);

}

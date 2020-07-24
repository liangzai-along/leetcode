package datastructure.list;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/6/13 8:44
 */
public class LinkedList<E> {
    //存储元素的大小
    private int size;
    //指向第一个元素的节点
    private Node<E> first;

    //因为节点类只在本类中使用，所以定义为内部类
    private static class Node<E>{
        E element;
        Node<E> next;
        //构造方法
        public Node(E element, Node<E> next) {
            this.element = element;
            this.next = next;
        }
    }
}

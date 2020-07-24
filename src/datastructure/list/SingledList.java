package datastructure.list;

import java.util.LinkedList;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/6/13 9:22
 */
public class SingledList<E> extends AbstractList<E> {

    private Node<E> first;

    //构造初始虚拟节点
    public SingledList() {
        this.first = new Node<E>(null, null);
    }

    private static class Node<E>{
        E element;
        Node<E> next;
        public Node(E element, Node<E> next) {
            this.element = element;
            this.next = next;
        }
    }
    //添加元素
    @Override
    public void add(int index, E element) {
        rangeCheckForAdd(index);
        //需要找到前面的元素,如果index为0，index-1会出现负数，所以需要判断
        Node<E> pre = index == 0 ? first:node(index - 1);
        //pre指向新Node,新Node指向pre.next
        pre.next = new Node<>(element,pre.next);
        size++;
    }

    //删除
    @Override
    public E remove(int index) {
        rangeCheck(index);
        //要删除节点的前一个
        Node<E> pre = index == 0 ? first:node(index - 1);
        //要删除的节点
        Node<E> node = pre.next;
        //前一个节点指向要删除的后一个节点
        pre.next = node.next;
        size--;
        //返回被删除节点的元素值
        return node.element;
    }

    @Override
    public void clear() {
        size = 0;
        first = null;
    }

    //修改
    @Override
    public E set(int index, E element) {
        Node<E> node = node(index);
        E old = node.element;
        node.element = element;
        return old;
    }

    //找到索引对应的值
    @Override
    public E get(int index) {
        return node(index).element;
    }

    //找到索引对应的node
    public Node<E> node(int index){
        rangeCheck(index);
        Node node = first.next;
        for (int i = 0; i < index; i++){
            node = node.next;
        }
        return node;
    }

    @Override
    public int indexOf(E element) {
        if (element == null){
            Node<E> node = first;
            for (int i = 0; i < size; i++){
                if (node.element == null) return i;
                node = node.next;
            }
        }else {
            Node<E> node = first;
            for (int i = 0; i < size; i++){
                if (node.element.equals(element)) return i;
                node = node.next;
            }
        }
        return ELEMENT_NOT_FOUND;
    }
}

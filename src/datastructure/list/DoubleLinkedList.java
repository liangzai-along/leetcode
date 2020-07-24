package datastructure.list;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/6/13 16:12
 */
public class DoubleLinkedList<E> extends AbstractList<E> {
    //头尾节点
    private Node<E> first;
    private Node<E> last;

    private static class Node<E>{
        E element;
        Node<E> prev;
        Node<E> next;

        public Node(E element, Node<E> prev, Node<E> next) {
            this.element = element;
            this.prev = prev;
            this.next = next;
        }
    }

    /**
     * 添加元素：
     * 尾节点添加，特殊情况是添加第一个
     * 中间添加，特殊情况是头节点
     * @param index
     * @param element
     */
    @Override
    public void add(int index, E element) {
        rangeCheckForAdd(index);
        if (index == size){
            Node<E> oldLast = last;
            last = new Node<>(element,oldLast,null);
            if (oldLast == null){
                //第一个节点，头尾指针指向同一个
                first = last;
            }else {
                oldLast.next = last;
            }
        }else {
            Node<E> next = node(index);
            Node<E> prev = next.prev;
            Node<E> node = new Node<>(element,prev,next);
            next.prev = node;
            //index = 0,头节点添加不一样
            if (prev == null){
                first = node;
            }else {
                prev.next = node;
            }
        }
        size++;
    }

    //删除元素
    @Override
    public E remove(int index) {
        rangeCheck(index);
        Node<E> node = node(index);
        Node<E> prev = node.prev;
        Node<E> next = node.next;
        //头部
        if (prev == null){
            first = next;
        }else {
            prev.next = next;
        }
        //尾部
        if (next == null){
            last = prev;
        }else {
            next.prev = prev;
        }
        size--;
        return node.element;
    }

    //清空链表
    @Override
    public void clear() {
        size = 0;
        first = null;
        last = null;
    }

    //修改元素
    @Override
    public E set(int index, E element) {
        E old = node(index).element;
        node(index).element = element;
        return old;
    }

    @Override
    public E get(int index) {
        return node(index).element;
    }

    //根据索引找到节点
    public Node<E> node(int index){
        rangeCheck(index);
        if (index < (size >> 1)){
            Node<E> node = first;
            for (int i = 0; i < index ; i++){
                node = node.next;
            }
            return node;
        }else {
            Node<E> node = last;
            for (int i = size -1; i > index ; i++){
                node = node.next;
            }
            return node;
        }
    }


    @Override
    public int indexOf(E element) {
        return 0;
    }
}

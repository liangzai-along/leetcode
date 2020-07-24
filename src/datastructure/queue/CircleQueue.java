package datastructure.queue;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/6/14 12:15
 */
public class CircleQueue<E> {

    private static final int DEFAULT_CAPACITY = 10;
    //对头指针
    private int front;
    private int size;
    private E[] elements;

    public CircleQueue(){
        this.elements = (E[]) new Object[DEFAULT_CAPACITY];
    }
    //元素大小
    public int size(){
        return size;
    }
    //判断是否为空
    public boolean isEmpty(){
        return size == 0;
    }
    //队尾添加元素
    public void enQueue(E element){
        ensureCapacity(size + 1);
        //因为是环形的所以要取模，这样才能确定被前面被删除元素的索引
        elements[index(size)]= element;
        size++;
    }

    //出队，队头删除元素
    public E deQueue(){
        E frontElement = elements[front];
        elements[front] = null;
        //更新front，在循环的问题里面，更新索引都需要取模
        front = index(1);
        size--;
        return frontElement;
    }
    //情况元素
    public void clear(){
        //释放内存
        for (int i = 0; i < size ;i++){
            elements[index(i)] = null;
        }
        front = 0;
        size = 0;
    }

    //获取头元素
    public E front(){
        return elements[front];
    }


    // 将front真实索引转换为循环队列上的索引
    private int index(int index) {
        return (front + index) % elements.length;
    }

    // 扩容
    private void ensureCapacity(int capacity) {
        int oldCapacity = elements.length;
        if (oldCapacity >= capacity)
            return;
        // 新容量为旧容量的 1.5 倍
        int newCapacity = oldCapacity + (oldCapacity >> 1);
        E[] newElements = (E[]) new Object[newCapacity];
        for (int i = 0; i < size; i++) { // 旧数组中元素移到新数组
            newElements[i] = elements[index(i)];
            // newElements[i] = elements[index(i)];
        }
        System.out.println("从" + oldCapacity + "扩容到" + newCapacity);
        elements = newElements;
        front = 0; // 重置front
    }
}

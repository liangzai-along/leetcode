package datastructure.array;


/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/6/10 12:18
 */

//方法总结：、
// 元素个数相关：数量，是否为空
// 增删改查
public class ArrayList {

    //属性
    private int size;
    private int[] elements;

    private static final int DEFAULT_CAPACITY = 10;
    private static final int ELEMENT_NOT_FIND = -1;

    //构造方法
    public ArrayList(){
        //什么意思
        this(DEFAULT_CAPACITY);
    }

    public ArrayList(int cacacity){
        cacacity = DEFAULT_CAPACITY > cacacity ? DEFAULT_CAPACITY : cacacity;
        this.elements = new int[cacacity];
    }

    //元素的数量
    public int size(){
        return size;
    }

    //是否为空
    public boolean isEmpty(){
        return size == 0;
    }

    //添加元素到最后面
    public void add(int element){
        add(size,element);
    }

    //指定位置添加元素
    public void add(int index, int element){
        //检查是否越界
        rangeCheckForAdd(index);
        //扩容
        ensureCapacity(size + 1);
        //往后移动
        for (int i = size - 1; i > index; i--){
            elements[i+1] = elements[i];
        }
        elements[index] = element;
        size++;
    }

    //删除指定索引的元素
    public int remove(int index){
        rangeCheck(index);
        int old = elements[index];
        for (int i = index; i < size-1; i++){
            elements[i] = elements[i+1];
        }
        size--;
        return old;
    }
    //清空元素
    public void clear(){
        size = 0;
    }

    //修改元素
    public int set(int index, int element){
        rangeCheck(index);
        int temp = elements[index];
        elements[index] = element;
        return temp;
    }

    //查看index的元素
    public int get(int index){
        rangeCheck(index);
        return elements[index];
    }
    //查看元素索引
    public int indexof(int element){
        for (int i = 0; i < size; i++){
            if (elements[i] == element) return i;
        }
        return ELEMENT_NOT_FIND;
    }
    //是否包含某个元素
    public boolean contain(int element){
        return indexof(element) != DEFAULT_CAPACITY;
    }


    /*
     * 扩容操作
     */
    private void ensureCapacity(int capacity) {
        int oldCapacity = elements.length;
        if (oldCapacity >= capacity) return;
        // 新容量为旧容量的1.5倍
        int newCapacity = oldCapacity + (oldCapacity >> 1); // 1.5
        int[] newElements = new int[newCapacity];
        for (int i = 0; i < size; i++) {
            newElements[i] = elements[i];
        }
        elements = newElements;
    }
    // 下标越界抛出的异常
    private void outOfBounds(int index) {
        throw new IndexOutOfBoundsException("Index:" + index + ", Size:" + size);
    }
    // 检查下标越界(不可访问或删除size位置)
    private void rangeCheck(int index){
        if(index < 0 || index >= size){
            outOfBounds(index);
        }
    }
    // 检查add()的下标越界(可以在size位置添加)
    private void rangeCheckForAdd(int index) {
        if (index < 0 || index > size) {
            outOfBounds(index);
        }
    }
    @Override
    public String toString() {
        // 打印形式为: size=5, [99, 88, 77, 66, 55]
        StringBuilder string = new StringBuilder();
        string.append("size=").append(size).append(", [");
        for (int i = 0; i < size; i++) {
            if(0 != i) string.append(", ");
            string.append(elements[i]);
        }
        string.append("]");
        return string.toString();
    }
}

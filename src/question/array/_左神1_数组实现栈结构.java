package question.array;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/12/10 21:55
 */
public class _左神1_数组实现栈结构 {

    private Integer[] arr;
    private Integer size;

    public _左神1_数组实现栈结构(int initSize) {
        if (initSize < 0) {
            throw new IllegalArgumentException("the init size is less than 0");
        }
        arr = new Integer[initSize];
        size = 0;
    }

    public Integer peek() {
        if (size == 0) {
            return null;
        }
        return arr[size-1];
    }

    public void push(int obj) {
        if (size == arr.length) {
            throw new ArrayIndexOutOfBoundsException("the queue is full");
        }
        arr[size++] = obj;
    }

    public Integer pop() {
        if (size == 0) {
            throw new ArrayIndexOutOfBoundsException("the queue is empty");
        }
        return arr[--size];
    }
}

package datastructure.sort;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/6/11 16:12
 */
public abstract class Sort {
    protected Integer[] array;
    private int cmpCount;
    private int swapCount;

    public Sort() {
    }


    public void sort(Integer[] array){
        if (array == null || array.length < 2) return;
        this.array = array;
        sort();
    }

    protected abstract void sort();

    /**
     *
     * @param index1
     * @param index2
     * @return
     * 返回结果等于0，说明array[index] = question.array[index]
     * 返回结果大于0，说明array[index] > question.array[index]
     * 返回结果小于0，说明array[index] < question.array[index]
     */
    protected int compare(int index1, int index2){
        //记录比较的次数
        cmpCount++;
        return array[index1] - array[index2];
    }

    //直接比较两个元素
    protected int cmpEle(Integer e1, Integer e2){
        return e1 - e2;
    }

    /**
     * 交换两个
     * @param index1
     * @param index2
     */
    protected void swap(int index1, int index2){
        //记录交换的次数
        swapCount++;
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

}

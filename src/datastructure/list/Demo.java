package datastructure.list;

import java.util.LinkedList;
import java.util.List;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/6/12 22:00
 */

//修饰外部类
public  class Demo {
    List<Integer> list = new LinkedList<>();
    //类方法
    public void a(){};
    protected void b(){};
    void c(){};
    private void d(){};

    //修饰内部类
    public class A{

    }
    protected class B{

    }
    class C{

    }
    private class D{

    }
}



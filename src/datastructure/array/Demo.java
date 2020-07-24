package datastructure.array;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/7/10 9:05
 */
public class Demo {


    public static void main(String[] args) {
        //String str = "123456";
        //System.out.println(str.substring(1, str.length()-1));
        //byte b1 = 1;
        //byte b2 = 3;
        ////发生错误，因为b1和b2都是变量，编译的时候系统不确定，会按照int处理，会出现类型转换异常
        ////byte b3 = b1 + b2;
        //byte b4= (byte)(b1 + b2);
        int week = 1;
        switch (week) {
            case 2:
                System.out.println(1);
                break;
            case 1:
                System.out.println(2);
                break;
            case 3:
                System.out.println(3);
                break;
            default:
                System.out.println("d");
                break;

        }
    }
}

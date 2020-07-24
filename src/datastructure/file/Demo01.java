package datastructure.file;

import java.io.*;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/6/9 18:59
 */
//学一个类，先看为什么要学这个类，然后学这个类的使用，学类的使用就先学构造方法，有参构造，一个参数，
//多个参数，无参构造
//然后就是学方法，静态方法和非静态方法
public class Demo01 {
    public static void main(String[] args) throws Exception {
        //路径字符串创建文件实例
        String pathName = "E:\\a.txt";
        File file1= new File(pathName);
        //append为true,在后面续写，false则会覆盖
        //文件对象构造方法
        FileOutputStream fileOutputStream = null;
        try {
            //append为true,在后面续写，false则会覆盖
            fileOutputStream = new FileOutputStream(file1,true);
            //write(int b),写入数据，97代表a,98代表b,99代表c
            fileOutputStream.write(97);
            fileOutputStream.write(98);
            fileOutputStream.write(99);
            //write(byte[] b)，写入字节数组数据
            byte[] b = "abc".getBytes();
            for (int i = 0; i < b.length; i++) {
                //写入一个字节
                fileOutputStream.write(b[i]);
                //换行符转换为字节数组写入
                fileOutputStream.write("\r\n".getBytes());
            }
            fileOutputStream.write(b);
        } finally {
            //关闭流
            fileOutputStream.close();
        }
        //文件对象构造方法
        FileInputStream inputStreamFile = null;
        try {
            inputStreamFile = new FileInputStream(file1);
            //read方法每次读一个字节返回一个int,末尾返回-1
            int b;
            while ((b = inputStreamFile.read()) != -1){
                System.out.println((char)b);
            }
            //read(byte[] c),读取字节到字节数组中，并返回有效字节长度，末尾返回-1
            byte[] c = new byte[2];
            int len;
            while ((len = inputStreamFile.read(c)) != -1){
                System.out.println(new String(c));
            }
        } finally {
            //关闭流
            inputStreamFile.close();
        }

        //路径构造方法
        try {
            FileInputStream inputStreamPath = new FileInputStream(pathName);
        }catch (Exception e){
            e.printStackTrace();
        }
        //获取方法
        System.out.println("文件绝对路径"+file1.getAbsolutePath());
        System.out.println("文件相对路径"+file1.getPath());
        System.out.println("文件名称"+file1.getName());
        //判断方法
        System.out.println("是否存在"+file1.exists());
        System.out.println("是不是目录"+file1.isDirectory());
        System.out.println("是不是文件"+file1.isFile());
        //目录遍历
        //获取目录下的文件和文件夹的名称
        String[] list = file1.list();
        //获取目录下的文件和文件夹对象
        File[] files = file1.listFiles();

        String path = "a.txt";
        File file = new File(path);
        //file对象构造方法,append:true续写
        FileWriter fileWriter = new FileWriter(file,true);
        fileWriter.write("你好");
        //换行
        fileWriter.write("\\r\\n");

        //write(int a)
        fileWriter.write(2000);
        //write(char[] c)
        char[] c = "你好呀".toCharArray();
        fileWriter.write(c);
        //write(String s)
        fileWriter.write("字符串");
        //如果未关闭，数据为保存到缓冲区，并未保存到文件中
        fileWriter.close();


    }

}

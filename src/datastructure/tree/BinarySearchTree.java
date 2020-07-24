package datastructure.tree;//package com.xiaolong.tree;
//
//import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
//
//import java.util.Comparator;
//import java.util.LinkedList;
//import java.util.Queue;
//
///**
// * @Author: xiaolong
// * @email: xlshi1996@163.com
// * @Date: 2020/6/14 19:44
// */
//public class BinarySearchTree<E> {
//    private int size;
//    //根结点
//    private Node<E> root;
//    //比较器
//    //private Comparator comparator;
//    //不传比较器
//    public BinarySearchTree() {
//        this(null);
//    }
//    //传入比较器
//    public BinarySearchTree(Comparator comparator){
//        this.comparator = comparator;
//    }
//    /**
//     * 容器元素多少
//     * @return
//     */
//    public int size(){
//        return  size;
//    }
//
//    /**
//     * 判断是否为空
//     * @return
//     */
//    public boolean isEmpty(){
//        return size == 0;
//    }
//    public void clear(){
//
//    }
//
//    /**
//     * 添加元素
//     */
//    public void add(E element){
//        //检查传入元素是否非null
//        elementNotNullCheck(element);
//        //添加根节点
//        if (root == null){
//            root = new Node<>(element, null);
//            size++;
//            return;
//        }
//        //添加非根节点,先找到根节点,然后依次进行比较，找到合适的位置
//        Node<E> node = root;
//        //保存父节点
//        Node<E> parent = root;
//        //保存方向
//        int cmp = 0;
//        while (node != null){
//            //找到要添加位置的父节点
//            parent = node;
//            cmp = cmpareTo(element, node.element);
//            if (cmp > 0){
//                //传入元素更大，则往右节点找
//                node = node.right;
//            }else if (cmp < 0){
//                //传入元素更小，往左子节点找
//                node = node.left;
//            }else {
//                //相等覆盖点
//                node.element = element;
//                return;
//            }
//        }
//        //上面是找到要添加的位置，也就是父节点
//        //进行添加
//        Node<E> newNode = new  Node<>(element, parent);
//        if (cmp > 0){
//            parent.right = newNode;
//        }else {
//            parent.left = newNode;
//        }
//        size++;
//    }
//
//    /**
//     * 删除元素
//     * @param element
//     * @return
//     */
//    public E remove(E element){
//        return null;
//    }
//
//    /**
//     * 判断是否含有
//     * @param element
//     * @return
//     */
//    public boolean contain(E element){
//        return false;
//    }
//
//    public void elementNotNullCheck(E element){
//        if (element == null){
//            throw new IllegalArgumentException("element must not null");
//        }
//    }
//    //节点类
//    private static class Node<E>{
//        E element;
//        //左子节点
//        Node<E> left;
//        //右子节点
//        Node<E> right;
//        //父节点
//        Node<E> parent;
//
//        public Node(E element, Node<E> parent) {
//            this.element = element;
//            this.parent = parent;
//        }
//    }
//
//    /**
//     * 返回值等于0，代表相等
//     * 大于0，则e1大
//     * 小于0，则e2大
//     * @param e1
//     * @param e2
//     * @return
//     */
//    private int cmpareTo(E e1, E e2){
//        //传入比较器，则用比较器
//        if (comparator != null){
//            return comparator.compareTo(e1, e2);
//        }else {
//            // 没传比较器，元素内部必须自行实现了 Comparable 接口
//            //强制转换成Compareable<E>接口类型，然后自己再内部定义比较方法
//            return ((Comparable<E>)e1).compareTo(e2);
//        }
//    }
//
//    /**
//     * 利用层次遍历不管用处是什么，都要先把逻辑先写出来，然后再根据需求进行下一步逻辑
//     * @return
//     */
//    public boolean isComplete(){
//        if (root == null) return false;
//        Queue<Node> queue = new LinkedList<>();
//        queue.offer(root);
//        boolean leaf = false;
//        while (! queue.isEmpty()){
//            Node node = queue.poll();
//            //(node.left != null || node.right != null):判断是否为子节点
//            if (leaf && (node.left != null || node.right != null)) return false;
//
//            if (node.left != null){
//                queue.offer(node.left);
//            }else if (node.right != null){
//                return false;
//            }
//
//            if (node.right != null){
//                queue.offer(node.right);
//            }else {
//                //进入这里，要求后面的遍历的节点都得是叶子节点
//                //这个标记挺巧妙的
//                leaf = true;
//            }
//        }
//        return true;
//    }
//
//    /**
//     * 前驱
//     * @param node
//     * @return
//     */
//    private Node<E> predecessor(Node<E> node){
//        if (node == null) return null;
//        Node<E> p = node.left;
//        //前驱节点在左子树
//        if (node.left != null){
//            while (p.right != null){
//                p = p.right;
//            }
//            return p;
//        }
//        // 从父节点往上找
//        while (node.parent != null && node == node.parent.left){
//            node = node.parent;
//        }
//        return node.parent;
//    }
//
//    /**
//     * 后继
//     * @param node
//     * @return
//     */
//    private Node<E> succssor(Node<E> node){
//        if (node == null) return null;
//        Node<E> s = node.right;
//        if (node.right != null){
//            while (s.left != null){
//                s = s.left;
//            }
//            return s;
//        }
//        while (node.parent != null && node == node.parent.right){
//            node = node.parent;
//        }
//        return node.parent;
//    }
//}
//

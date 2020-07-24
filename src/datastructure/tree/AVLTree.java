package datastructure.tree;

import java.util.Comparator;

/**
 * @Author: xiaolong
 * @email: xlshi1996@163.com
 * @Date: 2020/6/15 16:43
 */
public class AVLTree<E> extends BST {

    public AVLTree() {
        this(null);
    }

    public AVLTree(Comparator comparator) {
        super(comparator);
    }


}

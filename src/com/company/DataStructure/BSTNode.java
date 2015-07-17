package com.company.DataStructure;

/**
 * @author nuran
 * @version 1.0.
 * @since 7/13/15
 */
public class BSTNode<T> {
    BSTNode<T> parent;

    BSTNode<T> left;
    BSTNode<T> right;
    T value;
    Integer level;

    public BSTNode<T> getParent() {
        return parent;
    }

    public void setParent(BSTNode<T> parent) {
        this.parent = parent;
    }

    public BSTNode<T> getLeft(){
        return left;
    }

    public BSTNode<T> getRight(){
        return right;
    }

    public T getValue() {
        return value;
    }

    public void setLeft(BSTNode<T> left) {
        this.left = left;
    }

    public void setRight(BSTNode<T> right) {
        this.right = right;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }
}

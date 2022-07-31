package com.greatlearning.BSTToRightSkewedTree;

public class Main {
    public static void main (String[] args)
    {
        BSTToRightSkewedTree tree = new BSTToRightSkewedTree();
        tree.node = new Node(50);
        tree.node.left = new Node(30);
        tree.node.right = new Node(60);
        tree.node.left.left = new Node(10);
        tree.node.right.left= new Node(55);

        tree.bstToRightSkewedTree(tree.node);
        tree.traverseRightSkewed(tree.headNode);
    }
}

package com.greatlearning.BSTToRightSkewedTree;

// Class of the node
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
class BSTToRightSkewedTree
{
    Node node;
    Node prevNode = null;
    Node headNode = null;

    public void bstToRightSkewedTree(Node root)
    {
        if(root == null)
        {
            return;
        }
        bstToRightSkewedTree(root.left);

        Node rightNode = root.right;
        Node leftNode = root.left;

        if(headNode == null)
        {
            headNode = root;
        }
        else
        {
            prevNode.right = root;
        }
        root.left = null;
        prevNode = root;

        bstToRightSkewedTree(rightNode);
    }

    public void traverseRightSkewed(Node root)
    {
        if(root == null)
        {
            return;
        }
        System.out.print(root.data + " ");
        traverseRightSkewed(root.right);
    }
}
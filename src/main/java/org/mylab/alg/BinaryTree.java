package org.mylab.alg;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class BinaryTree {

    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        bt.insert(5);
        bt.insert(2);
        bt.insert(9);
        bt.insert(8);
        bt.insert(3);
        bt.insert(1);
        bt.insert(5);

        bt.depthFirstInOrder();
        System.out.println();
        bt.breadthFirst();
    }

    public class Node {
        int key;
        Node left, right;

        public Node(int item) {
            key = item;
            left = right = null;
        }
    }

    private Node root;

    public BinaryTree() {
        root = null;
    }

    public void insert(int key) {
        root = insert(root, key);
    }

    private Node insert(Node current, int key) {
        if (current == null) {
            return new Node(key);
        }

        if (key < current.key) {
            current.left = insert(current.left, key);
        } else if (key > current.key) {
            current.right = insert(current.right, key);
        } else {
            return current;
        }

        return current;
    }

    public void depthFirstInOrder() {
        depthFirstInOrder(root);
    }

    private void depthFirstInOrder(Node node) {
        if (node != null) {
            depthFirstInOrder(node.left);
            System.out.print(node.key + " ");
            depthFirstInOrder(node.right);
        }
    }

    public void depthFirstPreOrder() {
        depthFirstPreOrder(root);
    }

    private void depthFirstPreOrder(Node node) {
        if (node != null) {
            System.out.print(node.key + " ");
            depthFirstInOrder(node.left);
            depthFirstInOrder(node.right);
        }
    }

    public void depthFirstPostOrder() {
        depthFirstPostOrder(root);
    }

    private void depthFirstPostOrder(Node node) {
        if (node != null) {
            depthFirstInOrder(node.left);
            depthFirstInOrder(node.right);
            System.out.print(node.key + " ");
        }
    }

    public void breadthFirst() {
        breadthFirst(root);
    }

    private void breadthFirst(Node root) {
        Queue<Node> q = new LinkedBlockingQueue<>();
        q.add(root);
        breadthFirstRecursive(q);
    }

    private void breadthFirstRecursive(Queue<Node> q) {
        if (q.size() == 0) {
            return;
        }
        Node node = q.poll();
        System.out.print(node.key + " ");
        if (node.left != null) {
            q.add(node.left);
        }
        if (node.right != null) {
            q.add(node.right);
        }
        breadthFirstRecursive(q);
    }

    public boolean containsNode(int value) {
        return containsNodeRecursive(root, value);
    }

    private boolean containsNodeRecursive(Node current, int key) {
        if (current == null) {
            return false;
        }
        if (key == current.key) {
            return true;
        }
        return key < current.key
                ? containsNodeRecursive(current.left, key)
                : containsNodeRecursive(current.right, key);
    }

}

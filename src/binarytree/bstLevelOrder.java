package binarytree;

//public class bstLevelOrder {
//
//}

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class Node
{
    int data;
    Node left, right;
    public Node(int item)
    {
        data = item;
        left = right = null;
    }
}

class BinaryTree
{
    // Root of the Binary Tree
    Node root;

    public BinaryTree()
    {
        root = null;
    }

    static void levelOrder(Node root){
        //Write your code here
        if(root == null) return;

        Queue<Node> q = new LinkedList<>();

        q.offer(root);
        while(!q.isEmpty()){
            Node tempNode = q.poll();
            System.out.print(tempNode.data + " ");

            if (tempNode.left != null) {
                q.offer(tempNode.left);
            }

            if (tempNode.right != null) {
                q.offer(tempNode.right);
            }

        }


    }

    public boolean isValidBST(Node root) {
        Stack<Node> stack = new Stack<>();
        double left_val = -Double.MAX_VALUE;

        while(!stack.isEmpty() || root!=null){
            while(root!=null){
                stack.push(root);
                root = root.left;
            }

            root = stack.pop();
            if(left_val>=root.data) return false;
            left_val = root.data;
            root = root.right;
        }
        return true;

    }
    /* Driver program to test above functions */
    public static void main(String args[])
    {
        BinaryTree tree = new BinaryTree();
        tree.root= new Node(4);
        tree.root.left= new Node(2);
        tree.root.right= new Node(6);
        tree.root.left.left= new Node(1);
        tree.root.left.right= new Node(3);
        tree.root.right.right= new Node(7);
        tree.root.right.left= new Node(5);
//        tree.root.left.right= new Node(8);

//        System.out.println("Level order traversal of binary tree is ");
//                tree.levelOrder(tree.root);
//        System.out.println("Level order traversal of binary tree is ");
        System.out.println(tree.isValidBST(tree.root));
    }
}

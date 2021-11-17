package test;

//public class test2Binary {
//}

import dp.ClimbStairsMinMoves;

import java.util.*;

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

    public List<List<Integer>> levelOrderTraversal(Node node){
        List<List<Integer>> res = new ArrayList<>();

        Queue<Node> queue = new LinkedList<>();
        queue.offer(node);

        while(!queue.isEmpty()){
            int size = queue.size();
            List<Integer> li = new ArrayList<>();
            for(int i =0; i<size;i++){
                if(queue.peek().left!=null) queue.offer(queue.peek().left);
                if(queue.peek().right!=null) queue.offer((queue.peek().right));
                li.add(queue.poll().data);
            }
            res.add(0,li);
        }

        return res;
    }

    public List<List<Integer>> levelRecur(Node node){
        List<List<Integer>> res = new ArrayList<>();
        level(node,0,res);
        return res;
    }
    public void level(Node node, int lev , List<List<Integer>> ans){

        if(node == null) return;

        if(ans.size()<=lev){
            ans.add(new ArrayList<>());
        }
        ans.get(lev).add(node.data);
        level(node.left, lev+1,ans);
        level(node.right ,lev+1,ans);

    }

    public void lefttree(Node node){
        if(node == null)
            return;

        if(node.left!=null){
            System.out.print(node.data + " ");
            lefttree(node.left);
        }
        else if(node.right!=null){
            System.out.print(node.data + " ");
            lefttree(node.right);
        }

    }

    public void rightTree(Node node ){
        if(node == null)
            return;

        if(node.right!=null){

            rightTree(node.right);
            System.out.print(node.data + " ");
        }
        else if(node.left!=null){
            rightTree(node.left);
            System.out.print(node.data + " ");
        }
    }

    public void leaves(Node node ){
        if(node == null) return;
        leaves(node.left);
        if(node.left==null&&node.right==null){
            System.out.print(node.data + " ");
        }
        leaves(node.right);
    }

    public void boundaryTraversal(Node node){

        System.out.print(node.data + " ");
        lefttree(node.left);
        leaves(node.left);
        leaves(node.right);
        rightTree(node.right);

    }

    public void KthLargestBinary(Node node,int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

       search(node,pq);

       for(int i =1; i<k ; i++){
           pq.poll();
       }
        System.out.println("hello"+pq.poll());

    }

    void search(Node root , PriorityQueue<Integer> pq){
        if(root == null) return;
        search(root.left,pq);
        pq.offer(root.data);
        search(root.right,pq);
    }

    void postOrder(Node node){
        if(node == null) return;

        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.data + " ");
    }

    List<Integer> postOrder1(Node root){
        List<Integer> res = new ArrayList<>();
        if(root == null) return res;

        Stack<Node> stack = new Stack<>();
        stack.push(root);

        while(!stack.isEmpty()){
            Node current = stack.pop();
            res.add(0,current.data);
            if(current.left!=null){
                stack.push(current.left);
            }
            else if(current.right!=null){
                stack.push(current.right);
            }
        }
        return res;
    }

     int findMax(Node node){
        if(node == null)
            return Integer.MIN_VALUE;
        int res = node.data;
        int lres = findMax(node.left);
        int rres = findMax(node.right);

        if(lres>res){
            res = lres;
        }
        if(rres>res){
            res = rres;
        }
        return res;



     }

     int countLeaves(Node node){

         if(node == null) return 0;

         Queue<Node> q = new LinkedList<>();

         q.offer(node);
         int count =0;

         while(!q.isEmpty()){

             Node n = q.peek();
             q.poll();
             if(n.left!=null){
                 q.offer(n.left);
             }
             if(n.right!=null){
                 q.offer(n.right);
             }
             if(n.left==null && n.right == null){
                 count+=1;
             }

         }
         return count;
     }

    int getLeafCount()
    {
        return getLeafCount(root);
    }

    int getLeafCount(Node node)
    {
        if (node == null)
            return 0;
        if (node.left == null && node.right == null)
            return 1;
        else
            return getLeafCount(node.left) + getLeafCount(node.right);
    }

    Node mirror(Node node){
        if(node == null) return null;

        Node left = mirror(node.left);
        Node right = mirror(node.right);

        node.left = right;
        node.right = left;

        return node;

    }

    public int lengthOfLIS(int[] arr) {
        List<Integer> arry = new ArrayList<>();
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int l = 0, r = arry.size();
            while (l < r) {
                int m = l + (r - l) / 2;
                if (arry.get(m) < arr[i]) l = m + 1;
                else r = m;
            }
            if (l == arry.size()) arry.add(arr[i]);
            else arry.set(l, arr[i]);
        }
        return arry.size();
    }

    public int tes(int[] test){
        List<Integer> list = new ArrayList<>();
        int n = test.length;
        for(int i =0; i< n; i++){
            int l =0;
            int r = list.size();
            while(l<r){
                int m = l+(r-l)/2;
                if(list.get(m)<test[i]) {
                    l = m + 1;
                }
                else r=m;
                }
            if(l == list.size()) list.add(test[i]);
            else list.set(l,test[i]);
        }
        return list.size();
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
//        System.out.println(tree.levelOrderTraversal(tree.root));
//        System.out.println(tree.levelRecur(tree.root));
//       tree.boundaryTraversal(tree.root);
       int k =2;
//       tree.KthLargestBinary(tree.root, k);
//       tree.postOrder(tree.root);
//        System.out.println(tree.postOrder1(tree.root));
//        System.out.println(tree.findMax(tree.root));
//        System.out.println(tree.countLeaves(tree.root));
//        System.out.println(tree.getLeafCount());
//        System.out.println(tree.mirror(tree.root));
        int[] nums=  {10,9,2,5,3,7,101,18};
//        System.out.println(tree.lengthOfLIS(nums));
        System.out.println(tree.tes(nums));

    }
}



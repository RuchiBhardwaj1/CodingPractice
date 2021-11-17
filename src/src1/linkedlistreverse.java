package src1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }

 class TreeNode {
 int val;
TreeNode left;
 TreeNode right;
 TreeNode() {}
TreeNode(int val) { this.val = val; }
TreeNode(int val, TreeNode left, TreeNode right) {
this.val = val;
 this.left = left;
 this.right = right;
 }
 }

class linkedlistreverse {
    public ListNode reverseList(ListNode head) {
        ListNode curr = head,prev = null;
        while (curr!=null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode first = dummy, second = dummy;
        for (int i = 0; i < n + 1; i++){
            first = first.next;
        }
        while (first != null){
            second = second.next;
            first = first.next;
        }
        second.next = second.next.next;
        return dummy.next;
    }
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        if(l1==null) return l2;
        if(l2==null) return l1;

        if(l1.val>l2.val){
            ListNode temp = l1;
            l1=l2;
            l2=temp;

        }
        ListNode res = l1;
        while (l1!=null && l2!=null){
            ListNode tmp = null;
            while(l1!=null && l1.val<=l2.val){
                tmp = l1;
                l1=l1.next;
            }
            tmp.next=l2;
            ListNode temp = l1;
            l1=l2;
            l2=temp;

        }
        System.out.println(res);
        return res;

    }
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> values = new ArrayList<Integer>();
        if(root == null)
            return values;

        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode current = stack.pop();
            values.add(0,current.val);
            if(current.left!=null){
                stack.push(current.left);
            }
            if(current.right!=null){
                stack.push(current.right);
            }

        }
        return values;
    }

    public static void main(String [] args)
    {
        ListNode l = new ListNode(1);
        l.next= new ListNode(2);
//        l.next.next=new ListNode(3);
        l.next.next=new ListNode(4);
//        l.next.next.next.next=new ListNode(5);

        ListNode l2 = new ListNode(1);
//        l2.next= new ListNode(2);
        l2.next=new ListNode(3);
        l2.next.next=new ListNode(4);
//        l2.next.next.next.next=new ListNode(5);

        TreeNode t = new TreeNode();
        t.val = 5;



       linkedlistreverse rev = new linkedlistreverse();
       int n =2;
//        System.out.println(rev.removeNthFromEnd(l,n));
        System.out.println(rev.mergeTwoLists(l,l2));
    }
}

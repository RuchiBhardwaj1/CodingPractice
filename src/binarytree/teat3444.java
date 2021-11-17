//package binarytree;
//
//public class teat3444 {
//
//
//    Public boolean isBinaryTree(TreeNode root){
//        Stack<TreeNode> stack = new Stack<>();
//        Double left_val = -Double.MAX.VALUE;
//
//        while(!stack.isEmpty() || root!=null){
//            while(root!=null){
//                stack.push(root);
//                root = root.left;
//            }
//
//            root = stack.pop();
//            if(root.val<=left_val) return false;
//            Left_val = root.val;
//            root = root.right;
//        }
//        return true;
//    }
//
//    public static void main(String[] args) {
//
//    }
//    }

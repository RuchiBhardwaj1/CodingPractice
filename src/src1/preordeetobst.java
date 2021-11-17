package src1;//class preordertobst {
//  public  int nodeIndex;
//    public TreeNode bstFromPreorder(int[] preorder) {
//        if(preorder == null) {
//            return null;
//        }
//        nodeIndex = 0;
//        return bstHelper(preorder, Integer.MIN_VALUE , Integer.MAX_VALUE);
//    }
//    private TreeNode bstHelper(int[] preorder, int start, int end) {
//        if(nodeIndex == preorder.length || preorder[nodeIndex]<start || preorder[nodeIndex]>end) {
//            return null;
//        }
//        int val = preorder[nodeIndex++];
//        TreeNode node = new TreeNode(val);
//        node.left = bstHelper(preorder, start, val);
//        node.right = bstHelper(preorder, val, end);
//        return node;
//    }
//
//    public static void main(String[] args){
//        preordertobst p = new preordertobst();
//        int y[] = {8,5,1,7,10,12};
//        System.out.println(p.bstFromPreorder(y));
//
//    }
//}

class preordeetobst{
    public static void bb(int i ){
        if (i == 2){
            System.out.println("w");
        }
        if(i ==4){
            System.out.println("j");
        }
        else{
            System.out.println("h");
        }
    }

    public static void main(String [] args){
        int i = 2;
        bb(i);
    }
}
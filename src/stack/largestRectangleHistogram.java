package stack;

import java.util.Stack;

public class largestRectangleHistogram {

    public static int largestRectangleArea(int[] a) {
        int n = a.length;
        Stack<Integer> s = new Stack<>();
        int[] left = new int[n];
        int[] right = new int[n];

        for(int i = 0; i< n;i++){
            while(!s.isEmpty() && a[i]<=a[s.peek()]) s.pop();
            if(s.isEmpty() ) left[i]=0;
            else left[i] = s.peek()+1;
            s.push(i);
        }

        s.clear();

        for(int i = n-1; i>=0;i--){
            while(!s.isEmpty() && a[i]<=a[s.peek()]) s.pop();
            if(s.isEmpty() ) right[i]=n-1;
            else right[i] = s.peek()-1;
            s.push(i);
        }

        int maxArea = 0;

        for(int i =0; i< n;i++){
            int widthe = right[i]-left[i]+1;
            int area = widthe*a[i];
            maxArea= Math.max(maxArea,area);
        }
return maxArea;
    }

    public static void main(String[] args) {
        int[] heights = {2,1,5,6,2,3};
        System.out.println(largestRectangleArea(heights));

    }

}

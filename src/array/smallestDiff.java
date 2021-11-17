package array;

import java.util.Arrays;

public class smallestDiff {
}



class Program {
    public static int[] smallestDifference(int[] arrayOne, int[] arrayTwo) {
        // Write your code here.
        Arrays.sort(arrayOne);
        Arrays.sort(arrayTwo);
        int idxOne =0;
        int idxTwo = 0;
        int smallest = Integer.MAX_VALUE;
        int current = Integer.MAX_VALUE;
        int[] smallestPair = new int[2];
        while(idxOne<arrayOne.length && idxTwo<arrayTwo.length){
            int f = arrayOne[idxOne];
            int s = arrayOne[idxTwo];
            if(f<s){
                current = s-f;
                idxOne++;
            }
            else if(s<f){
                current = f-s;
                idxTwo++;
            }
            else{
                return new int[]{f,s};
            }
            if(smallest > current ){
                smallest = current;
                smallestPair = new int[]{ f,s};
            }
        }
        return smallestPair;
    }

    public static void main(String[] args) {
        int[] a = new int[]{-1,5,10,20,28,3};
        int[] b = new int[] {26,134,15,17,135};
        System.out.println(smallestDifference(a,b));

    }
}

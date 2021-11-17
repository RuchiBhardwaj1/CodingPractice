package recursion;

import java.util.Arrays;

public class firstOccurenceOfIndex {

    public static  int occure(int[] arr, int idx, int d){
        if(idx == arr.length){
            return -1;
        }

        if(arr[idx]==d){
            return idx;
        }
        else{
            int fissa = occure(arr, idx+1,d);
            return fissa;
        }
    }

    public static int lastOccur(int[] arr, int idx, int d){
        if(idx == arr.length){
            return -1;
        }

        int fissa = lastOccur(arr, idx+1,d);
        if(fissa ==-1) {
            if (arr[idx] == d) {
                return idx;
            } else {
                return -1;
            }
        }
        else{
            return fissa;
        }
    }

    public static int[] allTheoccur(int[] arr, int idx, int d, int fsf){
        if(idx == arr.length){
            return new int[fsf];
        }

        if(arr[idx]==d){
            int[] arrii = allTheoccur(arr, idx+1, d, fsf+1);
            arrii[fsf]=idx;
            return arrii;

        }
        else{
            int[] arrii = allTheoccur(arr, idx+1, d,fsf);
            return arrii;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,2,3,5,6,4,5,7};
        System.out.println(occure(arr,0,5));
        System.out.println(lastOccur(arr,0,5));
        System.out.println(Arrays.toString(allTheoccur(arr, 0, 5, 0)));
    }
}

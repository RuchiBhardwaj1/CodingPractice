package array;

public class monotonicArray {

    public static boolean monot(int[] arr){
        boolean incr = true;
        boolean decr = true;

        for(int i =0; i< arr.length-1; i++){
            if(arr[i]>arr[i+1]) incr = false;
            if(arr[i]<arr[i+1]) decr = false;
        }

        return incr||decr;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,2,3};
        System.out.println(monot(arr));
    }
}

package recursion;

public class DisplayArray {

    public static void diplayAr(int[] arr, int idx){
        if(idx == arr.length) return;
        System.out.println(arr[idx]);
        diplayAr(arr, idx+1);
    }

    public static void diplayArReverse(int[] ary, int position){
        if(position == ary.length){
            return;
        }

        diplayArReverse(ary, position + 1);
        System.out.println(" " +ary[position]);
    }

    public static int MaxArray(int[] arr, int idx){
        if(idx== arr.length-1){
            return arr[idx];
        }

        int mxn = MaxArray(arr, idx+1);
        if(mxn>arr[idx]){
            return mxn;
        }
        else{
            return arr[idx];
        }
    }


    public static void main(String[] args) {
        int[] arr = {10,20,30};
        diplayAr(arr,0);
        diplayArReverse(arr,0);
    }
}



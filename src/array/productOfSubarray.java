package array;

public class productOfSubarray {

public static void even(int[] arr, int n){
    int total_sub =  n* (n+1)/2;

    int total_odd = 0;
    int count_odd = 0;

    for(int i =0; i<arr.length; i++){
        if(arr[i] % 2 ==0){
            count_odd = 0;

        }

        else{
            ++count_odd;
            total_odd+=count_odd;
        }
    }

    System.out.println(total_sub - total_odd);
}

    public static void main(String[] args) {
        int arr[] = { 7,5,4,9};
        int length = arr.length;

        even(arr,length);
    }
}

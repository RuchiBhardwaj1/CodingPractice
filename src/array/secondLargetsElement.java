package array;

import java.util.PriorityQueue;

public class secondLargetsElement {

}

// JAVA Code for Find Second largest
// element in an array
class GFG {

    /* Function to print the second largest
    elements */
    public static void print2largest(int arr[],
                                     int arr_size)
    {
        int i, first, second;

        /* There should be atleast two elements */
        if (arr_size < 2) {
            System.out.print(" Invalid Input ");
            return;
        }

        first = second = Integer.MIN_VALUE;
        for (i = 0; i < arr_size; i++) {
			/* If current element is smaller than
			first then update both first and second */
            if (arr[i] > first) {
                second = first;
                first = arr[i];
            }

			/* If arr[i] is in between first and
			second then update second */
            else if (arr[i] > second && arr[i] != first)
                second = arr[i];
        }

        if (second == Integer.MIN_VALUE)
            System.out.print("There is no second largest"
                    + " element\n");
        else
            System.out.print("The second largest element"
                    + " is " + second);
    }

    public static void second(int[] arr){
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for(int i =0; i<arr.length; i++){
            if(arr[i]> first){
                second = first;
                first = arr[i];
            }
            else if(arr[i]>first && arr[i]!=first){
                second = arr[i];
            }
        }

        if(second == Integer.MIN_VALUE){
            System.out.println("no second largest element");
        }
        else{
            System.out.println("seocnd "+ second);
        }

    }

    public static void sec(int[] arr){
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int i =0 ; i<arr.length; i++){
            if(pq.size()>2){
                pq.poll();
            }
            pq.add(arr[i]);
        }

        System.out.println(pq.peek());

    }

    /* Driver program to test above function */
    public static void main(String[] args)
    {
        int arr[] = { 1,2,2,3,3,3,2};
        int n = arr.length;
        print2largest(arr, n);
        second(arr);
        sec(arr);
    }
}
// This code is contributed by Arnav Kr. Mandal.


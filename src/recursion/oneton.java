package recursion;
class Main {

    public static void printNumbers(int n)
    {
        if(n<=0)
        {
            return;
        }
        else
        {
            System.out.print(" "+n);
            // Recursively call printNumbers
            printNumbers(n-1);
            // Print number while returning from recursion
            System.out.print(" "+n);
//            printNumbers(n-1);
            printNumbers(n-1);
            System.out.print(" "+n);
        }

    }

//    public static int printNumbers(int n)
//    {
//        if(n<=1)
//            return 1;
//        else
//            return n* printNumbers(n-1);
//
//    }
    public static void main(String[] args) {
        System.out.println("Hello, world!");
        int n = 2;
        printNumbers(n);

    }
}

//
//import java.util.Arrays;
//class Demo{
//    static void bubble_sort(int my_arr[], int len_arr){
//        if (len_arr == 1)
//            return;
//        for (int i=0; i<len_arr-1; i++)
//            if (my_arr[i] > my_arr[i+1]){
//                int temp = my_arr[i];
//                my_arr[i] = my_arr[i+1];
//                my_arr[i+1] = temp;
//            }
//        bubble_sort(my_arr, len_arr-1);
//    }
//    public static void main(String[] args){
//        int my_arr[] = {45, 67, 89, 31, 63, 0, 21, 12};
//        bubble_sort(my_arr, my_arr.length);
//        System.out.println("The array after implementing bubble sort is ");
//        System.out.println(Arrays.toString(my_arr));
//    }
//}

package recursion;

public class PrintZidzag {

    public static void print(int n){
        if(n==0)
            return;

        System.out.println(n);
        print(n-1);
        System.out.println(n);
        print(n-1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        int n = 3;
        print(n);
    }
}

package recursion;

public class testRecursion {

    public void print(int n){
        if(n ==0)
            return;

        System.out.println(n);//pre
        print(n-1);
        System.out.println(n);//in
        print(n-1);
        System.out.println(n);//post

    }

    public static void main(String[] args) {
        testRecursion t = new testRecursion();
        t.print(3);
    }
}

package dp;

public class fibonacci {


    public static int fibona(int n){
        if(n<=1)
            return n;

        System.out.println(n);
        return fibona(n-1) + fibona(n-2);
    }

    public static int fibona1(int n){
        if(n==0 || n==1) return n;
        int[] dp=new int[n+1];
        dp[0]=0;
        dp[1]=1;

        for(int i=2;i<dp.length;i++){
            System.out.println(i);
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }

    public static int fibona2(int n){
        if(n==0 || n==1) return n;
        int a =0;
        int b =1;
        int sum = a+b;
        while(n>1){
            System.out.println(n);
            sum = a+b;
            a= b;
            b= sum;
            n--;
        }
        return sum;
    }

    public static void main(String[] args) {
        int n = 5;
//        System.out.println(fibona(n));
//        System.out.println(fibona1(n));
        System.out.println(fibona2(n));
    }
}

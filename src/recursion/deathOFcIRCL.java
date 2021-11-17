package recursion;

public class deathOFcIRCL {

    public static int solve(int n , int k){
        if(n ==1){
            return 1;

        }
        return (solve(n-1,k)+k-1)%n+1;
    }
    public static void main(String[] args) {
        int n = 5;
        int k = 2;
        System.out.println(solve(n,k));

    }
}

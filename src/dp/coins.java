package dp;

public class coins {

    public static int coinChange(int[] arr, int amt) {

        int[] dp = new int[amt+1];
        dp[0]=1;
        for(int i=0; i<arr.length; i++){
            for(int j = arr[i]; j<dp.length; j++){
                dp[j]+=dp[j-arr[i]];
            }
        }

        return dp[amt];
    }

    public static void main(String[] args) {
        int[] cons = {9,6,5,1};
        int amt = 11;

        System.out.println(coinChange(cons,amt));
    }
}

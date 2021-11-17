package dp;

public class subsetsum {

//    public static int solve(int[] A, int B) {
//
//        boolean[][] dp = new boolean[A.length+1][B+1];
//        for(int i =0; i< dp.length;i++){
//            for(int j = 0; j< dp[0].length; j++){
//                if(i ==0 && j ==0){
//                    dp[i][j] = true;
//                }
//                else if( i==0){
//                    dp[i][j] = false;
//                }
//                else if(j ==0){
//                    dp[i][j] = true;
//                }
//                else{
//                    if(dp[i-1][j] == true){
//                        dp[i][j] = true;
//                    }
//                    else{
//                        int val = A[i-1];
//                        if(j>=val){
//                            if(dp[i-1][j-val]==true){
//                                dp[i][j]=true;
//                            }
//                        }
//                    }
//                }
//            }
//        }
//
//        if(dp[A.length][B] == true){
//            return 1;
//        }
//        return 0;
//
//    }

    void sum (int a , long b ){
        System.out.println("sum1");
    }
    void sum(int a ,int b){
        System.out.println("sum2");
    }

    public static void main(String[] args) {
        int[] A = {3, 34, 4, 12, 5, 2};
        int B = 9;
        subsetsum sub = new subsetsum();
        int a = 2;
        int b =4;
        sub.sum(a,b);

//        System.out.println(solve(A,B));
    }
}

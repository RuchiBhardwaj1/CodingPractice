package dp;

public class climbStairs {
    public static int countPaths(int n){

        if(n==0)
            return 0;
        else if(n<0)
            return 0;
        System.out.println(n);
        int nums1 = countPaths(n-1);
        int num2 = countPaths(n-2);
        int np = nums1+num2;

        return np;



    }
    public static int climbStairsZ(int n) {
        int[] qb = new int[n+1];
        return test( n,qb);
    }

    public static  int test(int n ,int[] qb){
        if( n==0)
            return 1;
        else if(n<0)
            return 0;

        if(qb[n]> 0)
            return qb[n];

        System.out.println(n);
        int nm1 = test(n-1, qb);
        int nm2 = test(n-2,qb);

        int cp = nm1+nm2;

        qb[n] = cp;
        return cp;

    }
     public static int climbStairsTebul(int n){
        int[] db = new int[n+1];
        db[0] = 1;

        for(int i = 1; i< db.length; i++){
            if(i ==1)
                db[i] = db[i-1];
            else
                db[i] = db[i-1]+ db[i-2];

        }
        return db[n];

     }


    public static void main(String[] args) {
        int n = 10;
//        System.out.println( countPaths(n));
//        System.out.println(climbStairsZ(n));
        System.out.println(climbStairsTebul(n));
    }
}
package recursion;

public class Print1sand0s {

    public static void print(int ones, int zero, int n, String op){
        if(n ==0){
            System.out.println(op);
            return;
        }
        String op1 = op;
        op1= op1+"1";
        print(ones+1,zero,n-1,op1);
        if(ones>zero){
            String op2 = op;
            op2 = op2+"0";
            print(ones,zero+1,n-1,op2);
        }

    }

    public static void main(String[] args) {
        int ones =0;
        int zero = 0;
        int n = 3;
        print(ones,zero,n,"");


    }
}

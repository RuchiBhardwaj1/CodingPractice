package recursion;

public class permutationwithspaces {

    public static void solve(String inp, String op ){

        if(inp.length()==0){
            System.out.println(op);
            return;
        }
        String op1 = op;
        String op2 = op;
        op1 = op1+"-";
        op1 = op1+inp.charAt(0);
        op2 = op2+inp.charAt(0);
        inp = inp.substring(1);
        solve(inp,op1);
        solve(inp,op2);
    }

    public static void main(String[] args) {
        String inp = "ABC";
        String op = "";
        op = op+inp.charAt(0);
        inp = inp.substring(1);
        solve(inp,op);

    }
}

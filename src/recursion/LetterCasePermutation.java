package recursion;

import java.util.ArrayList;
import java.util.List;

public class LetterCasePermutation {

    public static List<String> letterCasePermutation(String S) {
        List<String> res = new ArrayList<>();
        solve(S,res,"");
        System.out.println(res);
        return res;
    }

    public static void solve(String inp,List<String> res,String out){
        if(inp.length()==0){
            res.add(out);
            return;
        }

        String op1 = out;
        String op2 = out;
        if(('a'<= inp.charAt(0) && 'z'>=inp.charAt(0) )||('A'<= inp.charAt(0)&& 'Z'>= inp.charAt(0))){
            op1 = op1+Character.toUpperCase(inp.charAt(0));
            op2 = op2+Character.toLowerCase(inp.charAt(0));
            inp = inp.substring(1);
            solve(inp, res,op1);
            solve(inp,res,op2);
        }
        else{
            String outp = out;
            outp=outp+inp.charAt(0);
            inp = inp.substring(1);
            solve(inp,res,outp);
        }

    }


    public static void main(String[] args) {
        String s = "a1B2";
        letterCasePermutation(s);

    }
}

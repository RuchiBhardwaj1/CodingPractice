package recursion;

import java.util.ArrayList;

public class generateAllPranthesesi {

    public static ArrayList<String> generateParenthesis(int A) {
        ArrayList<String> list = new ArrayList<>();
        int open = A;
        int close = A;
        solve(open, close, list, "");
        System.out.println(list);
        return list;
    }
    public static void solve(int open , int close, ArrayList<String> list, String outp){
        if(open ==0 && close ==0){
            list.add(outp);
            return;
        }

        if(open !=0){
            String op1 = outp;
            op1 = op1+"(";
            solve(open-1,close,list,op1);
        }
        if(close>open){
            String op = outp;
            op = op+")";
            solve(open,close-1,list,op);
        }

        String[] s = new String[list.size()];

        for(int i =0 ; i< list.size(); i++){
            s[i] = list.get(i);
        }
    }


        public static void main(String[] args) {
        int A = 3;
        generateParenthesis(3);
    }

}

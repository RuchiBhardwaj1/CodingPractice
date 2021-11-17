package recursion;

import java.util.ArrayList;

public class subsequence {
    public static ArrayList<String> subs(String s){
        if(s.length()==0){
            ArrayList<String > base = new ArrayList<>();
            base.add("");
            return base;
        }

        Character c = s.charAt(0);
        String str = s.substring(1);
        ArrayList<String> ros = subs(str);

        ArrayList<String > mres = new ArrayList<>();
        for(String val: ros){
            mres.add(""+val);
            mres.add(c+val);
        }
        return mres;


    }

    public static void subsR(String s, String ans){
        if(s.length()==0){
            System.out.println(ans);
            return;
        }

        Character c = s.charAt(0);
        String ros = s.substring(1);
        subsR(ros,ans+"");
        subsR(ros,ans+c);

    }

    public static void main(String[] args) {
        String s = "abc";
        System.out.println(subs(s));
        subsR(s,"");
    }

}

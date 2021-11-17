package recursion;

public class permutationOfSubsequence {

    public static void printPermutation(String s , String asf){
            if(s.length()==0){
                System.out.println(asf);
                return ;
            }

            for(int i =0; i< s.length();i++){
                Character c = s.charAt(i);
                String left = s.substring(0,i);
                String right = s.substring(i+1);
                String res= left+right;
                printPermutation(res,asf+c);
            }

    }

    public static void main(String[] args) {
        String s ="123";
        printPermutation(s,"");
    }
}

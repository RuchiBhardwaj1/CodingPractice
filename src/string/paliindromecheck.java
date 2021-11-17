package string;

class Program {
    public static boolean isPalindrome(String str) {
        // Write your code here.

        int i = 0;
        int j=str.length()-1;

        while(i<j){
            if(str.charAt(i)!=str.charAt(j)){
                return false;
            }
            i+=1;
            j-=1;
        }
        return true;

    }

    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
       String word = String.join("",word1);
       String wordq = String.join("",word2);

        if(word.equals(wordq)){
            return true;
        }
        return false;

    }

    public static String longestPalindrome(String s) {

        int start = 0;
        int end =0;

        for(int i =0; i< s.length(); i++){
            int l1 = middle(s,i,i);
            int l2 = middle(s,i,i+1);
            int len = Math.max(l1,l2);
            if(len > end-start){
                start = i- ((len-1)/2);
                end = i+ (len/2);
            }
        }
        return s.substring(start,end+1);

    }

    public static int middle(String s, int left , int right){
        if(s==null || left > right) return 0;
        while(left >=0 && right < s.length() && s.charAt(left) == s.charAt(right)){

            left--;
            right++;

        }
        return right -left -1;
    }

    public static void main(String[] args){
        String s = "abcdcba";
        isPalindrome(s);

        char c = 'a';
        int k = 2;
        int z = k%26;
        System.out.println(z);
        int l = z+k;
        System.out.println(l);
        String[] word1 = {"ab", "c"};
        String[] word2 = {"a", "bc"};
        System.out.println(arrayStringsAreEqual(word1,word2));

        System.out.println("------------");
        String s1 = "babad";
        System.out.println(longestPalindrome(s1));


    }
}


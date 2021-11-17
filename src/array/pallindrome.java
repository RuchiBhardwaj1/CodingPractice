package array;

public class pallindrome {

    public static boolean isPalindrome(int x) {
//        String s = Integer.toString(x);
//
//        StringBuilder sb = new StringBuilder(s);
//        sb.reverse();
//        String rev = sb.toString();
//
//        if(s.equals(rev)){
//            return true;
//        }
//        else{
//            return false;
//        }

        int num =0;
        int temp =x;

        while(x>0){
            num = num*10 +(x%10);
            x= x/10;
        }

        if(temp == num){
            return true;
        }
        else {
            return false;
        }

    }

    public static void main(String[] args) {
        int x = 121;
        System.out.println(isPalindrome(x));
    }
}

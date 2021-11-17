package test;

public class friday25 {
    public boolean isPalindrome(int x) {
        int num = 0,temp = x;
        while(x>0){
            num = num*10 + x%10;
            x = x/10;
        }
        if(temp == num){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        friday25 f = new friday25();
        f.isPalindrome(121);
    }
}

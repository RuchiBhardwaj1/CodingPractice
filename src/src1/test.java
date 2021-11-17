package src1;

import java.util.Arrays;
import java.util.Locale;

public class test {
    public static void isAnagram(String s1 , String s2){
        boolean status = true;
        if(s1.length()!= s2.length()){
            status = false;
        }
        else{
            char[] Arrays1 = s1.toLowerCase().toCharArray();
            char[] Arrays2 = s2.toLowerCase().toCharArray();
            Arrays.sort(Arrays1);
            Arrays.sort(Arrays2);
            status = Arrays.equals(Arrays1,Arrays2);
        }
        if(status){
            System.out.println("they are anagram"  + s1 +"and"+ s2);

        }
        else{
            System.out.println("they are not anagram"+ s1 +"and"+s2);
        }
    }

    public static void main(String[] args){
        String s1 = "dog";
        String s2 = "odg";
        isAnagram(s1,s2);
    }
}

package test;

//public class testString {
//}

import java.util.Locale;
import java.util.Scanner;

class LongestWord {
    final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";
    final String ALPHABET_UPPER = ALPHABET.toUpperCase();

    public  String LongestWord(String s){
        String[] words = s.split("\\s");
        String longestWord = null;
        int longestWordLength =0;

        for(String word:words){
            int wordLength = getWordLength(word);
            if(longestWord == null || wordLength>longestWordLength){
                longestWord = word;
                longestWordLength = wordLength;
            }
        }
        return longestWord;
    }

    public int getWordLength(String s){
        int length = 0;

        for( char c: s.toCharArray()){
            if(ALPHABET.indexOf(c)>-1 || ALPHABET_UPPER.indexOf(c)>-1){
                length++;
            }
        }
        return length;
    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        LongestWord c = new LongestWord();
        System.out.print(c.LongestWord(s.nextLine()));
    }
}
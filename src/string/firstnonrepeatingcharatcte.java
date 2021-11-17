package string;

import java.util.HashMap;

public class firstnonrepeatingcharatcte {

    public static int first(String s) {

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i <s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        for(int j = 0; j< s.length(); j++){
            if (map.get(s.charAt(j)) == 1) {
                System.out.println(j);
                return j;

            }
        }
        System.out.println(map);
        return  0;
    }

    public  static void main(String[] args){
        String s = "abca";
        first(s);
    }

}

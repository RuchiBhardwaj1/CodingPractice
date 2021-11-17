package string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class groupanagram {

    public static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        HashMap<String , List<String>> map = new HashMap<>();

        for(String current : strs){
            char[] character = current.toCharArray();
            Arrays.sort(character);
            String sorted = new String(character);
            if(!map.containsKey(sorted)){
                map.put(sorted, new ArrayList());
            }
            map.get(sorted).add(current);
        }
        result.addAll(map.values());
        return result;
    }



    public static void main(String[] args){
        String[] s = new String[]{"abc", "cba", "bca", "ghy"};
        String y = "Hello";
        System.out.println(y.toLowerCase());
        groupAnagrams(s);

    }
}

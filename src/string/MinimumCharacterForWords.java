package string;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class MinimumCharacterForWords {

    public static void minimumCharacterForWords(String[] words){
        HashMap<Character,Integer> map = new HashMap<>();

        for(String word: words){
            for(char Character:word.toCharArray()){
                map.put(Character,map.getOrDefault(Character,0)+1);
            }
        }

//        Set<Character> keySet = map.keySet();
        ArrayList<Character> listOfKeys
                = map.keySet().stream().collect(
                Collectors.toCollection(ArrayList::new));



//        System.out.println(objects);


//
        char[] characterArray = new char[listOfKeys.size()];
        for(int i =0 ; i<listOfKeys.size(); i++){
            characterArray[i] = listOfKeys.get(i);
        }
        System.out.println(characterArray);


    }

    public char[] minimumCharactersForWords1(String[] words) {
        // Write your code here.
        HashMap<Character , Integer> maximumCharacterFrequencies = new HashMap<Character,Integer>();

        for(String word: words){
            HashMap<Character,Integer> characterFrequencies = countCharacterFrequencies(word);
            updateMaximumFrequencies(characterFrequencies,maximumCharacterFrequencies);
        }

        return makeArrayFromCharcaterFrequencies(maximumCharacterFrequencies);
    }

    public HashMap<Character,Integer> countCharacterFrequencies(String string){
        HashMap<Character,Integer> characterFrequencies = new HashMap<Character,Integer>();

        for(char character: string.toCharArray()){
            characterFrequencies.put(character,characterFrequencies.getOrDefault(character,0)+1);
        }

        return characterFrequencies;
    }

    public void updateMaximumFrequencies(HashMap<Character,Integer> frequencies, HashMap<Character,Integer> maximumFrequencies){
        for(Map.Entry<Character,Integer> frequency : frequencies.entrySet()){
            char character = frequency.getKey();
            int characterFrequency = frequency.getValue();

            if(maximumFrequencies.containsKey(character)){
                maximumFrequencies.put(character,Math.max(characterFrequency , maximumFrequencies.get(character)));
            }else{
                maximumFrequencies.put(character,characterFrequency);
            }
        }
    }


    public char[] makeArrayFromCharcaterFrequencies(HashMap<Character,Integer> characterFrequencies){
        ArrayList<Character> characters = new ArrayList<Character>();

        for(Map.Entry<Character,Integer> frequency : characterFrequencies.entrySet()){
            char character = frequency.getKey();
            int characterFrequency = frequency.getValue();

            for(int i = 0; i<characterFrequency ; i++){
                characters.add(character);
            }
        }

        char[] charactersArray = new char[characters.size()];
        for(int idx = 0; idx< characters.size(); idx++){
            charactersArray[idx] = characters.get(idx);
        }


        return charactersArray;
    }

    public static void main(String[] args) {
        String[] words = {"this", "that","or","yes"};
//        minimumCharacterForWords(words);
        MinimumCharacterForWords wo = new MinimumCharacterForWords();
        System.out.println(wo.minimumCharactersForWords1(words));



    }
}

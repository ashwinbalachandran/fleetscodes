package src.tests;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindFirstRepeatedWord {
    public static void main(String[] args) {
    String f = "This        is a repeated is a";
        System.out.println(firstRepeatedWord(f));
    }
    public static String firstRepeatedWord(String s){
        Set<String> words = new HashSet<>();
        String []wordList = s.split("[\\s\\t\\.\\,\\:\\;\\-]+");
        for(String word:wordList){
            if(!words.contains(word))
                words.add(word);
            else
                return word;
        }
        return "";
    }
}

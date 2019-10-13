package src.tests;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class FrequentlyUsedWords {
    public static void main(String[] args) {
        String one = "romeo romeo wherefore art thou";
//        String one = "a a b b c c c";
        String two = "rose is a flower rose is pond a flower rose flower in garden garden garden pond pond rose";
        List<String> banner = new ArrayList<>();
        banner.add("art");
        banner.add("thou");
        System.out.println(retrieveMostFrequentWords(one,banner).toString());
        banner.clear();
        banner.add("rose");
        banner.add("is");
        banner.add("a");
        System.out.println(retrieveMostFrequentWords(two,banner).toString());

    }

    public static List<String> retrieveMostFrequentWords(String literatureText, List<String> wordsToExclude) {
        String[] words = literatureText.toLowerCase().split("[ !?',;.]+");
        HashMap<String, Integer> map = new HashMap<>();
        for (String word : words) map.put(word, map.getOrDefault(word, 0) + 1);
        for (String word : wordsToExclude) if (map.containsKey(word)) map.remove(word);

        if(map.size()<1)
            return new ArrayList<String>();

        String res = null;
        List<String> result = new ArrayList<String>();
        for (String word : map.keySet())
            if (res == null || map.get(word) > map.get(res)) {
                result = new ArrayList<String>();
                result.add(word);
                res = word;
            }
        else if(map.get(word) == map.get(res)){
                result.add(word);
            }
        Collections.sort(result);
        return result;
    }
}

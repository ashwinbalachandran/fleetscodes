package src.tests;

import java.util.*;

public class FrequentlyUsedWords_2 {
    public static void main(String[] args) {
        String one = "romeo wherefore art thou";
//        String one = "a a b b c c c";
        String two = "rose is a flower rose is pond a flower rose flower in garden garden garden pond pond rose";
        List<String> banner = new ArrayList<>();
        banner.add("art");
        banner.add("thou");
        System.out.println(retrieveMostFrequentWords(one, banner).toString());
        banner.clear();
        banner.add("rose");
        banner.add("is");
        banner.add("a");
        System.out.println(retrieveMostFrequentWords(two, banner).toString());

    }

    public static List<String> retrieveMostFrequentWords(String literatureText, List<String> wordsToExclude) {
        Set wordsToExcludeSet = new HashSet<>(wordsToExclude);
        List<String> result = new ArrayList<>();
        String lit[] = literatureText.split(" ");
        Map<String, Integer> wordCount = new HashMap<>();
        int max = Integer.MIN_VALUE;
        for (String word : lit) {
            if (wordCount.containsKey(word)) {
                wordCount.put(word, wordCount.get(word) + 1);
                if(max<wordCount.get(word)){
                    result = new ArrayList<String>();
                    result.add(word);
                }
                else if(max == wordCount.get(word)){
                    result.add(word);
                }
            } else {
                if (!wordsToExcludeSet.contains(word)) {
                    wordCount.put(word, 1);
                    if(max==1){
                        result.add(word);
                    }
                }
            }
        }

//        for (String word : wordCount.keySet()) {
//            max = Math.max(max, wordCount.get(word));
//        }
//
//        for (String word : wordCount.keySet()) {
//            if (wordCount.get(word) == max) {
//                result.add(word);
//            }
//        }

        return result;
    }
}

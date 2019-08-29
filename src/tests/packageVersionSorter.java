package tests;

import java.util.*;

public class packageVersionSorter {
    public static void main(String[] args) {
        ArrayList<String> temp = new ArrayList<>();
        temp.add("ykc 82 01");
        temp.add("eo first qpx");
        temp.add("09z cat hamster");
        temp.add("06f 12 25 6");
        temp.add("az0 first qpx");
        temp.add("236 cat dog rabbit snake");
        List<String> answer = orderedJunctionBoxes(6, temp);
/*        for(String x:answer){
            System.out.println(x);
        }*/
    }
    public static List<String> orderedJunctionBoxes(int numberOfBoxes, List<String> boxList){
        List<String> oldGen = new ArrayList<>();
        List<String> newGen = new ArrayList<>();
        List<String> result= new ArrayList<>();
        String chars[];
        for(String str:boxList){
            chars = str.split(" ",2);
            if(Character.isDigit(chars[1].charAt(0))) {
                newGen.add(str);
                continue;
            }
            oldGen.add(chars[1]+"`"+chars[0]);
        }
        Collections.sort(oldGen);
        for(String token:oldGen){
            String news[] = token.split("`");
            result.add(news[1]+" "+news[0]);
        }
        result.addAll(newGen);
        for(String f:result){
            System.out.println(f);
        }
        return result;
    }

}

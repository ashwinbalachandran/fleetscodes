package src.tests;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DupliPair {
    public static void main(String[] args) {
        Set<List<Integer>> testing = new HashSet<>();
        List<Integer> temp = new ArrayList<>();
        temp.add(3);
        temp.add(9);
        testing.add(temp);
        temp = new ArrayList<>();
        temp.add(3);
        temp.add(9);
        System.out.println(testing.contains(temp));
        testing.add(temp);
        System.out.println(testing.size());
    }
}

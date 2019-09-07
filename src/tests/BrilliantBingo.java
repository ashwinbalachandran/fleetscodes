package src.tests;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class BrilliantBingo {
    public static void main(String[] args) {
        Set<Integer> x = new HashSet<Integer>();
        x.add(2);
        List<String> ls = new ArrayList<>();
        modifySet(x);
        System.out.println(x.toString());
    }

    private static void modifySet(Set<Integer> xe) {
        xe.add(1);
    }
}

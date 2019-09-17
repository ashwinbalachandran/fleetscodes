package src.cominginhot;

import java.util.HashMap;

public class Tresting {
    public static void main(String[] args) {
        Integer one = new Integer(2);
        Integer three  = one;
        one = 100;
        System.out.println(three);
        chengethisbitch(one);
    }

    private static void chengethisbitch(Object three) {
        three = new Integer(1);
        System.out.println("Threis"+three);
    }
}

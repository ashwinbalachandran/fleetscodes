package cs261p;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SetIntersection {
    public static void main(String[] args) {
        List<Integer> L = new ArrayList<>();
        List<Integer> R = new ArrayList<>();
        L.add(3);
        L.add(5);
        L.add(1);
        L.add(3);
        L.add(4);
        L.add(4);
        R.add(1);
        R.add(10);
        R.add(2);
        R.add(9);
        R.add(3);
        R.add(5);
        findIntersection(L,R);
    }
    public static void findIntersection(List<Integer> L,List<Integer> R){
        boolean l = true;
        if(L.size()==0 || R.size()==0)
            return;
        if(L.size()<R.size()){
            l = true;
        }
        else{
            l = false;
        }
        HashMap<Integer,Integer> first = new HashMap<>();
        if(l){
            for(int i:L){
                first.put(i,first.getOrDefault(i,0)+1);
            }
            for(int i:R){
                if(first.containsValue(i)){

                }
            }
        }
    }
}

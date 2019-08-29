package cominginhot;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

//Checking for strong hash collision
public class ClassFour {
    public static void main(String[] args) {
        int n = 1;
        int r = (5*n+11)%23 ;
        int collision = 0;
        HashMap<Integer, Integer> collisionMap = new HashMap<Integer, Integer>();
        int ctr = 0;
        for(int i=n+1;i<10000; i++){
            collision = (5*i + 11)%23;
            if(collisionMap.containsKey(collision)){
                collisionMap.put(collision,collisionMap.get(collision)+1);
            }
            else
                collisionMap.put(collision,1);
        }
        for(Integer k: collisionMap.keySet()){
            System.out.println("Hash Value = "+k+"\t Count of occurrence = "+collisionMap.get(k));
        }
    }
}

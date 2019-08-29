package cominginhot;

import java.util.LinkedHashMap;

//Checking for weak hash collision
public class ClassThree {
    public static void main(String[] args) {
        int n = 4;
        LinkedHashMap<String,Integer> lhm = new LinkedHashMap<String, Integer>();
        int r = (5*n+11)%19 ;
        int collision = 0;
        for(int i=n+1;i<10000; i++){
            collision = (5*i + 11)% 19;
            if(collision == r)
                System.out.println(i);
        }
    }
}

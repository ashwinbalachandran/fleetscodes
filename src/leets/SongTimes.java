package leets;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class SongTimes {
    public static void main(String[] args) {
        int t[] = {30,20,150,100,40};
        System.out.println(timePair(t));
    }
    public static int timePair(int[] time){
        int sum = 0;
        int ans = 0;
        for(int i=0;i<time.length;i++)
            for(int j=i+1;j<time.length;j++){
                sum = time[i]+time[j];
                if(sum%60 ==0)
                  ++ans;
            }
        return ans;
    }
}

package src.leets;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> mapone = new HashMap<>();
        int res[] = new int[2];
        for(int i=0;i<nums.length;i++){
            mapone.put(nums[i],i);
        }
        Iterator it = mapone.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry pair = (Map.Entry)it.next();
            if(mapone.containsKey(Math.abs(target-(int)pair.getKey()))){
                res[1]=mapone.get(Math.abs(target-(int)pair.getKey()));
                res[0] = (int)pair.getValue();
            }
        }
        return res;
    }
}
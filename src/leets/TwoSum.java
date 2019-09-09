import java.util.HashMap;
import java.util.Map;

class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> indexSum = new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
            indexSum.put(i,target-nums[i]);
        }
        for(Map.Entry<Integer,Integer> entry: indexSum.entrySet()){
            if()
        }
    }
}
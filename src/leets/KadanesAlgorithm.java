package src.leets;

import java.util.Scanner;

/**
 * 2
 * 5
 * 1 2 3 -2 5
 * 4
 * -1 -2 -3 -4
 * 1
 * 11
 * -2 -4 3 -1 5 6 -7 -2 4 -3 2
 */
public class KadanesAlgorithm {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T>0){
            int N = sc.nextInt();
            Integer[] nums = new Integer[N];
            for(int i=0;i<N;i++){
                nums[i] = sc.nextInt();
            }
            int maxSumSubArr = getMaxSumSubArray(nums);
            System.out.println(maxSumSubArr);
        }
    }

    private static int getMaxSumSubArray(Integer[] nums) {
        int maxSum = 0;
        int s[] = new int[nums.length+1];
        s[0] = 0;
        int ctr = 1;
        for(Integer i:nums){
           s[ctr] = s[ctr-1]+i;
           ctr++;
        }
        for(int i=1;i<nums.length;i++){
            for(int j=i;j<nums.length;j++){
                int sax = s[j]-s[i-1];
            }
        }
        for(int i=1;i<s.length;i++)
        System.out.println(s[i]);
        return maxSum;
    }
}

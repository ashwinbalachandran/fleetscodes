package src.leets;

import java.util.Scanner;

/**
 * 2
 * 5
 * 1 2 3 -2 5
 * 4
 * -1 -2 -3 -4
 */
public class KadanesAlgorithm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T>0){
            int N = sc.nextInt();
            Integer nums[] = new Integer[N];
            for(int i=0;i<N;i++){
                nums[i] = sc.nextInt();
            }
            int maxSumSubArr = getMaxSumSubArray(nums);
            System.out.println(maxSumSubArr);
        }
    }

    private static int getMaxSumSubArray(Integer[] nums) {
        int maxSum = Integer.MIN_VALUE;
        for(Integer i:nums){
            maxSum = Math.max(Math.max(i,maxSum),i+maxSum);
        }
        return maxSum;
    }
}

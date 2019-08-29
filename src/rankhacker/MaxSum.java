package rankhacker;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class MaxSum {

    // Complete the maxSubsetSum function below.
    static int maxSubsetSum(int[] arr) {
        int max = Integer.MIN_VALUE, temp =0;
        for(int i =0;i<arr.length;i++){
            temp = arr[i];
            if(i-2>-1){
                arr[i] = Math.max(Math.max(temp,arr[i-2]),Math.max(temp, temp+arr[i-2]));
            }
            if(i-4>-1){
                arr[i] = Math.max(Math.max(arr[i],arr[i-4]),Math.max(arr[i],arr[i-4]+temp));
                System.out.println("Vaaals"+arr[i-2]+"\t"+arr[i-4]);
            }
            max = Math.max(arr[i],max);
            System.out.println("Current myax:"+max+"\t"+arr[i]);
        }
        return max;
    }
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int num[] = {3,5,-7,8,10};
        System.out.println(maxSubsetSum(num));
        /*BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int res = maxSubsetSum(arr);

        bufferedWriter.write(String.valueOf(res));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();*/
    }
}

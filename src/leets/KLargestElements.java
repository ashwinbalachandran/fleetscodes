package src.leets;

import java.util.*;
import java.lang.*;
import java.io.*;
class KLargestElements
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-->0){
            int N = Integer.parseInt(sc.next());
            int k = Integer.parseInt(sc.next());
            Integer C[] = new Integer[N];
            for(int i=0;i<N;i++){
                C[i] = Integer.parseInt(sc.next());
            }
            printKLargestElements(C,N,k);
        }


    }

    private static void printKLargestElements(Integer[] C, int n, int k) {
        Arrays.sort(C,Collections.reverseOrder());
        for(int i=0;i<k;i++){
            System.out.print(C[i]+" ");
        }
        System.out.println(" ");
    }
}
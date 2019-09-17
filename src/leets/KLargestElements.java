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
        PriorityQueue<Integer> peeq = new PriorityQueue<>();
        List<Integer> answerList = new ArrayList<>();
        int i=0;
        for(;i<k;i++){
            peeq.add(C[i]);
        }
        for(;i<n;i++){
            if(peeq.peek()<C[i]){
                peeq.remove(peeq.poll());
                peeq.add(C[i]);
            }
        }
        for(i=0;i<k;i++){
            answerList.add(peeq.poll());
        }
        Collections.sort(answerList,Collections.reverseOrder());
        for(int num:answerList){
            System.out.print(num+" ");
        }
        System.out.println(" ");
    }
}
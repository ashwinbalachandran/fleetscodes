package src.cominginhot;
import src.datastructures.Heap;
import src.datastructures.Node;

import java.util.List;

public class HeapsofCode {
    public static void main(String[] args) {
        int[] initList = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        Heap h = new Heap(Heap.HeapTypes.MAXHEAP);
        createHeap(h, initList);
        System.out.println(h.peek());
        while(h.peek()!=null) {
            Node ans = h.poll();
            System.out.println("Max value checker:"+ans.value);
        }

    }
    private static void createHeap(Heap h, int[] numList){
        for(int num:numList){
            Node n = new Node(num);
            h.push(n);
        }
    }
}

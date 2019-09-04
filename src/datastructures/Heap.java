package src.datastructures;

import java.util.ArrayList;
import java.util.List;

public class Heap {
    public enum HeapTypes {MAXHEAP, MINHEAP}
    public Node root;
    private HeapTypes heapType;
    private List<Node> heap;

    public Heap(HeapTypes ht) {
        this.heapType = ht;
        heap = new ArrayList<Node>();
    }
    private void swapElements(Integer indexOne, Integer indexTwo){
        Node temp = heap.get(indexOne);
        heap.set(indexOne,heap.get(indexTwo));
        heap.set(indexTwo,temp);
    }
    private void siftUp(Node element) {
        int i = heap.size() - 1;
        do {
            if (heapType.equals(HeapTypes.MAXHEAP) && element.value > heap.get((i - 1) / 2).value) {
                swapElements(i,(i-1)/2);
            }
            else if(heapType.equals(HeapTypes.MINHEAP) && element.value < heap.get((i - 1) / 2).value){
                swapElements(i,(i-1)/2);
            }
            else
                return;
            i= (i-1)/2;
        } while (i>-1);
    }

    private void siftDown() {
        int i = 0;
        do {
            if (heapType.equals(HeapTypes.MAXHEAP)) {
                if(heap.get(i).value < heap.get((2*i)+1).value) {
                    swapElements(i, (2 * i) + 1);
                    i=(2*i)+1;
                }
                else if(heap.get(i).value < heap.get((2*i)+2).value){
                    swapElements(i,(2*i)+2);
                    i=(2*i)+2;
                }
                else
                    return;
            }
            else if(heapType.equals(HeapTypes.MINHEAP) && heap.get(i).value < heap.get((i - 1) / 2).value){
                if(heap.get(i).value > heap.get((2*i)+1).value) {
                    swapElements(i, (2 * i) + 1);
                    i=(2*i)+1;
                }
                else if(heap.get(i).value > heap.get((2*i)+2).value){
                    swapElements(i,(2*i)+2);
                    i=(2*i)+2;
                }
                else
                    return;
            }
            else
                return;
        } while (i<heap.size());

    }

    public void push(Node element) {
        heap.add(element);
        siftUp(element);
    }

    public Node poll() {
        if(heap.size()!=0) {
            Node temp = heap.get(0);
            heap.set(0, heap.get(heap.size() - 1));
            siftDown();
            return temp;
        }
        else
            return null;
    }
}

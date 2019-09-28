package src.datastructures;

import java.util.ArrayList;
import java.util.List;

public class Heap {
    public enum HeapTypes {MAXHEAP, MINHEAP}
    public Node root;
    private HeapTypes heapType;
    private List<Node> heap;

    public Heap(HeapTypes heaptype) {
        this.heapType = heaptype;
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
        int leftChild = Integer.MIN_VALUE;
        int rightChild = Integer.MIN_VALUE;
        while (true) {
            if(((2*i)+1)<heap.size()){
                leftChild = heap.get((2*i)+1).value;
                if(((2*i)+2)<heap.size()){
                    rightChild = heap.get((2*i)+2).value;
                }
                else
                    rightChild = Integer.MIN_VALUE;
            }
            else
                return;
            if (heapType.equals(HeapTypes.MAXHEAP)) {
                if(rightChild>leftChild && heap.get(i).value<rightChild){
                    swapElements(i,(2*i)+2);
                    i=(2*i)+2;
                }
                else if(heap.get(i).value<leftChild){
                    swapElements(i,(2*i)+1);
                    i=(2*i)+1;
                }
                else
                    return;
            }
            else if (heapType.equals(HeapTypes.MINHEAP)) {
                if(rightChild!=Integer.MIN_VALUE && rightChild<leftChild && heap.get(i).value>rightChild){
                    swapElements(i,(2*i)+2);
                    i=(2*i)+2;
                }
                else if(heap.get(i).value>leftChild){
                    swapElements(i,(2*i)+1);
                    i=(2*i)+1;
                }
                else
                    return;
            }
        }

    }

    public void push(Node element) {
        heap.add(element);
        siftUp(element);
    }

    public Node poll() {
        if(heap.size()!=0) {
            Node temp = heap.get(0);
            heap.set(0, heap.get(heap.size() - 1));
            heap.remove(heap.size()-1);
            siftDown();
            return temp;
        }
        else
            return null;
    }
    public Node peek(){
        if(heap.size()!=0){
            return heap.get(0);
        }
        else
            return null;
    }
}

package src.datastructures;

public class Heap {
    public enum HeapTypes {MAXHEAP,MINHEAP};
    public Node root;
    public HeapTypes heapType;
    public Heap(HeapTypes ht){
        this.heapType = ht;
    }
    private void siftUp(){

    }
    private void siftDown(){}
    public void push(Object element){}
    public Object poll(){
        return null;
    }
}

package src.datastructures;

public class Node {
    public Node left;
    public Node right;
    public Object value;
    public Node(Object value){
        this.value = value;
        this.left = null;
        this.right = null;
    }
}

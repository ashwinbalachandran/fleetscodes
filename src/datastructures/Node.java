package src.datastructures;

public class Node {
    public Integer value;
    public Node(Integer value){
        this.value = value;
        Node left = null;
        Node right = null;
    }

    public Integer getValue() {
        return value;
    }
}

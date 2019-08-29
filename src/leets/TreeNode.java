package leets;

public class TreeNode {
    int value;
    TreeNode left;
    TreeNode right;

    public TreeNode() {
    }

    TreeNode(int v){
        value = v;
        left = null;
        right = null;
    }
    TreeNode createTree(int n){
        TreeNode root = new TreeNode(n--);
        TreeNode t = root;
        while(n>0) {
            t.left = new TreeNode(n--);
            t.right = new TreeNode(n--);
            //t = n%2==0?t.left:t.right;
            t = t.left;
        }
        return root;
    }
    void printTree(TreeNode t){
        if(t == null) {
            return;
        }
        System.out.print(t.value+" ");
        printTree(t.left);
        printTree(t.right);
    }
}

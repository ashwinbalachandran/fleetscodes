package leets;

import java.sql.SQLOutput;
import java.util.Scanner;

public class LowestCommonAncestor {
    public static void main(String[] args) {
        TreeNode tn = new TreeNode();
        tn = tn.createTree(9);
        tn.printTree(tn);
        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.println("Enter first element");
        a = sc.nextInt();
        System.out.println("Enter second element");
        b = sc.nextInt();
        int answer = new LowestCommonAncestor().getLCA(tn, a, b);
        System.out.println("Ye mila answer:" + answer);
    }

    int getLCA(TreeNode root, int a, int b) {
        return getAncestor(root, a, b, root.value, 0, false, false);
    }

    int getAncestor(TreeNode node, int a, int b, int curParent, int ans, boolean l, boolean r) {
        if (node == null)
            return ans;
        if (l && r) {
            return ans;
        } else if (l) {
            if (node.value == b) {
                r = true;
            }
        } else if (r) {
            if (node.value == a) {
                l = true;
            }
        } else {
            if (node.value == a) {
                l = true;
                ans = curParent;
            } else if (node.value == b) {
                r = true;
                ans = curParent;
            }
        }
        getAncestor(node.left, a, b, node.value, ans, l, r);
        getAncestor(node.right, a, b, node.value, ans, l, r);
        return ans;
    }
}

package src.leets;


import java.util.*;
import java.lang.*;
class ListNode
{
    int data;
    ListNode next;
    ListNode(int key)
    {
        data = key;
        next = null;
    }
}
class ReverseInSize
{
    static ListNode head;

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0)
        {
            int n = sc.nextInt();
            int a1 = sc.nextInt();
            ListNode head = new ListNode(a1);
            addToTheLast(head);
            for(int i = 1; i < n; i++)
            {
                int a = sc.nextInt();
                addToTheLast(new ListNode(a));
            }

            int k = sc.nextInt();
            GfG gfg = new GfG();
            ListNode res = gfg.reverse(head, k);
            printList(res);
            System.out.println();
        }
    }

    public static void addToTheLast(ListNode node)
    {
        if(head == null)
        {
            head = node;
        }
        else
        {
            ListNode temp = head;
            while(temp.next != null)
                temp = temp.next;
            temp.next = node;
        }
    }

    public static void printList(ListNode node)
    {
        while(node != null)
        {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }

}

/*This is a function problem.You only need to complete the function given below*/
/*node class of the linked list
class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}
*/
class GfG
{
    public static ListNode reverse(ListNode node, int k)
    {
        if(null==node.next)
            return node;
        boolean cnt = false;
        int kcount = 0;
        ListNode head = node;
        ListNode curr = node, prev = null, nxt = null;
        while(kcount<k && curr!=null){
            kcount++;
            nxt = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nxt;
        }
        if(nxt!=null){
            head.next = reverse(nxt,k);
        }
        return prev;

    }
}
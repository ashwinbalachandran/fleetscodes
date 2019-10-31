package src.tests;


public class LinkedListRemoval {
    public ListNode removeElements(ListNode listhead, int val) {
        ListNode temp = new ListNode(0);
        temp.next = listhead;
        ListNode cur = temp;

        while(cur.next != null) {
            if(cur.next.val == val) {
                cur.next = cur.next.next;
            }
            else
                cur = cur.next;
        }
        return temp.next;
    }
    public class ListNode{
        int val;
        ListNode next;
        ListNode(int x){
            val = x;
        }
    }
}

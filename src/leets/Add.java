package src.leets;

import java.util.*;
 class Add_LinkedList {
    ListNode head;
    void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        // System.out.println("");
    }
    public void push(int new_data) {
        /* 1 & 2: Allocate the Node &
                  Put in the data*/
        ListNode new_node = new ListNode(new_data);
        /* 3. Make next of new Node as head */
        new_node.next = head;
        /* 4. Move the head to point to new Node */
        head = new_node;
    }
    public static void main(String[] args) {
        Object xfuck = null;
        Object motherfuck = xfuck;
        xfuck = new Integer(10);
        System.out.println(motherfuck);

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int n1 = sc.nextInt();
            Add_LinkedList list1 = new Add_LinkedList();
            for (int i = 1; i <= n1; i++) {
                int a = sc.nextInt();
                list1.push(a);
            }
            int n2 = sc.nextInt();
            Add_LinkedList list2 = new Add_LinkedList();
            for (int i = 0; i < n2; i++) {
                int b = sc.nextInt();
                list2.push(b);
            }
            Add_LinkedList list3 = new Add_LinkedList();
            Add g = new Add();
            ListNode rs = g.addTwoLists(list1.head, list2.head);
            list3.printList(rs);
            System.out.println();
            T--;
        }
    }
}
/*This is a function problem.You only need to complete the function given below*/
/*The Node is defined as
class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
        Node(){}
    }
*/
class Add {

    // This function will add the numbers represented by two linked lists
    ListNode addTwoLists(ListNode first, ListNode second) {
        ListNode ans = null;
        ListNode curr = ans;
        int start = 0;
        if(first==null)
            return second;
        else if (second == null)
            return first;
        ListNode num1 = first;
        ListNode num2 = second;
        int carry = 0;
        int rem = 0;
        int ansDigit = 0;
        while(num1!=null && num2 != null){
            int sum = carry+num1.data+num2.data;
            if(sum>10){
                ansDigit = sum%10;
                carry = ansDigit/10;
                if(start!=0){
                    ans.next = new ListNode(ansDigit);
                    ans = ans.next;
                }
                else{

                    ans = new ListNode(ansDigit);
                    ans.next = null;
                    start++;
                }
            }
            else{
                carry = 0;
            }
            num1 = num1.next;
            num2 = num2.next;
        }
        if(null==num1 && null!=num2){
            ans.next = new ListNode(num2.data+carry);
            carry = 0;
            num2= num2.next;
            ans = ans.next;
        }
        if(null==num2 && null!=num1){
            ans.next = new ListNode(num1.data+carry);
            carry = 0;
            num1= num1.next;
            ans = ans.next;
        }
        ans.next = null;
        System.out.println(curr.data);
        return curr;
    }
}
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
import java.util.ArrayList;
class Remove_Linked_List_Elements {
    public static void main(String args[]){
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(6);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next.next = new ListNode(6);
        ListNode dummy = removeElements(head,6);
        while(dummy!=null){
            System.out.print(dummy.val+" ");
            dummy = dummy.next;
        }
    }
    public static ListNode removeElements(ListNode head, int val) {
        ListNode curr = head;
        ArrayList<Integer> list = new ArrayList<Integer>();
        while(curr!=null){
            if(curr.val!=val){
                list.add(curr.val);
            }
            curr = curr.next;
        }
       ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        for(int n: list){
            current.next = new ListNode(n);
            current = current.next;
        }
        return dummy.next;
    }
}
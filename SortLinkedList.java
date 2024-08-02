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
import java.util.Collections;
class SortLinkedList {
    public static void main(String args[]){
        ListNode head = new ListNode(4);
        head.next = new ListNode(2);
        head.next.next = new ListNode(1);
        head.next.next.next = new ListNode(3);
        head = sortList(head);
        while(head!=null){
            System.out.print(head.val+" ");
            head = head.next;
        }
    }
    public static ListNode sortList(ListNode head) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        while(head != null){
            list.add(head.val);
            head = head.next;
        }
        Collections.sort(list);
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        for(int n: list){
            curr.next = new ListNode(n);
            curr = curr.next;
        }
        return dummy.next;
    }
}
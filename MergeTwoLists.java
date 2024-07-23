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
class MergeTwoLists {
    public static void main(String args[]){
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(4);
        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(3);
        head.next.next = new ListNode(4);
        ListNode dummy = mergeTwoLists(head,head1);
        while(dummy!=null){
            System.out.print(dummy.val+" ");
            dummy = dummy.next;
        }
    }
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
      ArrayList<Integer> list = new ArrayList<Integer>();
    while(list1!=null){
        list.add(list1.val);
        list1 = list1.next;
    }
        while(list2!=null){
        list.add(list2.val);
        list2 = list2.next;
    }
        Collections.sort(list);
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        for(int n: list){
            current.next = new ListNode(n);
            current = current.next;
        }
        return dummy.next;
    }
}
class ListNode {
        int val;
         ListNode next;
         ListNode() {}
         ListNode(int val) { this.val = val; }
         ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     }
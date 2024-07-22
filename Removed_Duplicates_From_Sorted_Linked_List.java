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
import java.util.*;
class Removed_Duplicates_From_Sorted_Linked_List {
    public static void main(String args[]){
        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        ListNode dummy = deleteDuplicates(head);
        while(dummy!=null){
            System.out.print(dummy.val+" ");
            dummy = dummy.next;
        }
    }
    public static ListNode deleteDuplicates(ListNode head) {
        HashSet<Integer> set = new HashSet<Integer>();
        ListNode curr = head;
        while(curr!=null){
            set.add(curr.val);
            curr = curr.next;
        }
        ArrayList<Integer> list = new ArrayList<Integer>(set);
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
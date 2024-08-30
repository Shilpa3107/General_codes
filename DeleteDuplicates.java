import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;


class DeleteDuplicates{
    public static void main(String args[]){
        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(2);
        ListNode curr = deleteDuplicates(head);
        while(curr != null){
            System.out.print(curr.val+" ");
            curr = curr.next;
        }
    }
    public static ListNode deleteDuplicates(ListNode head) {
      HashSet<Integer> set = new HashSet<Integer>();
        ListNode curr = head;
        while(curr != null){
            set.add(curr.val);
            curr = curr.next;
        }
        ArrayList<Integer> list = new ArrayList<>(set);
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
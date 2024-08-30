import java.util.ArrayList;
import java.util.Collections;
 class ListNode {
     int val;
     ListNode next;
    ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
class MergeTwoLists1 {
    public static void main(String args[]){
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(4);
        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(3);
        list2.next.next = new ListNode(4);
        ListNode node = mergeTwoLists(list1,list2);
        while(node != null)
        {
            System.out.print(node.val+" ");
            node = node.next;
        }
    }
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
      ArrayList<Integer> list = new ArrayList<Integer>();
        while(list1 != null){
            list.add(list1.val);
            list1 = list1.next;
        }
        while(list2 != null){
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
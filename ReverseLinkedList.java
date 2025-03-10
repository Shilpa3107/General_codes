import java.util.List;
import java.util.ArrayList;
public class ReverseLinkedList{
    public static void main(String args[]){
       ListNode head = new ListNode(1);
       head.next = new ListNode(2);
       head.next.next = new ListNode(3);
       head.next.next.next = new ListNode(4);
       head.next.next.next.next = new ListNode(5);
       ListNode result = reverseLinkedList(head);
       while(result != null){
        System.out.print(result.val+" ");
        result = result.next;
       }
    }
    public static ListNode reverseLinkedList(ListNode head){
        List<Integer> list = new ArrayList<>();
        while(head != null){
            list.add(head.val);
            head = head.next;
        }
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        for(int i = list.size()-1;i>=0;i--){
            current.next = new ListNode(list.get(i));
            current = current.next;
        }
        return dummy.next;
    }
}
class ListNode{
    int val;
    ListNode next;
    ListNode(int val){
        this.val = val;
        this.next = null;
    }
    ListNode(int val, ListNode next){
        this.val = val;
        this.next = next;
    }
}
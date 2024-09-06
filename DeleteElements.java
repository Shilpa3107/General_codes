import java.util.HashSet;
import java.util.Set;
// class ListNode {
//     int val;
//     ListNode next;
//     ListNode() {}
//     ListNode(int val) { this.val = val; }
//     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
// }
public class DeleteElements{
    public static void main(String args[]){
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        int nums[] = {1,2,3};
        ListNode curr = check(head,nums);
        while(curr != null){
            System.out.print(curr.val+" ");
            curr = curr.next;
        }
    }
    public static ListNode check(ListNode head, int nums[]){
        Set<Integer> numSet = new HashSet<Integer>();
        for(int n : nums)
           numSet.add(n);
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        while(head != null){
            if(!numSet.contains(head.val)){
                curr.next = new ListNode(head.val);
                curr = curr.next;
            }
            head = head.next;
        }
       return dummy.next;   
    }
}
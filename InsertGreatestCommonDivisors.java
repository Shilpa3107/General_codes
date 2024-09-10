/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
import java.util.ArrayList;
class ListNode {
         int val;
         ListNode next;
         ListNode() {}
         ListNode(int val) { this.val = val; }
         ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     }
class InsertGreatestCommonDivisors {
    public static void main(String args[]){
        ListNode head = new ListNode(18);
        head.next = new ListNode(6);
        head.next.next = new ListNode(10);
        head.next.next.next = new ListNode(3);
        ListNode current = insertGreatestCommonDivisors(head);
        while(current != null){
            System.out.print(current.val+" ");
            current = current.next;
        }
    }
    public static ListNode insertGreatestCommonDivisors(ListNode head) {
        if(head == null || head.next == null)
            return head;
        ArrayList<Integer> list = new ArrayList<Integer>();
        check(head,list);
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        for(int n: list){
            curr.next = new ListNode(n);
            curr = curr.next;
        }
        return dummy.next;
            
    }
    public static void check(ListNode head, ArrayList<Integer> list){
        while(head != null && head.next != null){
            int a = head.val;
            int b = head.next.val;
            list.add(a);
            list.add(gcd(a,b));
            head = head.next;
        }
        list.add(head.val);
    }
    public static int gcd(int a, int b){
        if(b == 0)
            return a;
        return gcd(b,a%b);
    }
}
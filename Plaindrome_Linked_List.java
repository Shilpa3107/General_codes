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
class Plaindrome_Linked_List {
    public static void main(String args[]){
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(1);
        System.out.println(isPalindrome(head));
    }
    public static boolean isPalindrome(ListNode head) {
        String s="";
        while(head!=null){
            s = s+Integer.toString(head.val);
            head = head.next;
        }
        StringBuilder sb =new StringBuilder(s);
        sb.reverse();
        if((sb.toString()).equals(s))
            return true;
        else 
            return false;
    }
}
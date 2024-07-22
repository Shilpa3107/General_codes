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
class Binary_Number_In_A_LinkedList {
    public static void main(String args[]){
        ListNode head = new ListNode(1);
        head.next = new ListNode(0);
        head.next.next = new ListNode(1);
        System.out.println(getDecimalValue(head));
    }
    public static int getDecimalValue(ListNode head) {
        String s = "";
        ListNode curr = head;
        while(curr!=null){
            s = s+Integer.toString(curr.val);
            curr = curr.next;
        }
        int num = 0;
        int len = 0;
        for(int i = s.length()-1;i>=0;i--){
            num = num+Integer.parseInt(s.charAt(i)+"")*(int)Math.pow(2,len);
            len++;
        }
        return num;
    }
}
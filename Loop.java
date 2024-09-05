public class Loop{
    public static void main(String args[]){
        ListNode list = new ListNode(3);
        list.next = new ListNode(2);
        list.next.next = new ListNode(0);
        list.next.next.next = new ListNode(-4);
        int pos = 1;
        System.out.println(check(list,pos));

    }
    public static boolean check(ListNode head, int pos){
        ListNode fast = head;
        ListNode slow = head;
         while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(slow == fast)
            return true;
         }
         return false;
    }
}
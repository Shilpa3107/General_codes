public class LinkedListCycle{
    public static void main(String args[]){
        ListNode head = new ListNode(3);
        head.next = new ListNode(2);
        head.next.next = new ListNode(0);
        head.next.next.next = new ListNode(-4);
        head.next = head;
        System.out.println(linkedListCycle(head));
    }
    public static boolean linkedListCycle(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast)
              return true;
        }
        return false;
    }
}
class ListNode{
    int data;
    ListNode next;
    ListNode(int data){
        this.data = data;
        next = null;
    }
    ListNode(int data, ListNode next){
        this.data = data;
        this.next = next;
    }
}
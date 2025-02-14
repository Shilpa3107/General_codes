public class ListNodeCycle{
    public static void main(String args[]){
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next = head;
        System.out.println(listNodeCycle(head));
    }
    public static boolean listNodeCycle(ListNode head){
        //create two pointers (slow and fast)
        ListNode slow = head;
        ListNode fast = head;

        //traverse the slow and fast 
        while(fast != null && fast.next != null){
              
            //moves by 1 step
            slow = slow.next;

            //moves by 2 steps
            fast = fast.next.next;

            //if their values matches it means it is a cycle
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
        this.next = null;
    }
}
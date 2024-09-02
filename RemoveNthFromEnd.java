import java.util.ArrayList;
class RemoveNthFromEnd {
    public static void main(String args[]){
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        int n = 2;
        ListNode curr = removeNthFromEnd(head,n);
        while(curr!= null)
        {
            System.out.print(curr.val+" ");
            curr = curr.next;
        }
    }
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        while(head != null){
            list.add(head.val);
            head = head.next;
        }
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        for(int i = 0;i<list.size();i++){
            if(i != list.size()-n){
                curr.next = new ListNode(list.get(i));
                curr = curr.next;
            }
        }
        return dummy.next;
    }
}
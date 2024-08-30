import java.util.ArrayList;
class ReverseList {
    public static void main(String args[]){
        ListNode list = new ListNode(1);
        list.next = new ListNode(2);
        list.next.next = new ListNode(3);
        list.next.next.next = new ListNode(4);
        list.next.next.next.next = new ListNode(5);
        ListNode current = reverseList(list);
        while(current != null){
            System.out.print(current.val+" ");
            current = current.next;
        }
    }
    public static ListNode reverseList(ListNode head) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        while(head != null){
            list.add(head.val);
            head = head.next;
        }
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        for(int i = list.size()-1;i>=0;i--){
            curr.next = new ListNode(list.get(i));
            curr = curr.next;
        }
        return dummy.next;
    }
}
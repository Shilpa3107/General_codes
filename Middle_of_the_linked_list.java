import java.util.ArrayList;
class Middle_of_the_linked_list {
    public static void main(String args[]){
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);
        ListNode current = middleNode(head);
        while(current!=null){
            System.out.print(current.val+" ");
            current = current.next;
        }
    }
    public static ListNode middleNode(ListNode head) {
       int mid = 0;
        if(getLength(head)%2!=0){
            mid = (int)getLength(head)/2;
        }
        else{
            mid = (int)getLength(head)/2;
        }
        ArrayList<Integer> list = new ArrayList<Integer>();
        ListNode curr = head;
        int k = -1;
        while(curr!= null){
            k++;
            if(k >= mid)
              list.add(curr.val);
            curr = curr.next;
        }
        //System.out.println(list);
        ListNode dummy = new ListNode();
        ListNode current = dummy;
        for(int n: list){
            current.next = new ListNode(n);
            current = current.next;
        }
        return dummy.next;
    }
    public static int getLength(ListNode head){
        int len = 0;
        ListNode curr = head;
        while(curr!=null){
            len++;
            curr = curr.next;
        }
        return len;
    }
    
}

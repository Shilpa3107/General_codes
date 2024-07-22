public class Sort_A_Linked_List{
    public static void main(String args[]){
        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(0);
        head.next.next.next.next = new ListNode(2);
        head.next.next.next.next.next = new ListNode(0);
        head.next.next.next.next.next.next = new ListNode(1);
        ListNode dummy = check(head);
        while(dummy!=null){
            System.out.print(dummy.val+" ");
            dummy = dummy.next;
        }
    }
    public static ListNode check(ListNode head){
        int len = getLength(head);
        int count[] = new int[3];
        int arr[] = new int[len];
        ListNode curr = head;
        int k = 0;
        while(curr!=null){
            arr[k] = curr.val;
            curr = curr.next;
            k++;
        }
        for(int i = 0;i<len;i++){
            ++count[arr[i]];
        }
        for(int i = 1;i<3;i++){
            count[i] = count[i]+count[i-1];
        }
        int b[] = new int[len];
        for(int i = len-1;i>=0;i--){
          b[--count[arr[i]]] = arr[i];
        }
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        for(int i = 0;i<len;i++){
            current.next = new ListNode(b[i]);
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
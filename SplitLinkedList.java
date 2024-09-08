public class SplitLinkedList{
    public static void main(String args[]){
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        int k = 5;
        ListNode list[] = check(head,k);
        for(int i = 0;i<k;i++){
            System.out.print(list[i].val+" ");
        }
    }
    public static ListNode[] check(ListNode head, int k){
        ListNode ans[] = new ListNode[k];
        int size = 0;
        ListNode current = head;
        while(head != null){
            size++;
            head = head.next;
        }
        int splitSize = size/k;
        int remainingSize = size%k;
        for(int i = 0;i<k;i++){
            ListNode partList = new ListNode(0);
            ListNode tail = partList;
            int currentSize = splitSize;
            while(remainingSize > 0){
                remainingSize--;
                currentSize++;
            }
            int j = 0;
            while(j< currentSize){
                tail.next = new ListNode(current.val);
                tail = tail.next;
                j++;
            }
            ans[i] = partList.next; 
        }
        return ans;
    }
}
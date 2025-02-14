import java.util.ArrayList;
public class ReverseLinkedList2{
    public static void main(String args[]){
       ListNode head = new ListNode(1);
       head.next = new ListNode(2);
       head.next.next = new ListNode(3);
       head.next.next.next = new ListNode(4);
       head.next.next.next.next = new ListNode(5);
       ListNode result = reverseLinkedList2(head,2,4);
       while(result!= null){
        System.out.print(result.val+" ");
        result = result.next;
       }
    }
    public static ListNode reverseLinkedList2(ListNode head, int left, int right){
       //created an arraylist to store elements
       ArrayList<Integer> list = new ArrayList<>();

       //traverse the listnode to store elements in arraylist
       while(head != null){
        list.add(head.val);
        head = head.next;
       }

       //use two pointer to reverse the elements
       int i = left-1, j = right-1;
       while(i < j){
        int temp = list.get(i);
        list.set(i,list.get(j));
        list.set(j,temp);
        i++;
        j--;
       }

       //create two listnode
       ListNode dummy = new ListNode(0);
       ListNode current = dummy;

       for(int ind = 0;ind < list.size();ind++){
        current.next = new ListNode(list.get(ind));
        current = current.next;
       }

       return dummy.next;
    }
}
class ListNode{
    int val;
    ListNode next;
    ListNode(int val){
        this.val = val;
        next = null;
    }
    ListNode(int val, ListNode next){
        this.val = val;
        this.next = next;
    }

}
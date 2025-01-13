import java.util.PriorityQueue;
class ListNodee{
    int val;
    ListNode next;
    void ListNode(int val){
        this.val = val;
        next = null;
    }
    void ListNode(int val, ListNode next){
        this.val = val;
        this.next = next;
    }
}
public class MergeKSort{
    public static void main(String args[]){
       ListNode[] lists = new ListNode[3];
       lists[0] = new ListNode(1);
       lists[0].next = new ListNode(4);
       lists[0].next.next = new ListNode(5);
       lists[1] = new ListNode(1);
       lists[1].next = new ListNode(3);
       lists[1].next.next = new ListNode(4);
       lists[2] = new ListNode(2);
       lists[2].next = new ListNode(6);
       ListNode list = mergeKSort(lists);
       while(list != null){
        System.out.print(list.val+" ");
        list = list.next;
       }
    }
    public static ListNode mergeKSort(ListNode [] lists){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(ListNode list : lists){
            while(list != null){
                pq.offer(list.val);
                list = list.next;
            }
        }
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        while(!pq.isEmpty()){
            current.next = new ListNode(pq.poll());
            current = current.next;
        }
        return dummy.next;
    }
}
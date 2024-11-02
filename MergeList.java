import java.util.PriorityQueue;
public class MergeList{
    public static void main(String args[]){

        ListNode[] lists = new ListNode[3];
        lists[0] = create(new int[]{1,4,5});
        lists[1] = create(new int[]{1,3,4});
        lists[2] = create(new int[]{2,6});

        ListNode list = mergeList(lists);
        while(list != null){
            System.out.print(list.val+" ");
            list = list.next;
        }
    }
    public static ListNode create(int value[]){
        ListNode dummy  = new ListNode(0);
        ListNode current = dummy;
        for(int v: value){
            current.next = new ListNode(v);
            current = current.next;
        }
        return dummy.next;
    }
    public static ListNode mergeList(ListNode [] lists){
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        for(ListNode list : lists){
            while(list != null){
                pq.offer(list.val);
                list = list.next;
            }
        }
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        while(pq.size() > 0){
            current.next = new ListNode(pq.poll());
            current = current.next;
        }
        return dummy.next;
    }
}
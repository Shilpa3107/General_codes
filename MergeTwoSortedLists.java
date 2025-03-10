public class MergeTwoSortedLists{
    public static void main(String args[]){
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(4);

        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(3);
        list2.next.next = new ListNode(4);

         ListNode result = mergeTwoLists(list1,list2);
        while(result != null){
            System.out.print(result.val+" ");
            result = result.next;
        }
    }
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(0);
        ListNode current =dummy;
        while(list1 != null && list2 != null){
            if(list1.val < list2.val){
                current.next = new ListNode(list1.val);
                current = current.next;
                list1 = list1.next;
            }
            else{
                current.next = new ListNode(list2.val);
                current = current.next;
                list2 = list2.next;
            }
        }
        while(list1 != null){
            current.next = new ListNode(list1.val);
            list1 = list1.next;
            current = current.next;
        }
        while(list2 != null){
            current.next = new ListNode(list2.val);
            list2 = list2.next;
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
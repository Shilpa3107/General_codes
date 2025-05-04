/**
 * Definition for singly-linked list.
 * c
 */
import java.util.ArrayList;
class MergeTwoLists {
    public static void main(String args[]){
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(4);
        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(3);
       // list2.next.next = new ListNode(5);
        ListNode curr = mergeTwoLists(list1,list2);
        while(curr != null){
            System.out.print(curr.val+" ");
            curr = curr.next;
        }
    }
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
     ArrayList<Integer> arr = new ArrayList<Integer>();
        while(list1 != null && list2 != null){
            if(list1.val < list2.val){
                arr.add(list1.val);
                list1 = list1.next;
            }
            else{
                arr.add(list2.val);
                list2 = list2.next;
            }
        }
        while(list1 != null){
            arr.add(list1.val);
            list1 = list1.next;
        }
        while(list2 != null){
            arr.add(list2.val);
            list2 = list2.next;
        }
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        for(int i = 0;i<arr.size();i++){
            curr.next = new ListNode(arr.get(i));
            curr = curr.next;
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
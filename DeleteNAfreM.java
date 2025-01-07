import java.util.ArrayList;
class ListNode {
    int data;
    ListNode next;

    ListNode(int data) {
        this.data = data;
    }

    ListNode(int data, ListNode next) {
        this.data = data;
        this.next = next;
    }
}

public class DeleteNAfreM{
    public static void main(String args[]){
      ListNode head = new ListNode(9);
      head.next = new ListNode(1);
      head.next.next = new ListNode(3);
      head.next.next.next = new ListNode(5);
      head.next.next.next.next = new ListNode(9);
      head.next.next.next.next.next = new ListNode(4);
      head.next.next.next.next.next.next = new ListNode(10);
      head.next.next.next.next.next.next.next = new ListNode(1);
      deleteNAfreM(head,1,2);
      while(head != null){
        System.out.print(head.data+" ");
        head = head.next;
      }
        
    }
    public static void deleteNAfreM(ListNode head, int n ,int m){
        ArrayList<Integer> list = new ArrayList<>();
        ListNode tempHead = head;
        while(tempHead != null){
            list.add(tempHead.data);
            tempHead = tempHead.next;
        }
        int count = 0;
        int temp = n;
        int ind;
        for(int i = 0; i < list.size(); i++){
            count++;
            if(count == m){
                ind = i+1;
                while(temp-->0 && ind < list.size()){
                    list.remove(ind);
                }
                count = 0;
                temp = n;
            }
        }
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        for(int k : list){
            curr.next = new ListNode(k);
            curr = curr.next;
        }
        head.data = dummy.next.data;
        head.next = dummy.next.next;
    }
}
 import java.util.ArrayList;
class Rotate_list {
    public static void main(String args[]){
        ListNode head = new ListNode(1);
        ListNode curr = head;
        for(int i = 1;i<5;i++){
            curr.next = new ListNode(i+1);
            curr = curr.next;
        }
        int k = 2;
        ListNode m = rotateRight(head,k);
        while(m != null){
            System.out.print(m.val);
            m = m.next;
        }
    }
    public static ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next== null || k==0)
            return head;
        ArrayList<Integer> list = new ArrayList<Integer>();
        ListNode curr = head;
        while(curr != null){
            list.add(curr.val);
            curr = curr.next;
        }
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        rotate(list,list2,k);
        if(list2.isEmpty())
            return head;
        ListNode d = new ListNode(list2.get(0));
        ListNode current = d;
        for(int i = 1;i<list2.size();i++){
            current.next = new ListNode(list2.get(i));
            current = current.next;
        }
        return d;
        
    }
    public static void rotates(ArrayList<Integer> list, ArrayList<Integer> list2, int k){
        for(int i = list.size()-k;i<list.size();i++){
            list2.add(list.get(i));
        }
        for(int i = 0;i<list.size()-k;i++){
            list2.add(list.get(i));
        }
    }
    public static void rotate(ArrayList<Integer> list, ArrayList<Integer> list2, int k){
        k = k%list.size();
        if(k==0)
            return;
        rotates(list,list2,k);
    }
}
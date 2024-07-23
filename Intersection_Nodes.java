public class Intersection_Nodes {
    public static void main(String args[]){
        ListNode1 intersection = new ListNode1(8);
        intersection.next = new ListNode1(4);
        intersection.next.next = new ListNode1(5);

        // Creating the first list and linking the common part
        ListNode1 headA = new ListNode1(4);
        headA.next = new ListNode1(1);
        headA.next.next = intersection;

        // Creating the second list and linking the common part
        ListNode1 headB = new ListNode1(5);
        headB.next = new ListNode1(6);
        headB.next.next = new ListNode1(1);
        headB.next.next.next = intersection;

        ListNode1 dummy = getIntersectionNode(headA,headB);
        while(dummy!=null)
        {
            System.out.print(dummy.val+" ");
            dummy = dummy.next;
        }

    }
    public static ListNode1 getIntersectionNode(ListNode1 headA, ListNode1 headB) {
        int len1 = getLength(headA);
       int len2 = getLength(headB);
       while(len1>len2){
           headA = headA.next;
           len1--;
       }
        while(len2>len1){
            headB = headB.next;
            len2--;
        }
        while(headA!=null && headB!=null){
            if(headA ==headB)
                return headA;
            
            headA = headA.next;
            headB = headB.next;
        }
        return null;
        
    }
    public static int getLength(ListNode1 root){
        int len = 0;
        while(root!=null){
            len++;
            root = root.next;
        }
        return len;
    }
}
 class ListNode1 {
     int val;
         ListNode1 next;
         ListNode1(int x) {
             val = x;
             next = null;
         }
 }
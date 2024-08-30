class LinkedList {
    ListNode head;

    // Method to add a new node at the end of the list
    public void add(int val) {
        ListNode newNode = new ListNode(val);
        if (head == null) {
            head = newNode;
        } else {
            ListNode current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // Method to display the list
    public void display() {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}

public class Intersection_of_Two_Linked_Lists {
    public static void main(String args[]){
        LinkedList listA = new LinkedList();
        LinkedList listB = new LinkedList();
        
        // Adding elements to list A
        listA.add(4);
        listA.add(1);
        ListNode intersectingNode = new ListNode(8);
        listA.head.next.next = intersectingNode; // Making intersection point
        listA.head.next.next.next = new ListNode(4);
        listA.head.next.next.next.next = new ListNode(5);

        // Adding elements to list B
        listB.add(5);
        listB.add(6);
        listB.add(1);
        listB.head.next.next.next = intersectingNode; // Making intersection point
        listB.head.next.next.next.next = new ListNode(4);
        listB.head.next.next.next.next.next = new ListNode(5);

        ListNode newNode = getIntersectionNode(listA.head, listB.head);
        if (newNode != null) {
            System.out.println("Intersection at node with value: " + newNode.val);
        } else {
            System.out.println("No intersection found.");
        }
    }
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int len1 = getLength(headA);
        int len2 = getLength(headB);
        while(len1 > len2){
            headA = headA.next;
            len1--;
        }
        while(len2 > len1){
            headB = headB.next;
            len2--;
        }
        while(headA != null && headB != null){
            if(headA == headB){
                return headA;
            }
            headA = headA.next;
            headB = headB.next;
        }
        return null;
    }
    public static int getLength(ListNode head){
        int len = 0;
        ListNode curr = head;
        while(curr != null){
            len++;
            curr = curr.next;
        }
        return len;
    }
}
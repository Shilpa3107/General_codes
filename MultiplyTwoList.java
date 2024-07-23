class MultiplyTwoList {
    public static void main(String args[]){
      Node first = new Node(1);
      first.next = new Node(0);
      first.next.next = new Node(0);
      Node second = new Node(1);
      second.next = new Node(0);
      System.out.println(multiplyTwoLists(first,second));
    }
    public static long multiplyTwoLists(Node first, Node second) {
        // Code here
        long mod = 1000000007;
        long num1 = 0,num2 = 0;
        while(first!=null){
            num1 = (num1*10)%mod+first.data;
            first = first.next;
        }
        while(second!=null){
            num2 = (num2*10)%mod+second.data;
            second = second.next;
        }
        return (num1*num2)%mod;
        
    }
}
class Node
{
    int data;
    Node next;
    Node(int data) {
        this.data=data;
        this.next = null;
    }
}
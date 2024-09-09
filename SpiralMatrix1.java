import java.util.Arrays;
// class ListNode {
//          int val;
//          ListNode next;
//          ListNode() {}
//          ListNode(int val) { this.val = val; }
//          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//      }
public class SpiralMatrix1{
    public static void main(String args[]){
        ListNode head = new ListNode(3);
        head.next = new ListNode(0);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(6);
        head.next.next.next.next = new ListNode(8);
        head.next.next.next.next.next = new ListNode(1);
        head.next.next.next.next.next.next = new ListNode(7);
        head.next.next.next.next.next.next.next = new ListNode(9);
        head.next.next.next.next.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next.next.next.next.next = new ListNode(2);
        head.next.next.next.next.next.next.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next.next.next.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next.next.next.next.next.next.next.next = new ListNode(0);
        int m = 3;
        int n = 5;
        int arr[][] = matrix(m,n,head);
        for(int i =0;i<m;i++){
            for(int j = 0;j<n;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static int[][] matrix(int m, int n, ListNode head){
        int arr[][] = new int[m][n];
        for(int i = 0;i<m;i++){
            Arrays.fill(arr[i],-1);
        }
        int r = 0, c = 0, di = 0;
        int dr[] = {0,1,0,-1};
        int dc[] = {1,0,-1,0};
        boolean seen[][] = new boolean[m][n];
        while(head != null){
            arr[r][c] = head.val;
            seen[r][c] = true;
            
            int newR = r+dr[di];
            int newC = c+dc[di];
            if(0<=newR && newR < m && 0<= newC && newC < n && !seen[newR][newC]){
                r = newR;
                c = newC;
            }
            else{
                di = (di+1)%4;
                r = r+dr[di];
                c = c+dc[di];
            }
            head = head.next;
        }
        return arr;
    }
}
public class CountBattleShips{
    public static void main(String args[]){
      char board[][] = {{'X','.','.','X'},{'.','.','.','X'},{'.','.','.','X'}};
      System.out.println(countBattleShips(board));
    }
    public static int countBattleShips(char board[][]){
        int c = 0;
        for(int i = 0;i<board.length;i++){
            for(int j = 0;j<board[0].length;j++){
                if(board[i][j] == 'X'){
                    if((i==0 || board[i-1][j] == '.') && (j==0 || board[i][j-1]=='.'))
                      c++;
                }
            }
        }
        return c;
    }
}
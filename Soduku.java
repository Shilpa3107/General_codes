import java.util.*;
class Soduku {
    public static void main(String args[]){
        String board[][] = {{"5","3",".",".","7",".",".",".","."},{"6",".",".","1","9","5",".",".","."},{".","9","8",".",".",".",".","6","."},{"8",".",".",".","6",".",".",".","3"},{"4",".",".","8",".","3",".",".","1"},{"7",".",".",".","2",".",".",".","6"},{".","6",".",".",".",".","2","8","."},{".",".",".","4","1","9",".",".","5"},{".",".",".",".","8",".",".","7","9"}};
        System.out.println(isValidSudoku(board));
    }
    @SuppressWarnings("unchecked")
    public static boolean isValidSudoku(String[][] board) {
       HashSet<String>[] row = new HashSet[9];
       HashSet<String>[] col = new HashSet[9];
       HashSet<String>[] box = new HashSet[9];
        for(int i = 0;i<9;i++){
            row[i] = new HashSet<>();
            col[i] = new HashSet<>();
            box[i] = new HashSet<>();
        }
        for(int i = 0;i<9;i++){
            for(int j = 0;j<9;j++){
                if(board[i][j] == ".")
                    continue;
                String value = board[i][j];
                int ind = (i/3)*3+(j/3);
                
                if(row[i].contains(value) || col[j].contains(value) ||box[ind].contains(value))
                    return false;
                row[i].add(value);
                col[j].add(value);
                box[ind].add(value);
            }
        }
        return true;
    }
}
public class NeighborFinder {
     public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        findNeighbors(matrix, 0, 0); // Find neighbors of 5
    }
    public static void findNeighbors(int[][] matrix, int row, int col) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        // Check if given position is valid
        if (row < 0 || row >= rows || col < 0 || col >= cols) {
            System.out.println("Invalid position!");
            return;
        }

        // Iterate over the 8 neighboring positions
        for (int i = row - 1; i <= row + 1; i++) {
            for (int j = col - 1; j <= col + 1; j++) {
                // Skip the current position itself
                if (i == row && j == col) 
                    continue;
                // Check if the neighboring position is valid
                if (i >= 0 && i < rows && j >= 0 && j < cols)
                    System.out.println("Neighbor at (" + i + ", " + j + "): " + matrix[i][j]);
            }
        }
    }
}
public class SudokuBoard {
    private static final int SIZE = 9;                                
    private int[][] board = new int[SIZE][SIZE];
    private boolean[][] editable = new boolean[SIZE][SIZE];

    private int[][] initial = {
        {5, 3, 0, 0, 7, 0, 0, 0, 0},
        {6, 0, 0, 1, 9, 5, 0, 0, 0},
        {0, 9, 8, 0, 0, 0, 0, 6, 0},
        {8, 0, 0, 0, 6, 0, 0, 0, 3},
        {4, 0, 0, 8, 0, 3, 0, 0, 1},
        {7, 0, 0, 0, 2, 0, 0, 0, 6},
        {0, 6, 0, 0, 0, 0, 2, 8, 0},
        {0, 0, 0, 4, 1, 9, 0, 0, 5},
        {0, 0, 0, 0, 8, 0, 0, 7, 9}
    };

    public SudokuBoard() {
        for (int i = 0; i < SIZE; i++)
            for (int j = 0; j < SIZE; j++) {
                board[i][j] = initial[i][j];
                editable[i][j] = initial[i][j] == 0;
            }
    }

    public void print() {
        System.out.println("+-------+-------+-------+");
        for (int i = 0; i < SIZE; i++) {
            System.out.print("| ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print((board[i][j] == 0 ? "." : board[i][j]) + " ");
                if ((j + 1) % 3 == 0) System.out.print("| ");
            }
            System.out.println();
            if ((i + 1) % 3 == 0)
                System.out.println("+-------+-------+-------+");
        }
    }

    public boolean isEditable(int row, int col) {
        return editable[row][col];
    }

    public void setValue(int row, int col, int value) {
        board[row][col] = value;
    }

    public boolean isComplete() {
        for (int[] row : board)
            for (int val : row)
                if (val == 0) return false;
        return true;
    }

    public int[][] getBoard() {
        return board;
    }
}

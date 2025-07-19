import java.util.Scanner;

public class SudokuGame {
    public static void main(String[] args) {
        SudokuBoard board = new SudokuBoard();
        SudokuValidator validator = new SudokuValidator();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            board.print();
            System.out.print("Digite linha (1-9), coluna (1-9) e número (1-9) \nUse de espaço a cada vez que digitar: ");
            int row = scanner.nextInt() - 1;
            int col = scanner.nextInt() - 1;
            int num = scanner.nextInt();

            if (!board.isEditable(row, col)) {
                System.out.println("Posição original não pode ser alterada!");
                continue;
            }

            if (validator.isValidMove(board.getBoard(), row, col, num)) {
                board.setValue(row, col, num);
                if (board.isComplete()) {
                    board.print();
                    System.out.println("Parabéns! Você completou o Sudoku!");
                    break;
                }
            } else {
                System.out.println("Movimento inválido! Tente novamente.");
            }
        }
        scanner.close();
    }
}

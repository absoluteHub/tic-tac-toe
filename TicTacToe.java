import java.util.Scanner;

public class TicTacToe {

    private static void printTableMapping() {
        char[][] mappingTable = {{'7', '8', '9'}, {'4', '5', '6'}, {'1', '2', '3'}};
        printGameTable(mappingTable);
    }

    private static void printGameTable(char[][] gameTable) {
        for (int i = 0; i < 3; i++) {
            System.out.println("-------------");
            for (int j = 0; j < 3; j++) {
                System.out.print("| " + gameTable[i][j] + " ");
            }
            System.out.println("|");
        }
        System.out.println("-------------");
    }

    private static void makeUserMove(char[][] gameTable) {
        while (true) {
            System.out.println("Please type number between 1 and 9:");
            String string = new Scanner(System.in).nextLine();
            if (string.length() == 1) {
                char digit = string.charAt(0);
                if (digit >= '1' && digit <= '9') {
                    if (makeUserMoveToCell(gameTable, digit)) {
                        return;
                    }
                }
            }
        }
    }

    private static boolean makeUserMoveToCell(char[][] gameTable, char digit) {
        char[][] mappingTable = {{'7', '8', '9'}, {'4', '5', '6'}, {'1', '2', '3'}};
        for (int i = 0; i < mappingTable.length; i++) {
            for (int j = 0; j < mappingTable[i].length; j++) {
                if (mappingTable[i][j] == digit) {
                    if (gameTable[i][j] == ' ') {
                        gameTable[i][j] = 'X';
                        return true;
                    } else {
                        System.out.println("Can't make a move, because the cell is not free! Try again!");
                        return false;
                    }
                }
            }
        }
        return false;
    }
}

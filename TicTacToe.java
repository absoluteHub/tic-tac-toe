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
}

package Game_of_Life;

public class Aufgabe_C {
    public static void main(String[] args) {
        char[][] StartGeneration = fillArray(10);
        System.out.println("StartGeneration");
        ausgabe(StartGeneration);
        System.out.println("Ergbis");
        ausgabe(GameOflife(StartGeneration,10));
    }
    public static char[][] fillArray(int n) {
        char[][] array = new char[n][n];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                long randomNumber = Math.round(Math.random());
                if (randomNumber == 1) {
                    array[i][j] = '+';
                } else {
                    array[i][j] = '-';
                }
            }
        }
        return array;
    }
    public static void ausgabe(char[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j <array.length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

    }
    public static char[][] GameOflife(char[][] array, int generation) {
        int x = 0;
        while (x < generation) {
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    if ((i > 1 && i < array.length - 2) && (j >1 && j < array.length - 2)) {
                        int aliveNeighbours = HowManyAliveCells(array, i, j);
                        // Rules
                        if (array[i][j] == '+' && aliveNeighbours < 2) {
                            array[i][j] = '-';
                        } else if (array[i][j] == '+' && aliveNeighbours > 3) {
                            array[i][j] = '-';
                        } else if (array[i][j] == '-' && aliveNeighbours == 3) {
                            array[i][j] = '+';
                        }
                    }
                }
            }
            x++;
        }
        return array;
    }
    public static int HowManyAliveCells(char[][] array, int i, int j) {
        int AliveCells =0 ;
        if (array[i - 2][j] == '+') {
            AliveCells++;
        }
        if (array[i + 2][j] == '+') {
            AliveCells++;
        }
        if (array[i][j - 2] == '+') {
            AliveCells++;
        }
        if (array[i][j + 2] == '+') {
            AliveCells++;
        }
        if (array[i - 2][j - 2] == '+') {
            AliveCells++;
        }
        if (array[i - 2][j + 2] == '+') {
            AliveCells++;
        }
        if (array[i + 2][j - 2] == '+') {
            AliveCells++;
        }
        if (array[i + 2][j + 2] == '+') {
            AliveCells++;
        }
        return AliveCells;
    }
}

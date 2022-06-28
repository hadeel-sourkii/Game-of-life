package Game_of_Life;

public class hadeeltreppe {
    public static void main (String []args ){
        fuellarray(3);
    }


    public static void fuellarray (int n){
        char [][] array = new char [n][n];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {


                    if (i % 2 == 0 && j % 2!= 0) {
                        array[i][j] = '+';
                    } else if (j==i) {
                        array[i][j] = '+';
                    } else {
                        array[i][j] = ' ';
                    }
                    System.out.print(array[i][j] + " ");

                }
                System.out.println();

            }


    }


    public static void PrintDraw(char [][] array ){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print( array[i][j]+ " ");

            }

            System.out.println();
        }

    }
}

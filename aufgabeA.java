package Game_of_Life;

public class aufgabeA {
    static char[][] array  ;
    public static void main (String [] args){


       erstellefeld(20 );
       printArray(array);

    }

    public static char[][] erstellefeld (int n) {
        array = new char[n][n];
        int breite=n/4;
        int hoehe =n/2;
        if(n>=16){
            System.out.print(n+1);
        }


          for(int i =0 ; i<array.length ; i++ ){
              for (int j=0; j<array[i].length;j++){
                  if (i>=2 && i<= array.length/2 + array.length/4 + 1 && j==1 ){
                      array[i][j]='+';
                  }
                  else if(i>=2 &&  i<= array.length/2 + array.length/4 + 1 && j==hoehe ){
                      array[i][j]='+';
                  }else if(i== hoehe && j>=1 && j<=hoehe){
                      array[i][j]='+';
                      //el s fo2
                  }else if ((i==2) && (j>=array.length/2+ array.length/4) && (j<=array.length)){
                      array[i][j]='+';
                  }else if ((i>2 )&& (i< array.length/2) &&  (j == array.length/2 +array.length/4 -1) ){
                      array[i][j]='+';
                      //nus
                  }else if (i== array.length/2 && j>=array.length/2+array.length/4 && j<array.length -1){
                      array[i][j]='+';
                      //t7t
                  }else if (i>array.length/2&& i<array.length/2+array.length/4+1 && j==array.length-1){
                      array[i][j]='+';
                      // t7t
                  }else if (i==array.length/2+array.length/4+1 && j>=array.length/4+array.length/2 -1 && j<array.length-1){
                      array[i][j]='+';
                  }
                  else {
                      array [i][j]=' ';
                  }

              }
          }

        return new char[0][];
    }
    public  static void printArray (char[][] array ){
        for (int i =0 ; i<array.length ; i++){
            for( int j =0; j<array.length ; j++){
                System.out.print(array [i][j]+" ");

            }
            System.out.println();
        }
    }
}

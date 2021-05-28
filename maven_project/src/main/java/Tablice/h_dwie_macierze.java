package Tablice;

public class h_dwie_macierze {
    public static void main(String[] args){
        int macierza[][] = new int[10][10];
        int macierzb[][] = new int[10][10];

        for (int i=0;i<10;i++){
            for(int j=0; j<10;j++){

                    macierza[i][j]=j;

                System.out.print(macierza[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i=0;i<10;i++){
            for(int j=0; j<10;j++){

                    macierzb[i][j]=0;

                System.out.print(macierzb[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i=0;i<10;i++){
            for(int j=0; j<10;j++){

                macierzb[i][j]=macierza[j][i];

                System.out.print(macierzb[i][j] + " ");
            }
            System.out.println();
        }


    }
}

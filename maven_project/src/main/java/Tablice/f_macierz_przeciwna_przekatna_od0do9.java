package Tablice;

public class f_macierz_przeciwna_przekatna_od0do9 {
    public static void main(String[] args){
        int macierz[][]= new int[10][10];
        for(int i=0;i<10;i++){
            for(int j=0;j<10;j++){
                if((i)==(9-j)){
                    macierz[i][j]=i;
                }
                else{
                    macierz[i][j]=0;
                }
                System.out.print(macierz[i][j] + " ");
            }
            System.out.println();
        }
        int suma=0;
        for(int i=0;i<10;i++){
            suma= suma+macierz[i][9-i];
        }
        System.out.println("suma liczb na diagonali wynosi " + suma);

    }
}




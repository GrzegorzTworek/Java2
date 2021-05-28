package Tablice;

public class g_macierz_pionowo_kwadraty_liczby {
    public static void main(String [] args){
        int macierz[][] = new int[10][10];
        for(int i=0; i<10;i++){
            for(int j=0;j<10;j++){
                if(j==1){
                    macierz[i][j]=i*i;
                }
                else if(j==0){
                    macierz[i][j]=i;
                }

                else{
                    macierz[i][j]=0;
                }
                System.out.print(macierz[i][j] + " ");
            }

            System.out.println();
        }
        int suma1=0;
        for(int i =0;i<10;i++){
            suma1=suma1+macierz[i][0];
        }
        System.out.println("Suma liczb w pierwszej kolumnie wynosi " + suma1);
        System.out.println();
        int suma2=0;
        for(int i =0;i<10;i++){
            suma2=suma2+macierz[i][1];
        }
        System.out.println("Suma liczb w pierwszej kolumnie wynosi " + suma2);
    }
}

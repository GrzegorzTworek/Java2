package Programowanie_obiektowe;

import java.util.Random;

import static java.lang.Math.round;

public class tablica_losowo_przekatna {


    public double suma=0;
    public void czytaj_dane(double [][] macierz, int n){


Random r =new Random();
        for(int i=0;i <10;i++ ){
            for(int j=0;j<10;j++){
                if(i==j){
                    //macierz[i][j]=round(9*(r.nextDouble()));
                    macierz[i][j]=r.nextInt(10);
                }
                else{
                    macierz[i][j]=0;
                }
            }
        }
    }
    public void przetworz_dane(double[][]  macierz, int n){


        for(int i=0;i<10;i++){
            suma=suma+macierz[i][i];

        }


    }
    public void wyswietl_wynik(double[][]  macierz, int n){
        for(int i=0; i<10;i++){
            for(int j=0;j<10; j++){

                System.out.print((int)macierz[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("suma liczb na przekatnej wynosi " + (int)suma);
    }
    public static void main(String[] args){
        int n=10;
         double [][] table= new double[n][n];
        tablica_losowo_przekatna tablica = new tablica_losowo_przekatna();
        tablica.czytaj_dane(table,n);
        tablica.przetworz_dane(table,n);
        tablica.wyswietl_wynik(table,n);

    }
}

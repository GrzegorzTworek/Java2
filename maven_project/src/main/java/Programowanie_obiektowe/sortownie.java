package Programowanie_obiektowe;

import java.util.Scanner;

//import static com.sun.tools.javac.jvm.ByteCodes.swap;

public class sortownie {

    public void czytaj_dane(int[] liczby, int n){
    liczby =new int[n];
    Scanner input = new Scanner(System.in);

    for(int i=0;i<n;i++){
        System.out.println("Podaj liczbe " +i );
        liczby[i]=input.nextInt();

    }
        System.out.print("Niposortowane liczby to ");
        for(int i=0;i<n;i++) {

            System.out.print( liczby[i] +" ");

        }
    }
    public void przetworz_dane(int[] liczby, int n){

        for (int i=1;i<=liczby.length;i++){
            for(int j=1;j<=liczby.length;j++) {
                if (liczby[j + 1] < liczby[j]) {
                    int x;
                    x=liczby[j];
                    liczby[j] = liczby[j + 1];
                    liczby[j+1]=x;
                }
            }
        }

//        for (int i=1;i<=n-1;i++){
//            for(int j=n-1;j>=i;--j) {
//                if (liczby[j -1] > liczby[j]) {
//                    int x;
//                    x=liczby[j-1];
//                    liczby[j-1] = liczby[j ];
//                    liczby[j]=x;
//                }
//            }
//        }

//        for (int i=1;i<=n-1;i++){
//            for(int j=n-1;j>=i;--j) {
//                if (liczby[j -1] > liczby[j]) {
//                    //int x;
//                    swap(liczby,j-1,j);
//                }
//            }
//        }

        System.out.print("Posortowane liczby to ");
        for(int i=0;i<liczby.length;i++) {
            System.out.print( liczby[i] +" ");
        }

    }
    public void wyswietl_wyniki(int[] liczby, int n){
        System.out.print("Posortowane liczby to ");
        for(int i=0;i<n;i++) {
            System.out.print( liczby[i] +" ");
        }

    }
    public static void main(String[] args){
        int roz= 4;
        int[] tablica = new int[roz];
        sortownie babel = new sortownie();
        babel.czytaj_dane(tablica,roz);
        babel.przetworz_dane(tablica,roz);
        babel.wyswietl_wyniki(tablica,roz);
    }
}

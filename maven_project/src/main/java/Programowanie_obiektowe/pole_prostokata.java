package Programowanie_obiektowe;

import java.util.Scanner;

public class pole_prostokata {

    double a,b, pole;
    public void czytaj_dane(){
Scanner input = new Scanner(System.in);
        System.out.println("podaj bok a prostokąta ");
        a=input.nextDouble();
        System.out.println("podaj bok b prostokąta ");
        b=input.nextDouble();
    }
    public void przetworz_dane(){
pole = a*b;
    }
    public void wyswietl_wynik(){

        System.out.printf("Bok a wynosi %2.2f ", a);
        System.out.printf("Bok b wynosi %2.2f\n ", b);
        System.out.println("Pole prostokata wynosi " + pole);
    }
    public static void main(String[] args){
        pole_prostokata pole = new pole_prostokata();
        pole.czytaj_dane();
        pole.przetworz_dane();
        pole.wyswietl_wynik();
    }
}

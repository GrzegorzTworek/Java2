package Programowanie_obiektowe;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class funkcja_kwadratowa_obiektowe {

    public double a, b, c, delta,x1,x2;
    char liczba_pierwiastkow;
    public void czytaj_dane(){
Scanner input = new Scanner(System.in);
        System.out.println("Podaj współczynnik a ");
        a= input.nextDouble();

        if(a==0){
            System.out.println("a nie moze wynosic zero ");
            System.exit(1);
        }
        else {
            System.out.println("Podaj współczynnik b ");
            b= input.nextDouble();
            System.out.println("Podaj współczynnik c ");
            c= input.nextDouble();
        }
    }
    public void przetworz_dane(){
        delta = b*b-4*a*c;
        if (delta<0){liczba_pierwiastkow = 0;}
        if (delta==0){liczba_pierwiastkow = 1;}
        if (delta>0){liczba_pierwiastkow = 2;}

        switch(liczba_pierwiastkow){
            case 1 : x1= -b/(2*a);
            break;
            case 2 : {
                double pierw = sqrt(delta);
                x1=((-b)-pierw)/(2*a);
                x2=((-b)+pierw)/(2*a);
            }
            break;
        }


    }

    public void wyswietl_wynik() {
        System.out.printf("Współczynniki wynoszą %2.2f, %2.2f, %2.2f\n", a, b, c);

        switch (liczba_pierwiastkow) {

            case 0: {
                System.out.println("trójmian nie ma pierwiastków rzeczywistych ");
            }
            break;
            case 1 : {
                System.out.println("Delta wynosi " + delta);
                System.out.printf("trójmian ma jeden pierwiastek %2.2f", x1);
            }
            break;
            case 2 : {
                System.out.println("Delta wynosi " + delta);
                System.out.printf("Pierwiastki równani wynoszą %2.2f, %2.2f", x1, x2);
            }
            break;
        }
    }
    public static void main(String[] args){
        funkcja_kwadratowa_obiektowe rownanie = new funkcja_kwadratowa_obiektowe();
        rownanie.czytaj_dane();
        rownanie.przetworz_dane();
        rownanie.wyswietl_wynik();

    }
}

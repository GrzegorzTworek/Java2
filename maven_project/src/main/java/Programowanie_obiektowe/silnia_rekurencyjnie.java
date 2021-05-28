package Programowanie_obiektowe;

import java.io.IOException;
import java.util.Scanner;

public class silnia_rekurencyjnie {

    public long silnie(int liczba) {

        long zwrot = 1;
        if (liczba >= 2) {
            zwrot = liczba * silnie(liczba - 1);
        }

        return zwrot;
    }

}
 class Main {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj liczbe ");
        int s = input.nextInt();

        silnia_rekurencyjnie wynik = new silnia_rekurencyjnie();

        System.out.println("Liczenie silni z liczby całkowitej ");
        for (int i = 1; i <= s; i++) {
            System.out.println(" " + i + "! = " + wynik.silnie(i));

        }
    }
}






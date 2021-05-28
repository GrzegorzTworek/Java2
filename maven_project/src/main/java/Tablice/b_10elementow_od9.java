package Tablice;

public class b_10elementow_od9 {
    public static void main(String[] args){
        int[] dane = new int[10];

        for(int i = 0; i<=9; i++){
            dane[i]=9-i;
            System.out.println("dane [" + i + "] " + dane[i]);
        }
    }
}

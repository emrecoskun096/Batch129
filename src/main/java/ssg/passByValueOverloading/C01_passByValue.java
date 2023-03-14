package ssg.passByValueOverloading;

import java.util.Scanner;

public class C01_passByValue {
    /*
    kullanicidan bir int deger alalim
    ve bu degeri 3 katina cikaran bir method olusturalim
    olusturdugumuz degeri method icinde
    ve main method icinde ayri ayri yazdiralim
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir sayi giriniz");
        int sayi= scan.nextInt();
        katlama(sayi);
        System.out.println(sayi);//9



    }

    public static void katlama(int sayi) {
        sayi=sayi*3;
        System.out.println(sayi);//9

    }


}
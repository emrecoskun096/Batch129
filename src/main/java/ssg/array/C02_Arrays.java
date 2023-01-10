package ssg.array;

import java.util.Arrays;
import java.util.Scanner;

public class C02_Arrays {
    public static void main(String[] args) {


    /*
      9.soru-Verilen bir array'e yeni bir element ekleyin
      */
    String siniflistesi[]={"ozlem","hakan,","osman","ahmet"};
    Scanner scan =new Scanner(System.in);
        System.out.println("lutfen eklemek icin bir isim giriniz");
    String eklenecek=scan.nextLine();

    String yeniSinifListesi[]=new String[siniflistesi.length+1];
        for (int i = 0; i < yeniSinifListesi.length-1; i++) {
        yeniSinifListesi[i]=siniflistesi[i];

    }
    yeniSinifListesi [yeniSinifListesi.length-1]=eklenecek;
        System.out.println(Arrays.toString(yeniSinifListesi));

}}

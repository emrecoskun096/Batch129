package ssg.array;

import java.util.Arrays;
import java.util.Scanner;

public class C01_Arrays {
    public static void main(String[] args) {

        String arr[] = {"erel", "zahide", "sibel", "yusuf"};
        System.out.println(Arrays.toString(arr));


        /*
        bir array olusturun ve sayilari kucukten buyuge siralayin
         */

        int brr[] = {9, 8, 7, 6, 5, 4};
        Arrays.sort(brr);
        System.out.println(Arrays.toString(brr));


        /*
        .soru Verilen 3 elemanli bir array in tum elemanlarini
         bir soldaki konuma tasiyacak bir program yazin. Ornek; array (1,2,3) ise output (2, 3, 1 olacak
         */
        int zrr[] = {1, 2, 3};
        int atama = zrr[0];
        for (int i = 0; i < zrr.length - 1; i++) {
            zrr[i] = zrr[i + 1];
        }
        zrr[zrr.length - 1] = atama;

        /*
    4.soru Verilen bir array'in tum elemanlarini toplayan bir program yazalim,
     */
        int a[] = {1, 2, 3, 4};
        int sum = 0;
        for (int w : a) {
            sum += w;

        }
    /*
    5.Soru -Verilen String bir array'de en uzun ve en kisa String'leri yazdıran bir method
     */
        String isimler[]={"said","sibel","cemil","esra","omer faruk"};


        /*
        6.soru -Verilen bir array'in istenen bir elemani icerip icermedigini kontrol edip, bize
true veya false sonucu donen bir method olusturun.
         */

        String isimler2[]={"said","sibel","cemil","esra","omer faruk"};




    }
    public static void enUzunveEnKisa(String[] isimler){
        String enUzun=isimler[0];
        String enKisa=isimler[0];

        for (int i = 0; i <isimler.length ; i++) {
            if (isimler[i].length()>enUzun.length()){
                enUzun=isimler[i];
            }
            if (isimler[i].length()<enKisa.length()){
                enKisa=isimler[i];
            }
        }


    }
    public static boolean contains(String[] isimler2){
        boolean sonucDeger=false;
        Scanner input=new Scanner(System.in);
        System.out.println("aranan ismi giriniz");
        String aranan=input.nextLine();
        for (int i = 0; i <isimler2.length ; i++) {
            if (isimler2[i].equalsIgnoreCase(aranan)){
                sonucDeger=true;
            }
        }


        return sonucDeger;
    }
}

package advence_practice.day02;

import java.util.Arrays;
import java.util.Scanner;

public class Q05_Arrays_ElementSil {
    public static void main(String[] args) {

        /*
     Elementlerini kullanıcıdan alarak bir integer Array oluşturunuz.
     Kullanıcıdan bir indeks alınız ve o indeksteki elementi siliniz.
     */

            //Elementlerini kullanıcıdan alarak bir integer Array oluşturunuz.
            Scanner input = new Scanner(System.in);
            System.out.println("Array limitini giriniz");
            int limit = input.nextInt();
            int[] arr = new int[limit];
            for (int i = 0; i < limit; i++) {
                System.out.println("İndeks " + i + " değerini giriniz");
                arr[i] = input.nextInt();
            }
            System.out.println(Arrays.toString(arr));

            //Kullanıcıdan bir indeks alınız ve o indeksteki elementi siliniz.
            System.out.println("Silmek istediğiniz indeksi giriniz");
            int indexSil = input.nextInt();

            int[] arr2 = new int[limit - 1];
            int idx = 0;
            for (int i = 0; i < limit; i++) {

                if (i != indexSil) {
                    arr2[idx] = arr[i];
                    idx++;
                }

            }
            System.out.println(Arrays.toString(arr2));

    }//main

}
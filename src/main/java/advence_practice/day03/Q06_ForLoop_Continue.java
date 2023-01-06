package advence_practice.day03;

import java.util.Scanner;

public class Q06_ForLoop_Continue {
    public static void main(String[] args) {

        /*
      Kullanıcıdan 5 adet sayı isteyiniz
      Bu sayılardan 5 ile 10 arasındakiler hariç, diğerlerinin toplamını bulunuz.
      Not: 5 ve 10 dahil değil.
      */

        int toplam = 0;
        Scanner input = new Scanner(System.in);
        for (int i = 1; i < 6; i++) {
            System.out.println(i + ".sayiyi giriniz");
            int sayi = input.nextInt();
            if (sayi > 5 && sayi < 10) {
                System.out.println("girdiginiz sayi 5 ile 10 arasindadir toplama dahil olmayacaktir");
                continue;
            }
            toplam += sayi;

        }
        System.out.println(toplam);


    }


}

package advence_practice.day03;

import java.util.Scanner;

public class Q05_NestedForLoop_Carpim {
      /*
       2 boyutlu bir tablo olarak, ekrana çarpım tablosunu hesaplayıp yazan kodu yazınız.

       Örnek Ekran çıktısı
       1  2  3  4  5
       2  4  6  8 10
       3  6  9 12 15
       4  8 12 16 20
       5 10 15 20 25

       Ekran çıktısı 5 x 5 boyutları için örnek olarak verilmiştir,
       isterseniz boyutları klavyeden okuyup istenen boyutlara göre
       ekrana yazdıran bir kod yazabilirsiniz.
    */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bir tamsayı giriniz");
        int limit = input.nextInt();
        for (int i = 1; i <= limit; i++) {

            for (int j = 1; j <= limit; j++) {
                System.out.print(String.format("%2d", j * i) + " ");
            }
            System.out.println();
        }
    }
}












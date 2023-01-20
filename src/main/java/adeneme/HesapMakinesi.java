package adeneme;

import java.util.Scanner;

public class HesapMakinesi {
   public static void main(String[] args) {
        /* Problem Tanımı :
      Basit 4 işlem yapan bir hesap makinesi methodu kodlayınız....
      Kullanicidan yapacagi islemi islem sembolu ile secmesini saglayalinız.
      Kullanicidan iki sayi girmesini isteyiniz.
      Girilen iki sayi ve secilen isleme gore dogru sonucu ekrana yazdirınız.
*/





    }

   public static void hesapMakinesi() {

        Scanner input = new Scanner(System.in);

        double islemSonuc = 0;
        String sembol;
        do {

            System.out.println("yapacaginiz islemin sembolunu giriniz cikmak icin 0 a basiniz");
            sembol = input.next();
            if (sembol.equalsIgnoreCase("0")){
                break;
            }
            System.out.println("iki sayi giriniz");
            double sayi1 = input.nextInt();
            double sayi2 = input.nextInt();


            switch (sembol) {
                case "+":
                    islemSonuc = sayi1 + sayi2;
                    break;
                case "-":
                    islemSonuc = sayi1 - sayi2;
                    break;
                case "*":
                    islemSonuc = sayi1 * sayi2;
                    break;
                case "/":
                    islemSonuc = sayi1 / sayi2;
                    break;
                default:
                    System.out.println("gecersiz islem");
                    hesapMakinesi();
                    break;

            }

            System.out.println("islemSonuc = " + islemSonuc);
        } while (true);


    }
}

package day07ifstatement;

import java.util.Scanner;

public class C04_IfStatement {

        /*
         Kullanicidan yas degerini alan ve yasin hangi evrede oldugunu
          asagidaki tabloya gore yazdiran kodu olusturunuz

          0-4 ==> bebek
          5-12 ==> cocuk
          13-20 ==> genc
          21-30 ==> yetiskin
          Tanimlanmamis Evre
          Hata Mesaji olarak "Gecerli bir yas giriniz" yazdiriniz
         */

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz");
        int yas = input.nextInt();

        if (yas < 0) {
            System.out.println("Gecerli bir yas giriniz");
        } else if (yas < 5) {
            System.out.println("Bebek");
        } else if (yas < 13) {
            System.out.println("Cocuk");
        } else if (yas < 21) {
            System.out.println("genc");
        } else if (yas < 31) {
            System.out.println("yetiskin");
        } else {
            System.out.println("Tanimlanmamis Evre");
        }
    }
}
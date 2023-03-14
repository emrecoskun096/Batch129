package advence_practice.day12;

import java.util.Scanner;

public class Q01_Recorsive_Faktoriyel {

    //Faktoriyel hesaplayan bir method yazınız.(Loop kullanmayınız.)
    public static void main(String[] args) {

        System.out.println(faktoriyel(5));

    }


    public static int faktoriyel(int sayi) {
        if(sayi>=0) {
            if (sayi == 0 || sayi == 1) {
                return 1;
            } else {
                return sayi * faktoriyel(sayi - 1);
            }

        }else {
            throw new ArithmeticException("Sayi sifirdan kucuk olamaz");
        }



    }

}


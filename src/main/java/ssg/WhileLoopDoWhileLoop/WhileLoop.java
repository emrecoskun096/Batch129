package ssg.WhileLoopDoWhileLoop;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        // kullanicidan toplamak istedigi sayilari alin
        // ve kullanici 0'a basincaya kadar devam edin
        // kullanici 0'a bastiginda
        // girdigi tum sayilarin toplamini yazdirin


        Scanner input=new Scanner(System.in);

        int sayi;
        int toplam=0;
        int counter=0;
        do { System.out.println("sayi giriniz");
            sayi=input.nextInt();

            toplam+=sayi;
            counter++;
        }while (sayi!=0);
        System.out.println(toplam);
        System.out.println("counter = " + (counter-1)+ " sayi girdiniz");


    }
}

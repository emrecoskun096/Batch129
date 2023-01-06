package day03scanner;

import java.util.Scanner;

public class C05_Scanner {

    public static void main(String[] args) {
        //Kullanicidan bir dikdortgenin en ve boyunu alan ve
        // dikdortgenin alanini ve cevresini hesaplayan kodu yaziniz
        //Dikdortgenin Alani =en*boy;
        //Dikdortgenin cevresi = 2*(en+boy)
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen dikdortgenin kisa kenarini giriniz");
        int en=input.nextInt();

        System.out.println("Lutfen dikdortgenin uzun kenarini giriniz ");
        int boy = input.nextInt();

        System.out.println("Alan ==> "+(en*boy));
        System.out.println("Cevre ==> "+(2*(en+boy)));


    }
}
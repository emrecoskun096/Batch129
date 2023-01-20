package adeneme;

import java.lang.reflect.Array;
import java.util.*;

public class deneme2 {

    /* Iki kisinin oynayacagi bir kelime oyunu uretelim
     * Kurallar
     * 1.Adım- Baslangicta 1.oyuncudan bir kelime girmesini isteyin ve kelimeyi yazdirin
     *
     * 2.Adım- 1.oyuncu kelimeyi girince 2.oyuncuya kelimeyi kabul edip etmedigini sorun.
     * * 2. oyuncu Eger kelimeyi kabul ederse 1.oyuncuya kelimedeki harf sayisi kadar puan ekleyin
     * ve 3.adima gecin
     * * girilen kelimeyi kabul etmezse "gecersiz kelime" yazdirin ve hangi oyuncunun
     * kazandigini yazip oyunu bitirin.
     *
     * 3.Adım- 2. oyuncuya oyuna devam etmek isteyip istemedigini sorun
     * * devam etmek isterse kelimeye eklemek istedigi string'i ve
     * basa mi sona mi ekleyecegini sorun
     * aldiginiz string'i kelimeye ekleyip 2.adima gidin
     *
     * * Devam etmek istemezse
     * "Oyun bitti" yazin
     * kullanicilarin puanlarini ve kazanan oyuncuyu yazdirin
     */
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);


      int birPuan=0;
      int ikiPuan=0;
      boolean oyunDevam;

      do {
          oyunDevam=true;

          System.out.println("kelime giriniz");
          String first = input.nextLine();
          System.out.println(first);

          System.out.println("kelimeyi kabul ediyormusunuz E veya H giriniz");
          String kabul=input.next();
          if (kabul.equalsIgnoreCase("e")){
              birPuan+=first.length();
          }else
              System.out.println("gecersiz kelime");
          oyunDevam=false;

          System.out.println("2.oyuncu devam etmek istiyormusun");
          String ikinciDevam=input.next();


      }while (!true);

        System.out.println("1. oyuncu kazandi");


    }
}
package adeneme;

import java.util.Scanner;

public class MusteriKarti {
    /*
     * Kullanicidan aldigi urunun adedini ve liste fiyatini alin, kullaniciya
     * musteri karti olup olmadigini sorun
     *
     * Musteri karti varsa ve 10 urunden fazla alirsa %20, yoksa %15 indirim yapin
     * Musteri karti yoksa ve 10 urunden fazla alirsa %15, 10 urunden az
     * alirsa %10 indirim yapin
     */

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Urun adedini giriniz");
        int adet=input.nextInt();
        System.out.println("Urun fiyatini giriniz");
        double fiyat=input.nextDouble();
        double toplamFiyat=adet*fiyat;
        System.out.println("musteri kartiniz varmi?Varsa e yoksa  h giriniz");
        String musteriKarti=input.next();

        if (musteriKarti.equalsIgnoreCase("e")){
            if (adet>10){
                toplamFiyat=toplamFiyat*0.80;
            } else
                toplamFiyat=toplamFiyat*0.85;

            }
        if (musteriKarti.equalsIgnoreCase("h")){
            if (adet>10){
                toplamFiyat*=0.85;
            }else
                toplamFiyat*=0.90;
        }
        System.out.println("toplamFiyat = " + toplamFiyat);


    }





    }


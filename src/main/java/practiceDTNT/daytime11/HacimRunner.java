package practiceDTNT.daytime11;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class HacimRunner {
    public static void main(String[] args) {
        KarePrizma karePrizma =new KarePrizma();
        double karePrizmaHacmi = karePrizma.hacimHesapla(5,6);
        System.out.println("karePrizmaHacmi = " + karePrizmaHacmi);//150.0

        NumberFormat obj = new DecimalFormat(".000");
        Koni koni = new Koni();
        double koniHacmi = koni.hacimHesapla(3,5);//koniHacmi = 47.099999999999994
        System.out.println("koniHacmi = " + koniHacmi);
        System.out.println("koniHacmi = " + obj.format(koniHacmi));//47.10
/*
    NumberFormat classindan bir obje olusturup DecimalFormat(".00")
    yazdigimizda virgulden sonra 2 basamak yazdirir
    NumberFormat classindan bir obje olusturup DecimalFormat(".000") da
    virgulden sonra 3 basamak yazdirir

 */

 /*       Silindir silindir= new Silindir();
        double silindirHacmi=silindir.hacimHesapla(1,5);
        System.out.println("silindirHacmi = " +obj.format(silindirHacmi));//silindirHacmi = 15.70


        System.out.println(silindir.sayi);*/


    }//main

}//class
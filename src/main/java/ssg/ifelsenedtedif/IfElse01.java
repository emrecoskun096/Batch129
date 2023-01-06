package ssg.ifelsenedtedif;

import java.util.Scanner;

public class IfElse01 {
    public static void main(String[] args) {

        // girilen bir karakterin, harf olup olmadigini bulalim

        Scanner input =new Scanner(System.in);
        System.out.println("Lutfen bir karakter giriniz");
        char karakter=input.next().toUpperCase().charAt(0);

        if (karakter>='A' && karakter<='Z'){
            System.out.println("Gridiniz karkater harf dir");

        }else {
            System.out.println("Grdiginiz karkater harf degil dir");
        }

        if ((karakter>='a' && karakter<='z')|| (karakter>='A' && karakter<'Z')){
            System.out.println("Harf");
        }else
            System.out.println("Degil");


        //ıf else ıf
        // Soru 2) Kullanicidan 100 uzerinden notunu isteyin.
// Not'u harf sistemine cevirip yazdirin.
// 50’den kucukse "D",
// =50  <60 arasi "C",
// =60  <80 arasi "B",
// =80’nin uzerinde ise "A"


        System.out.println("Lutfen notunuzu giriniz");

        double notSayi=input.nextDouble();

        if (notSayi <0 || notSayi>100){
            System.out.println("Gecerli bir not Giriniz lutfen .");
        } else if (notSayi<50) {
            System.out.println("Notunuz D");
        } else if (notSayi<60) {
            System.out.println("Notunuz C");
        } else if (notSayi<80) {
            System.out.println("Notunuz B");
        }else {
            System.out.println("Notunuz A");
        }

        // bir kisinin kan bagisinda olup olmadigini control ediniz .
        // yas:18 baslamali
        // kilo : 50 dan ust olmali

        //Yaş ve kilo için iki değişken oluşturma
        int yas =17;
        int kilo= 50;


        if (yas>=18){

            if (kilo>=50){
                System.out.println("Kan bagisnida uygunsunuz");
            }else {
                System.out.println("Kan bagisnda uygun degilsiniz .");
            }
        }else{
            System.out.println("Yasiniz 18 'dan Buyuk Olmali");
        }




         // Eger calisan kadinsa 60 yasindan buyuk oldugunda emekli olabilir,
        // calisan erkekse 65 yasindan buyukse emekli olabilir

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen cinsiyetinizi yaziniz " +
                "\nKadin icin K \nErkek icin E harfini giriniz");
        char cinsiyet = scan.next().toUpperCase().charAt(0);

        System.out.println("Lutfen yazsinizi giriniz");
        int yas1 = scan.nextInt();
        if (cinsiyet == 'K') {

            if (yas < 0 || yas > 120) {
                System.out.println("lutfen girdiginiz yas degerini kontrol edin");
            } else if (yas < 60) {
                System.out.println("emekli olamazsin \nDaha " + (60 - yas) + " yil calisman gerekir");
            } else {
                System.out.println("emekli olabilirsin");
            }

        } else if (cinsiyet == 'E') {
            if (yas < 0 || yas > 120) {
                System.out.println("lutfen girdiginiz yas degerini kontrol edin");
            } else if (yas < 65) {
                System.out.println("emekli olamazsin \nDaha " + (65 - yas) + " yil calisman gerekir");
            } else {
                System.out.println("emekli olabilirsin");
            }

        } else {

            System.out.println("Lutfen Cinsiyet icin gecerli bir Harf giriniz");
        }


    }//
}

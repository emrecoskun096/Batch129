package ssg.sitringmanipultion;

public class C01_stringManipulation {
    /*
   1.replaceAll(): bir grup datayi degistirmek icin
   2.replace():grup olmadan tek bir harf ya da kelimeyi degistirmeyi saglar
   3.toLowerCase()-toUpperCase(): kucuk ve buyuk harfe cevirmeyi saglar
   4.contains(): icerme durumunu kontrol eder
   5.charAt():Stringdeki indexi alir indexler 0'dan baslar
   6.startsWith():cumlenin hangi kelime ya da harfle basladıgını kontrol etmeyi saglar
   7.endsWith(): cumlenin hani kelime ya da harfle sonlandıgını kontrol eder
   8.trim(): basta ve sondaki boslukları siler
   9.lenght(): karakter sayısı
   10.valueOf():String'i double ya da int'e cevirmek icin kullanılır
   11.subString(): ilk indexten 2. indexe kadar karakter almamızı saglar 2. index dahil degildir
   12.indexOf():girilen harf ya da kelimenin kacıncı indexte oldugunu verir
   13.lastIndexOf(): girilen harf ya da kelimenin sondan baslayarak bastan kacıncı indexte oldugu verir
   14.isEmpty():boş mu diye kontrol eder
   15.split(): bir Stringi iki boler
   16.isblank():boşluk var mı diye kontrol eder
   17.equals(): esit mi diye kontrol eder =='den farkı sayisal deger ve char degerlini kontrol edememesi
   18.equalsIgnoreCase(): buyuk kucuk farketmezsiniz esitligi kontrol eder
   19.concat():String degerlerini birlestirme
   ASCII table: karakterlerin sayısal degerlerinin oldugu site



   */
    public static void main(String[] args) {
        String str="Java";
        String str2="jAVA";

        System.out.println(str.equalsIgnoreCase(str2));






    }}

package day01variables;

public class Variables01 {

    public static void main(String[] args) {

        //Variable oluşturmak
        //Java cümlesi   = statement
        //Javada eşittir deme "==".
        //Javada "=" işareti "assigment operattordur.Sağdaki eğeri alır solaki kutuya koyar.
        //Access modifier yazmazsanız access modifier "default" demektir
        //Data Type + Variable Name ==> Variable Declaration
        //Assigment Operatörü(Atama Operatörü)  + Variable Değeri ==> Assigment
        //Eğer Variable Declaration yapar , Assigment yapmazsanız Java kendi değerlerini(default değerler) koyar
        //Default değerler sayılar için sıfırdır.
        //Data type'ni yazınız    Varible ismi yzınız   Atama operatörü    Variable değeri   ingilizcedeki nokta gibi
        int                     age                        =                  13                 ;

        //Ornek 1: Öğrenci ismi için variable oluşturup değer olarak Ali Can atayınız.
        //Stringlere verilen değerler " içinde olmalıdır.
        //Stringler için "default value" "null" dir
        String studentName = "Ali Can";

        /*
           Javada temelde 2 tip data vardır;
           1) primitive data type
           char:tek karakterler için kullanılır. A,X,?,5
           boolean: boolean lar sadececiki farklı değer alabilir.(true,false)
           byte: -128 den 127 e kadar tam sayı değerleri için kullanılır.(1 byte)
           short:-32768 ile 32767 arasındaki tam sayılar için kullanılır.(2 byte)
           int:-2,147,483,648 ile 2,147,483,647 arasındaki sayılar için kullanlır.(4 byte)
           long:-9,223,372,036,854,775,808 ile +9,223,372,036,854,775,807 arasında ki sayılar için(8 byte)
           -float-double
           2)non-primitive data type

         */

        //Ornek: char data typr nde ilk ismin ilk harfi olarak bir variable olusturunuz.Ve bir değer atayımız.
       //char data typende değerler tek tırnak içine konulmalıdır.
        char isminIlkHarfi = 'E';

        //ornek3: boolen data typende emeklimisin için variable olusturun ve false değerini atayın.
        boolean emeklimisin = false;

        //ornek 4 : byte data type nda öğrenci yaşi için bir variable olusturunuz ve deger atsyınız.
        byte ogrenciYasi = 55 ;

        //ornek5: site nüfusu içim variable olusturun ve değer atayınız.
        short siteNufusu = 30000 ;

         //ornek 6: ülke nüfusları için variable olusturup değer ataması yapınız.
        int countryPopulation  = 1200456888 ;

        //ornek7: insan vücudundaki hücre sayısı için variable olusturup değer ataması yapınız
        //note: Bir değer long ise sonuna "L" veya "l" konulur.
        long cellNumberInHumanBody = 84654785555655L ;

        //Eğer long a atadığınız değer int'lerin aralığında ise sonın "L" koymaya gerek yok
        long weightOfSun = 1234567 ;



    }



}

package ssg.passByValueOverloading;
public class C04_overloading {
    public static void main(String[] args) {
        /*
        3 tane carpim isimli method olusturalim 1. methdodda 2 tane int deger carpalim
        2. methodda 1 tane double 1 tane int deger carpalim
        3. methodda 2 tane double deger carpalim
         */
        carpim(10,15);
        carpim(2.0,25);
        carpim(2.0,4.0);


    }

    public static void carpim(double a, double b) {
        System.out.println(a*b);
    }
    public static void carpim(double a,int b){
        System.out.println(a*b);
    }
    public static void carpim(int a,int b){
        System.out.println(a*b);
    }

/*
overloading Javada ayni classta ayni ismde birkac tane method oldugunda icinden en uygun olani
secmesidir buna autoWiding denir
 */


}

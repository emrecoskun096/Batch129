package ssg.overridingPolymorphism;

public class C01_overriding {
    void yazdir(){
        System.out.println("C01 classindaki method calisti");
    }
    static void yazdir(String a){
        System.out.println(a);

    }
    static void yazdir(String b,int a){
        System.out.println(b);
    }void yazdir(int a){

    }void yazdir(int b,String a){

    }
    /*bir classta ayni isme ve ayni body'e sahip methodlar olusturabilirz
    ayni isme ayni parametreye sahip methodlar olusturamayiz
    mutlaka parametreyi degistirmeliyiz
     */
    //farkli classlarda ayni isme ayni parametreye sahip methodlar olusturabilir miyiz?



}
package ssg.overridingPolymorphism;

public class C02_overriding extends C01_overriding {
    void yazdir(){
        System.out.println("C02 classindaki method calisti");
    }

    public static void main(String[] args) {
        C01_overriding obj1=new C02_overriding();
        obj1.yazdir();
        yazdir("Ankara");



    }



}
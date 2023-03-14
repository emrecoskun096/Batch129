package ssg.overridingPolymorphism;

public class C04_bmw extends C03_araba {
    @Override
    void marka() {
        System.out.println("Markamiz BMW");
        super.marka();
    }
    void yakit(){
        System.out.println("benzin");
    }
}
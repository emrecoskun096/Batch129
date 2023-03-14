package ssg.overridingPolymorphism;
public class C05_314 extends C04_bmw {
    @Override
    void model() {
        System.out.println("modelimiz BMW 314");

    }

    @Override
    void motorGucu() {
        System.out.println("2000");
    }


    public static void main(String[] args) {
        C03_araba obj1=new C05_314();
        obj1.motorGucu();//2000
        obj1.model();//modelimiz BMW 314
        obj1.marka();//Markamiz BMW
        obj1.yakit();//benzin





    }
}
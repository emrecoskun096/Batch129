package advence_practice.day08;

public class Matemetik {

    public double carpma(double...x){
        double sonuc=1;
        for (double w : x) {
            sonuc*=w;
        }
        return sonuc;
    }


    public double karesiAl(double x){
        return x*x;
    }
}

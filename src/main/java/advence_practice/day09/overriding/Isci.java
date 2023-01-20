package advence_practice.day09.overriding;

public class Isci extends Banka{

    @Override
    public double faizHesapla(double alinanKredi) {
        return alinanKredi*15/100;
    }
}

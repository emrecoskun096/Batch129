package advence_practice.day09.overriding;

public class Memur extends Banka {
    @Override
    public double faizHesapla(double alinanKredi) {
        return alinanKredi*10/100;
    }
}

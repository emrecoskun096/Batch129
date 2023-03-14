package advence_practice.day11.abstruction_alan_hesaplama;

public class AbstractionRunner {
    public static void main(String[] args) {

        Dikdortgen dikdortgen=new Dikdortgen();
        System.out.println(dikdortgen.alanHesapla(5, 4));
        System.out.println(dikdortgen.alanHesapla(5, 6));

        Ucgen ucgen=new Ucgen();
        System.out.println(ucgen.alanHesapla(5, 4));

    }

}

package hastane_projesi2;

import java.util.Scanner;

public class HastaneRunner {
/*    private static Hastane hastane1 = new Hastane();
    static Scanner input = new Scanner(System.in);

    public HastaneRunner() {
    }

    public static void main(String[] args) {

        String hastaDurumu;
        String unvan;


    }

    public static String doktorUnvan(String aktuelDurum) {
        if (aktuelDurum.equalsIgnoreCase("Allerji)")) {
            return hastane1.unvanlar[0];
        } else if (aktuelDurum.equalsIgnoreCase("Bas agrisi")) {
            return hastane1.unvanlar[1];

        } else if (aktuelDurum.equalsIgnoreCase("Diabet")) {
            return hastane1.unvanlar[2];

        } else if (aktuelDurum.equalsIgnoreCase("Soguk alginligi")) {
            return hastane1.unvanlar[3];
        } else if (aktuelDurum.equalsIgnoreCase("Migren")) {
            return hastane1.unvanlar[4];

        } else if (aktuelDurum.equalsIgnoreCase("Kalp hastaliklari")) {
            return hastane1.unvanlar[5];

        } else
            return "yanlis unvan";

    }

    public static Doktor doktorBul(String unvan) {
        Doktor doktor = new Doktor();
        for (int i = 0; i < unvan.length(); i++) {
            doktor.setIsim(hastane1.doctorIsimleri[i]);
            doktor.setSoyIsim(hastane1.doctorSoyIsimleri[i]);
            doktor.setUnvan(hastane1.unvanlar[i]);


        }
        return doktor;
    }

   public static Durum hastaDurumuBul(String aktuelDurum) {
        Durum hastaDurumu = new Durum();
        switch (aktuelDurum) {
            case " Allerji":
                hastaDurumu.setAciliyet(false);
            case " Bas agrisi":
                hastaDurumu.setAciliyet(false);
            case " Diabet":
                hastaDurumu.setAciliyet(false);
            case " Soguk alginligi":
                hastaDurumu.setAciliyet(false);
            case " Migren":
                hastaDurumu.setAciliyet(true);
            case " Kalp hastaliklari":
                hastaDurumu.setAciliyet(true);
            default:
                System.out.println("Gecerli bir durum degil");


        }
        return hastaDurumu;
    }

    public static Hasta hastaBul(String actualCase) {
        Hasta hasta = new Hasta();

        for (int i = 0; i < hastane1.durumlar.length; i++) {

            if (hastane1.durumlar[i].equalsIgnoreCase(actualCase)) {
                hasta.setHastaID(hastane1.hastaIDleri[i]);
                hasta.setIsim(hastane1.hastaIsimleri[i]);
                hasta.setSoyIsim(hastane1.hastaSoyIsimleri[i]);
                break;
            }

        }
        Durum hastaDurumu = HastaneRunner.hastaDurumuBul(actualCase);
        hasta.setHastaDurumu(hastaDurumu);
        return hasta;
    }
*/
}
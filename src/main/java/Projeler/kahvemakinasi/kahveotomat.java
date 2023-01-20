package Projeler.kahvemakinasi;

import java.util.Objects;
import java.util.Scanner;
public class kahveotomat {
    public static void main(String[] args) {
        String boyut;
        boyut();
        String hangiKahve;
        hangiKahve();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nHangi Kahveyi istersiniz? \nTürk kahvesi  \nFiltre Kahve  \nEspresso");
            hangiKahve = scanner.nextLine().toLowerCase();
            if (hangiKahve.equals("turk kahvesi") || hangiKahve.equals("filtre kahve") || hangiKahve.equals("espresso")) {
                System.out.println(hangiKahve + " kahveniz hazirlaniyor...");
                break;
            } else {
                System.out.println("\nHatali tuslama yaptiniz!!!!!!");
            }
        }
        System.out.println("Sut eklenmesini ister misiniz? \nevet \nhayir");
        String sut = scanner.nextLine().toLowerCase();
        if (sut.equals("evet")) {
            System.out.println("Sut ekleniyor...");
        } else {
            System.out.println("Sut eklenmiyor...");
        }
        System.out.println("Seker eklenmesini ister misiniz? \nevet \nhayir");
        String seker = scanner.nextLine().toLowerCase();
        if (seker.equals("evet")) {
            System.out.println("Kac seker istiyorsunuz");
            int sekerSayisi = scanner.nextInt();
            if (sekerSayisi > 0) {
                System.out.println(sekerSayisi + " seker ekleniyor...");
            }
        } else {
            System.out.println("Seker eklenmiyor...");
        }
        while (true) {
            System.out.println("Hangi boyutta olsun? \nbüyük \norta   \nküçük ");
            boyut = scanner.nextLine().toLowerCase();
            if (boyut.equals("buyuk") ||boyut.equals("orta")  || boyut.equals("kucuk")) {
                System.out.println(boyut + " boy kahveniz hazirlaniyor....");
                break;
            } else {
                System.out.println("\nLutfen kahve boyutunu seciniz...");
            }
        }
        System.out.println(boyut+" boy "+hangiKahve+ " kahveniz hazir...\n\t *** Afiyet olsun ***");
    }
    public static void hangiKahve() {
    }
    public static void boyut() {
    }
}

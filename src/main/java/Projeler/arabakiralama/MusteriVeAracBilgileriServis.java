package Projeler.arabakiralama;
import javax.swing.text.DateFormatter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MusteriVeAracBilgileriServis {

    static List<Arac> aracList = new ArrayList<>();

    public static AracTalebi aracTalep() {
        Scanner inp = new Scanner(System.in);
        System.out.println("Araci hangi sehirden teslim almak istediginizi belirtiniz:");
        String cityTakeOn = inp.nextLine();
        System.out.println("Araci hangi sehirde teslim etmek istediginizi belirtiniz:");
        String cityDelivery = inp.nextLine();
        boolean isValid = false;
        LocalDate dateOfTake;
        LocalDate dateOfDelivery;
        LocalTime timeOfDelivery;

        do {
            isValid = false;
            System.out.println("Araci teslim almak istediginiz tarihi belirtiniz:\n" +
                    "Tarih formatini gun/ay/yil seklinde giriniz");
            dateOfTake = LocalDate.parse(inp.nextLine(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            System.out.println("Araci teslim etmek istediginiz tarihi belirtiniz:\n" +
                    "Tarih formatini gun/ay/yil seklinde giriniz");
            dateOfDelivery = LocalDate.parse(inp.nextLine(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            System.out.println("Araci teslim etmek istediginiz saati belirtiniz:\n" +
                    "Saati; ornegin 16:34 seklinde giriniz");
            timeOfDelivery = LocalTime.parse(inp.nextLine(), DateTimeFormatter.ofPattern("HH:mm"));
            long numberOfDaysToPay = ChronoUnit.DAYS.between(dateOfTake, dateOfDelivery);
            if (numberOfDaysToPay < 0) {
                System.out.println("Teslim gunu, alis gününden daha once olamaz!");
                isValid = true;

            } else if (numberOfDaysToPay == 0) {
                System.out.println("Ayni gun icerisinde alinip teslim edilen araclar icin bir gunluk ucret alinir!");
            }
        } while (isValid);
        return new AracTalebi(cityTakeOn, dateOfTake, dateOfDelivery, timeOfDelivery);
    }

    public static void createVehicle() {
        Arac arac1 = new Arac("Honda", "Civic", "Dizel", "Otomatik", 700.0);
        Arac arac2 = new Arac("Honda", "Accord", "Benzinli", "Manuel", 600.0);
        Arac arac3 = new Arac("Toyota", "Corolla", "Dizel", "Otomatik", 900.0);
        Arac arac4 = new Arac("Lamborgihini", "Aventador", "Benzinli", "Otomatik", 30000.0);
        Arac arac5 = new Arac("Mercedes", "E300", "Dizel", "Otomatik", 1250.0);

        aracList.add(arac1);
        aracList.add(arac2);
        aracList.add(arac3);
        aracList.add(arac4);
        aracList.add(arac5);
    }

    public static void getAraba() {
        System.out.println();
        System.out.println("**********  ONLINE ARAÇ KİRALAMA SİTEMİZE HOŞGELDİNİZ  **********");
        System.out.println();
        System.out.println("************************* ARAC LISTEMIZ *************************");
        System.out.printf("%-12s   %-9s   %-10s   %-10s   %-12s\n", "Marka", "Model", "Yakit Tipi", "Vites Tipi", "Gunluk Ucret");
        System.out.printf("%-12s   %-9s   %-10s   %-10s   %-12s\n", "_____", "_____", "__________", "__________", "____________");
        for (Arac w : aracList) {

            System.out.printf("%-12s   %-9s   %-10s   %-10s   %-12s\n",
                    w.getMarka(), w.getModel(), w.getYakitTipi(), w.getVites(), w.getGunlukUcret());
        }

        Scanner inp = new Scanner(System.in);
        double fiyat = 0;
        boolean isExist = false;
        do {
            System.out.println("Aracin markasini giriniz");
            String make = inp.nextLine();
            System.out.println("Aracin modelini giriniz");
            String model = inp.nextLine();

            for (Arac arac : aracList) {
                if (arac.getMarka().equals(make) && arac.getModel().equals(model)) {
                    System.out.printf("%-12s   %-9s   %-10s   %-10s   %-12s\n", "Marka", "Model", "Yakit Tipi", "Vites Tipi", "Gunluk Ucret");
                    System.out.printf("%-12s   %-9s   %-10s   %-10s   %-12s\n", "_____", "_____", "__________", "__________", "____________");
                    System.out.printf("%-12s   %-9s   %-10s   %-10s   %-12s\n", arac.getMarka(), arac.getModel(),
                            arac.getYakitTipi(), arac.getVites(), arac.getGunlukUcret());
                    fiyat = arac.getGunlukUcret();
                    isExist = true;
                }
            }
            if (!isExist) System.out.println("Flomuzda böyle bir araç mevcut değildir.");
        } while (!isExist);

        AracTalebi aracTalebi = aracTalep();
        long numberOfDaysToPay = ChronoUnit.DAYS.between(aracTalebi.getAlinacakGun(), aracTalebi.getTeslimGunu());
        System.out.println(numberOfDaysToPay + " gün için toplam ödenecek ücret: " + (numberOfDaysToPay * fiyat));
        System.out.println("onay için 1, yeni seçim için 2, çıkış için herhangi bir tuşa basın.");
        String secim = inp.next();
        if (secim.equals("1")) {
            musteriBilgileri();
        } else if (secim.equals("2")) {
            getAraba();
        } else System.out.println("İyi günler.");


    }

    public static void musteriBilgileri() {
        Scanner inp = new Scanner(System.in);
        System.out.println("Adınız Soyadınız:");
        String adSoyad = inp.nextLine();
        System.out.println("TC no:");
        String tcNo = inp.next();
        System.out.println("Yaşınız:");
        String yas = inp.next();
        inp.nextLine();
        System.out.println("Telefon Numaranız:");
        String tel = inp.nextLine();
        System.out.println("Ad-Soyad: " + adSoyad + "\nTC no: " + tcNo + "\nYaş: " + yas + "\nTelefon: " + tel);
        OdemeBilgieri();
    }

    public static void OdemeBilgieri() {
        Scanner inp = new Scanner(System.in);
        System.out.println("Kart Sahibinin Adı-Soyadı");
        String adSoyad = inp.nextLine();
        do {
            System.out.println("Kart Numarası:");
            String kartNo = inp.nextLine();
            if (kartNo.replaceAll(" ", "").length() == 12) break;
            else System.out.println("Kart numarası hatalı.");
        } while (true);
        System.out.println("Son kullanma tarihi: (08/24 şeklinde giriniz)");
        String sonKullanmaTarihi = inp.next();
        System.out.println("Güvenlik Kodu:");
        String guvenlikKodu = inp.next();

        System.out.println("Ödemeniz başarıyla gerçekleşti. İyi günler dileriz.");
    }
}
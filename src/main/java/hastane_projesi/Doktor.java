package hastane_projesi;

import java.util.*;

public class Doktor {


    private String doktorIsim;
    private String doktorSoyisim;
    private String doktorUnvan;


    public String getDoktorIsim() {
        return doktorIsim;
    }

    public void setDoktorIsim(String doktorIsim) {
        this.doktorIsim = doktorIsim;
    }

    public String getDoktorSoyisim() {
        return doktorSoyisim;
    }

    public void setDoktorSoyisim(String doktorSoyisim) {
        this.doktorSoyisim = doktorSoyisim;
    }

    public String getDoktorUnvan() {
        return doktorUnvan;
    }

    public void setDoktorUnvan(String doktorUnvan) {
        this.doktorUnvan = doktorUnvan;
    }

    static Scanner input = new Scanner(System.in);
    static Map<String, String> doktorlarMap = new HashMap<>();


    public static void doktorMenusu() {
        System.out.println("Doktor Menüsü");
        System.out.println("1-Doktor Ekle\n" +
                "2-Doktor Listesi Yazdır\n" +
                "3-Unvandan Doktor Bulma\n" +
                "4-Doktor Silme\n" +
                "5-Ana Menü\n" +
                "6-Çıkış");


        int karar1 = input.nextInt();
        switch (karar1) {
            case 1:
                doktorEkle();
                doktorMenusu();
                break;
            case 2:
                doktorListesiYazdir();
                doktorMenusu();
                break;
            case 3:
                unvandanDoktorbulma();
                doktorMenusu();
                break;
            case 4:
                doktorSilme();
                doktorMenusu();
                break;
            case 5:
                HastaneRunner.showMenu();

            case 6:
                System.out.println("Sistemden cikis yapildi");


        }
    }

    public static void doktorListesi() {
        doktorlarMap.put("Allergist", "Nilson Avery");
        doktorlarMap.put("Norolog", "John Abel");
        doktorlarMap.put("Genel cerrah", "Robert Erik");
        doktorlarMap.put("Cocuk doktoru", "Marry Jacob");
        doktorlarMap.put("Dahiliye", "Alan Pedro");
        doktorlarMap.put("Kardiolog", "Mahesh Tristen");


    }

    public static void doktorListesiYazdir() {
        doktorListesi();

        System.out.println("QA13 Tıp Merkezi Doktor Listesi\n" +
                "===================================================\n" +
                " Unvan    adi  soyadi     ");

        for (Map.Entry<String, String> w : doktorlarMap.entrySet()) {

            String key = w.getKey();
            String value = w.getValue();

            System.out.println(key + ":" + value);


        }


    }


    public static void doktorEkle() {
        doktorListesi();
        System.out.println("Eklemek istediğiniz doktorun unvanını giriniz:");
        input.nextLine();
        String unvan = input.nextLine();

        System.out.println("Eklemek istediğiniz doktorun ismini giriniz:");
        String isim = input.nextLine();
        System.out.println("Eklemek istediğiniz doktorun ismini giriniz:");
        String soyIsim = input.nextLine();

        String isimSoyIsim = isim + " " + soyIsim;

        doktorlarMap.put(unvan, isimSoyIsim);

        System.out.println("Doktor listesine başarılı bir sekilde ile eklendi...");
        System.out.println(doktorlarMap);


    }

    public static void unvandanDoktorbulma() {
        doktorListesi();
        System.out.println("Bulmak istediğiniz doktor unvanını giriniz:");

        String unvanSecimi = input.nextLine();
        input.nextLine();
        boolean unvanVarmi = false;
        for (Map.Entry<String, String> w : doktorlarMap.entrySet()) {

            if (w.getKey().equals(unvanSecimi)) {
                System.out.println(w.getValue());
                unvanVarmi = true;

            }
        }
        if (unvanVarmi == false) {
            System.out.println("gecerli unvan giriniz");
            unvandanDoktorbulma();
        }


    }

    public static void doktorSilme() {
        doktorListesi();

        System.out.println("Silmek istediginiz doktorun unvanini giriniz");
        input.nextLine();
        String doktorUnvan = input.nextLine();


        boolean unvanVarmi = false;

        if (doktorlarMap.containsKey(doktorUnvan)) {

            doktorlarMap.remove(doktorUnvan);
            System.out.println("Doktor basari ile silindi");
            System.out.println("Guncel Doktor Listesi");
            System.out.println(doktorlarMap);
            unvanVarmi = true;

        }

        if (unvanVarmi == false) {
            System.out.println("gecerli unvan girin");
            doktorSilme();

        }

    }
}

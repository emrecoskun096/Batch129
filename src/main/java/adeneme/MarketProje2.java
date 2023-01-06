package adeneme;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class MarketProje2 {
    public static void main(String[] args) {


  /*
====================PROJEMIZ===================================
	 * ilk programa girildiginde bizi bir menu karsilasin bu secenekler
		1 manav,
		2 sarkuteri,
		3 market
		secime gor ,
		4-urunleri listele ve
		5-fiyatlari gelsin
	 *
	 * Basrili Market alış-veriş programı.
		1. Adım:* Ürünler ve fiyatları içeren listeleri oluşturunuz.

			No   Ürün    Fiyat
		     ===== ======= ========
		00 Domates 2.10 TL ,
		01 Patates 3.20 TL ,
		02 Biber 1.50 TL ,
		03 Soğan 2.30 TL  ,
		04 Havuç 3.10 TL
		05 Elma 1.20 TL
		06 Muz 1.90 TL
		"07 Çilek 6.10 TL"
		08 Kavun 4.30 TL
		09 Üzüm 2.70 TL
		10 Limon 0.50 TL
	 *
	 * 2. Adım: Kullanıcının ürün nosuna göre listeden ürün seçmesini isteyiniz.
        * 3. Adım: Kaç kg satın almak istediğini sorunuz.
          4. Adım: Alınacak bu ürünü
	 * sepete ekleyiniz ve Sepeti yazdırınız.
         5. Başka bir ürün alıp almak
	 * istemediğini sorunuz.
         6. Eğer devam etmek istiyorsa yeniden ürün seçme
	 * kısmına yönlendiriniz.
         7. Eğer bitirmek istiyorsa ödeme kısmına geçiniz ve
	 * ödeme sonrasında programı bitiriniz
	 */

        Scanner input = new Scanner(System.in);
        System.out.println("Marketimize hoşgeldiniz!\nLütfen alışveriş yapmak istediğiniz bölüm için numara giriniz:\n" +
                "1-Manav \n" +
                "2-Sarkuteri \n" +
                "3-Market");
        int komut = input.nextInt();
        if (komut == 1) {
            System.out.println("Manav reyonundasınız...\n" +
                    "Sepete eklemek istediğiniz ürünü seçiniz: \n" +
                    "-------------------------------\n" +
                    "Ürün Kodu\tUrun\t\tFiyat\n" +
                    "-------------------------------\n" +
                    "00\t\t\tDomates\t\t2.10 TL\n" +
                    "01\t\t\tPatates\t\t3.20 TL\n" +
                    "02\t\t\tBiber\t\t1.50 TL\n" +
                    "03\t\t\tSoğan\t\t2.30 TL\n" +
                    "04\t\t\tHavuç\t\t3.10 TL\n" +
                    "05\t\t\tElma\t\t1.20 TL\n" +
                    "06\t\t\tMuz\t\t\t1.90 TL\n" +
                    "07\t\t\tÇilek\t\t6.10 TL\n" +
                    "08\t\t\tKavun\t\t4.30 TL\n" +
                    "09\t\t\tÜzüm\t\t2.70 TL\n" +
                    "10\t\t\tLimon\t\t0.50 TL");

            ArrayList<String> ürünler = new ArrayList<>();
            ürünler.add("domates");
            ürünler.add("patates");
            ürünler.add("biber");
            ürünler.add("soğan");
            ürünler.add("havuç");
            ürünler.add("elma");
            ürünler.add("muz");
            ürünler.add("çilek");
            ürünler.add("kavun");
            ürünler.add("üzüm");
            ürünler.add("limon");

            ArrayList<Double> fiyatlar = new ArrayList<>();
            fiyatlar.add(2.10);
            fiyatlar.add(3.20);
            fiyatlar.add(1.50);
            fiyatlar.add(2.30);
            fiyatlar.add(3.10);
            fiyatlar.add(1.20);
            fiyatlar.add(1.90);
            fiyatlar.add(6.10);
            fiyatlar.add(4.30);
            fiyatlar.add(2.70);
            fiyatlar.add(0.50);

            DecimalFormat decimalFormat = new DecimalFormat("0.00");
            ArrayList<String> sepet = new ArrayList<>();
            double toplamFiyat = 0;
            do {
                System.out.println("Almak istediğiniz ürün kodunu girin...");
                int komut2 = input.nextInt();
                String komut2String = String.valueOf(komut2);
                System.out.println("Kaç kg " + ürünler.get(komut2) + " alacaksınız...");
                double komut3 = input.nextDouble();
                System.out.println("Fiyat: " + decimalFormat.format(komut3 * fiyatlar.get(komut2)));
                System.out.println("*****Sepet içeriğiniz*****");
                sepet.add(komut3 + " kg " + ürünler.get(komut2) + " için Fiyat:" + decimalFormat.format(komut3 * fiyatlar.get(komut2)) + " TL");
                System.out.println(sepet);
                toplamFiyat = toplamFiyat + komut3 * fiyatlar.get(komut2);
                System.out.println("Sepet tutarınız: " + decimalFormat.format(toplamFiyat) + " TL");
                System.out.println("*************************");
                System.out.println("Devam etmek istiyor musunuz: Evet veya Hayır");
            } while (input.next().equalsIgnoreCase("Evet"));
            System.out.println("*****Alışverişiniz bitti******");
            System.out.println(sepet);
            System.out.println("Alışveriş tutarınız: " + toplamFiyat);


        }

    }}//


/*
 *
 **
 ***
 ****   */
/*
String yukarıdayken
i=1
j=1
x=*

i=2
j=1
x=**




 */

   /*     for (int i = 1; i <= 4; i++) {
                String x = "";
                for (int j = 1; j <= i; j++) {

                x += "*";
                System.out.print(x);

                }
                System.out.println();


                }   */

package adeneme;

import java.util.ArrayList;
import java.util.Scanner;

public class MarketProje {
    public static void main(String[] args) {  /*
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
        int reyonNo = input.nextInt();

        if (reyonNo == 2) {
            System.out.println("sarkuteri reyonumuz tadilattadir.Manav reyonu icin 1 e basiniz");
            reyonNo = input.nextInt();
        } else if (reyonNo == 3) {
            System.out.println("market reyonu suan kapalidir.***ozur dileriz*** manav reyonu icin 1 e basiniz");
            reyonNo = input.nextInt();
        }


        String[] urunler = {"Domates", "Patates", "Biber", "Soğan", "Havuç", "Elma", "Muz", "Çilek", "Kavun", "Üzüm", "Limon"};
        double[] fiyatlar = {2.10, 3.20, 1.50, 2.30, 3.10, 1.20, 1.90, 6.10, 4.30, 2.70, 0.50};

        ArrayList<String> sepet = new ArrayList<>();
        String baskaUrun;
        double toplamFiyat = 0;
        if (reyonNo == 1) {
            do {
                System.out.println("Urun Kodu\t" + "Urunler\t" + "Fiyat");

                for (int i = 0; i < urunler.length; i++) {

                    System.out.println(("\t" + i + "\t\t" + urunler[i] + "\t" + fiyatlar[i]));
                }


                System.out.println("lutfen alacaginiz urun nosunu giriniz ");
                int urunNo = input.nextInt();
                System.out.println("kac kg "+urunler[urunNo] +" almak istiyorsunuz");
                int kilo = input.nextInt();
                sepet.add(urunler[urunNo]);
                System.out.println("sepetiniz=" + sepet);

                System.out.println("baska urun almak istermisiniz" + "\t" + "devam etmek icin E bitirmek icin H basiniz");
                baskaUrun = input.next();
                toplamFiyat += kilo * fiyatlar[urunNo];

            } while (baskaUrun.equalsIgnoreCase("E"));

            System.out.println("***toplam borcunuz***\n"+  toplamFiyat + " tl");


    }}
}//



   /*     do {

        }while();*/

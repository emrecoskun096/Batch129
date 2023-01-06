package day02datatypesmethodcreation;

public class Variables01 {

    //primitive data types --> char-boolean-byte-short-int-float-double
    //float:virgullu sayilar için kullanılır(decimal Numbers)virgülden sonraki kısmı daha azdır.Ücretlerde fiyatlandırmada kullanılır
    //double:virgullu sayilar için kullanılır(decimal Numbers)

   //Note: primitive data type larını Java oluşturmuştur, biz oluşturamayız
    //Note: primitive data type isimlerinde sadece küçük harf kullanılır.
    //primitive data lar data tpye lara göre memory de farklı farklıı yer kaplarlar
    //prmitive data lar içlerinde sadecec sizin atadığınız değeri barındırır.


    public static void main(String[] args) {

        //ornek1: gömlek ve ayakkabı fiyatları için iki tane variable olusturup toplam fiyatı ekrana yazdırınız.
        //: note: java "decimal Numbers" i otomatik olarak "double"kabul eder
        //       siz data type'ini "float" yazarsanız hata verir
        //float olmsında israr ederseniz sonuna "F" KOYMALISINIZ
        //float memooryde 4 byte double 8 byte yer kaplar
        float shirtPrice = 12.99F ;
        float shoesPrice = 15.89F ;
        // System.out.println() ekrana yazdırır ve "pointerı" bir sonraki satıra koyar.
        //System.out.print(); ekrana yazdırır ve "poınter"ı  aynı satıra koyar.
        System.out.println(shirtPrice + shoesPrice);


        //System.out.println(); yazdirmanin kisa yolu ==> sout yaz entere bas

        //örnek 2: Hücre ağırlığı ve amıp ın agırlığı için iki tane variable olustureun ve ağırlıkları farkını ekrana yazdırın
        double weightCell= 0.000000000000112;
        double weightAmip =0.000000000000023;

        System.out.println(weightCell - weightAmip);

    }

}

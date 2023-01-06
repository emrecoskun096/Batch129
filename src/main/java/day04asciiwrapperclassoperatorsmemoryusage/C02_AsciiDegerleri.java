package day04asciiwrapperclassoperatorsmemoryusage;

public class C02_AsciiDegerleri {
      /*
      ASCII= Amerikan Standart Kodlama Sistemi uluslararasi kabul gormus degerlerdir.
      Klavyemizde kullandigimiz harf ve sembollerin matematiksel karsiligi  char data
      turunde isleme alinirsa o char degerinin Ascii Table'daki karsiligini isleme alir.
      Harf ve sembollere deger atar.
      Karakterlerin cebirsel karsiligini bulmak icin ortaya cikmistir.Cunku bilgisayarda
      hersey 1001001 den olusur. bu yapiya cevirebilmek icin Ascii Table olusturulmustur.
      Buyuk harflerin Ascii degeri kucuk harflerin Ascii degerinden daha kucuktur.

     */

    public static void main(String[] args) {
        // Bir tamsayi ile bir harfi toplayiniz
        int deger = 20;
        char harf = 'a';

        //1.Yol
        int sum =deger+harf;//20+97
        System.out.println("Bir tamsayi ile harfin toplami = "+sum);//117

        //2.Yol
        System.out.println("2.Yol Toplam "+(deger+harf));//117

        char rakam1='1';
        System.out.println("rakam1 = " + rakam1);//1

        char rakam2= '2';
        System.out.println("rakam2 = " + rakam2);//2

        char rakam3='3';
        System.out.println("rakam3 = " + rakam3);//3

        char rakam4='4';
        System.out.println("rakam4 = " + rakam4);//4

        System.out.println(" rakam1+rakam2+rakam3+rakam4 = "+rakam1+rakam2+rakam3+rakam4);//1234
        System.out.println(" rakam1+rakam2+rakam3+rakam4 ASCII toplam = "+(rakam1+rakam2+rakam3+rakam4));//202

        char kh= 'a';
        char bh ='A';
        System.out.println("a'nin Ascii Degeri = "+(kh+0));//97
        System.out.println("A 'ni Ascci degeri = "+(bh+0));// 65

        System.out.println("kh > bh ==> "+(kh>bh));//true Karsilastirma islemlerinin sonucu true yada false doner


        // Herhangi bir karakterin Ascii degerini Hesaplatalim
        //1. YOL
        char space = ' ';
        System.out.println("space'in Ascci degeri = "+(space+0));// 32

        // 2. YOL
        int hrf= 'm';

        // char datat type'larinda Java karaktere int degerde atanabilir
        //Cunku char data type'inin bir resim degeri bir de
        //Ascii'den gelen int degeri vardir.
        //Bu sekilde de Ascii degerini bulabiliriz

        System.out.println("int harf'in Ascii degeri "+hrf);// 109

        //ASCII degerkerinden yararlanarak karsılastırma yapabiliriz

        byte b=125;
        float f=2.45648f;
        long l=54565125511l;
        char ch='h';
        System.out.println(l>ch);
        System.out.println(b<f);




    }

}
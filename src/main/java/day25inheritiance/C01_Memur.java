package day25inheritiance;

public class C01_Memur extends C03_Muhasebe {

    @Override

    /*
    Osman = Obje String gösterimini döndürür.
     Genel olarak, toString metodui,
     bu Objeyi "metinsel olarak temsil eden" bir
     String döndürür. Sonuç, bir kişinin okuması kolay,
     kısa ama bilgilendirici bir sunum olmalıdır.
     Tüm child classs'lar bu yöntemi Override
      önerilir. Object sınıfı için toString yöntemi,
      nesnenin bir örneği olduğu sınıfın adından, "@"
      işareti karakterinden ve nesnenin karma kodunun
      işaretsiz onaltılık gösteriminden oluşan bir String
      döndürür. Başka bir deyişle,
    bu yöntem o değerine eşit bir dize döndürür.
     */
    public String toString() {
        return "C01_Memur{" +
                "saatUcreti=" + saatUcreti +
                ", statu='" + statu + '\'' +
                ", calismaSaati=" + calismaSaati +
                ", isim='" + isim + '\'' +
                ", soyIsim='" + soyIsim + '\'' +
                ", adres='" + adres + '\'' +
                ", telNo='" + telNo + '\'' +
                ", personelNo=" + personelNo +
                '}';
    }

    public static void main(String[] args) {


        C01_Memur memur1 = new C01_Memur();


        //Personel class'i dedemden aldim
        memur1.isim="Osman";
        memur1.soyIsim="Sagir";
        memur1.adres="Izmir";
        memur1.telNo="5333564646";
        memur1.personelNo=1001;


        //Muhasebe baba class'indan aldik
        memur1.calismaSaati=8;
        memur1.saatUcreti=20;
        memur1.statu="Memur";
        System.out.println(memur1);


    }
}
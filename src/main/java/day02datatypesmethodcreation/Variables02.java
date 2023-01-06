package day02datatypesmethodcreation;

public class Variables02 {

    /*
    Non - primitive Data Types : String bir non-primitive data type dir
                                üretilen her bir class ayni zamanda "non- primiticve data type" dır
                                bu yuzden non-primitive lar sinirsiz saıdadır denilebilir
                                non-primitive data type isimleri buyuk hsrfle baslar
                                non-primitive data type ların tamamı için java memoryde aynı mıktarda yer ayirir.

    Interview sorusu: "primitive" ve "non-primitive" data type'ları arasındaki fark nedir?
                      1)"primitive" ler sadece bizim atadığımız değeri içerir,
                        "non primitive"ler bizim atadığımız değer ve methodları içerir.
                      2)"primitive" ler küçük harfle baslaar "non primitive" ler buyuk harfle baslar.
                      3)"primitive"leri java üretmiştir ve 8 tanedir.
                        "non-primitive" leri java ve developer lar üretebilir sinirsiz sayıdadır.
                      4)"primitive" ler memory de data type ına göre yer kaplar
                        "non primitive"ler için java memorde hep aynı buyuklukte yer ayırır.

      */
    public static void main(String[] args) {

        // sehir isimleri için bir variable olusturun ve bir değer atayıp onu ekrana yazdırın.
        String cityName = "Miami";
        System.out.println(cityName);

    }
}

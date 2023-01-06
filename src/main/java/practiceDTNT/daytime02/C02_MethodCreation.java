package practiceDTNT.daytime02;

public class C02_MethodCreation {

    // Dikdortgenin alanini hesaplayan methodu olusturunuz ve kullaniniz
    public static void main(String[] args) {

        //protol alani
        System.out.println(dikdortgenAlani(5, 10));


    }//main 'in body
    /*
            Acces      static   Data     MethodAdi    (parametreler)
            Modifier            type
     */
    public      static  int     dikdortgenAlani (int a,int b){
        //main method static oldugu icin main icindeki herseyin static olmasi gerekir
        //method adi Camel Case kucuk harf baslar sonraki her kelimemnin ilk harfi buyuk olur
        return a*b;  //carpmanin sonucunu kullaniciya ver
    }

}//class
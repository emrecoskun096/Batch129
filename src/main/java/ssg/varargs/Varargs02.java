package ssg.varargs;
public class Varargs02 {
    public static void main(String[] args) {

        // bir ogrnecinin ismi , soyIsmi, sinifi , ve yas icin bir method olsutrun .

        ogrencinBilgileri("Murat" ,"Biyik" ,"AA",23);

        ogrenciniBilgilerYazdir(23,"Bilal","Guney","B");
    }



    public static void ogrenciniBilgilerYazdir(int yas,String ... str){

        for (String w:str){
            System.out.print(w+ " ");// bilal Guey B
        }
        System.out.println("ogrencinin yasi : "+ yas);
    }

    public static void ogrencinBilgileri(String ismi,String soyIsim,String sinif,int yas){
        System.out.println(ismi+" " + soyIsim+ " "+ sinif+ " "+ yas);
    }
}
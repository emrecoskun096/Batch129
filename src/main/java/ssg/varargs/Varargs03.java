package ssg.varargs;

public class Varargs03 {

    public static void main(String[] args) {

        // Kac tane ill ismi verilirse verilsin
        // iclerinden en Uzun olani yazdiran bir method olusturun
        String ill1 = "Adana";//5
        String ill2 = "ankara";
        String ill3 = "Istanbul";
        String ill4 = "Bursa";
        String ill5 = "Van";

        enUzunIllIsmiYazdir(ill1,ill2,ill3,ill4,ill5);
        enUzunIllIsmiYazdir("van","karadeniz","kayseri","kaharmanmaras","galatasaray","muvaffakiyetsizleştiricileştiriveremeyebileceklerimizdenmişsinizcesine");
    }

    public static void enUzunIllIsmiYazdir(String ... str){

        String enUzunIllIsmi="";//0
        for (String w:str){
            if (w.length() >enUzunIllIsmi.length()){
                enUzunIllIsmi=w;
            }
        }
        System.out.println("enUnzunIllismi : " +enUzunIllIsmi);


    }
}
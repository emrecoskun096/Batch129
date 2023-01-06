package day03scanner;

public class Car {
    // Class ==> Variable (Pasif Ozellikler) ==> Object
    //Method (Aktif Ozellikler)
    public  String model= "Corolla";//pasif ozellikler Variable
    public int fiyat = 200000;

    public static void main(String[] args) {

        //Class ismini yazin #Objeye isim verin   =   new keywordunu kullanin  Class ismini ()
        Car                myCorolla          =   new                        Car();
        System.out.println(myCorolla.fiyat);
        System.out.println(myCorolla.model);
        myCorolla.hareket();
        myCorolla.dur();

    }//main'in  bodysi
    public void hareket(){//Aktif ozellikler Methodlar
        System.out.println("Toyota hizli hareket eder...");
    }
    public void dur(){//Aktif ozellikler Methodlar
        System.out.println("Toyota guvenle durur...");
    }

}//Class body'si

/*
 package day03scanner;

 public class Car {

 //Variable'lar olusturalim
 public String model = "Corolla";
 public int fiyat = 20000;

 //Method'lar olusturalim
 //Note: "return type" void oldugunda method icinde "return" kelimesi kullanilmaz
 public void hareket(){
 System.out.println("Corolla hizli hareket eder...");
 }

 public void dur(){
 System.out.println("Corolla guvenli bir sekilde durur...");
 }

 }
 */
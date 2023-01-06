package qa13;

import java.util.Scanner;

public class SoruCozumu3 {
    public static void main(String[] args) {


/*
 Bir String icerisinde yinelenen karakterleri döndüren bir kod yazıniz.(mülakat Sorusu)
           Input :   String str=“Javaisalsoeasy”     Output: a s        (FOR İLE)
 */

  /*  String str = "Javaisalsoeasy";

    String a = "";

        for (int i = 0; i < str.length(); i++) {
            String ch = str.substring(i, i + 1);
            if (str.indexOf(ch) != str.lastIndexOf(ch)) {
                 if(!a.contains(ch)) {
                    a += ch;
                }

            }*/



/*            Scanner input=new Scanner(System.in);
            System.out.println("lutfen iki tam sayi giriniz");
            int sayi1=input.nextInt();
            int sayi2=input.nextInt();

            int gcd=1;
            for (int i = 1; i <=sayi1&& i<=sayi2 ; i++) {

                if (sayi1%i==0&&sayi2%i==0){
                    gcd=i;

                }

            }
            int lcm=(sayi1*sayi2)/gcd;

            System.out.println("gcd = " + gcd);
            System.out.println("lcm = " + lcm);*/



        Scanner input = new Scanner(System.in);

        System.out.println("isminiz ve soy isminizi giriniz");
        String isim = input.nextLine();

        System.out.println("kart bilgilerini giriniz");
        String kart = input.nextLine();


        String gizliIsim = isim.charAt(0) + "**** " +
                isim.substring(isim.indexOf(" ") + 1).charAt(0) + "****";


        String gizliKart = "**** **** **** " + kart.substring(kart.length() - 4);

        System.out.println("Isim-Soyisim: " + gizliIsim);
        System.out.println("Kart-No: " + gizliKart);





    }}
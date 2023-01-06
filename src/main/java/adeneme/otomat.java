package adeneme;

import java.util.*;

public class otomat {

    public static void main(String[] args) {

        String urunler[] = {"browni", "rondo", "kek","Çikolata","Bisküvi","Meyve suyu","Kuru meyve","Chips","Tatlı","Su","Seker",
                "Kraker","Cay","Kahve","Sut"};
        int fiyat[] = {3,2,5,5,4,3,8,10,15,2,5,3,3,6,4};

        List<String> alınan = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        int urun;
        int para = 0;


        do {

            for (int i = 1; i <= urunler.length; i++) {
                System.out.print(i + ". " + urunler[i - 1] + " ");
                for (int j = i; j <= i; j++) {
                    System.out.println(fiyat[j - 1] + " tl");
                }
            }


            System.out.print("Urun seciniz cikmak icin 0 a basiniz: ");
            urun = input.nextInt();
            if (urun == 0) {
                break;
            }

            System.out.println("urun fiyati=" + fiyat[urun - 1]);

            System.out.print("para miktarini giriniz :");
            para = input.nextInt();


            if (para == 1 || para == 5 || para == 10 || para == 20) {
                if (para > fiyat[urun - 1]) {
                    System.out.println("para ustunuz=" + (para - fiyat[urun - 1]) + " tl");
                } else if (para < fiyat[urun - 1]) {
                    System.out.println("eksik para verdiniz " + (fiyat[urun - 1] - para) + " tl ilave ediniz");

                }
                alınan.add(urunler[urun - 1]);

            } else System.out.println("sadece 1,5,10,20 tl gecerlidir");


        } while (true);

        System.out.println(alınan+" aldiniz afiyet olsun");


    }//main
}
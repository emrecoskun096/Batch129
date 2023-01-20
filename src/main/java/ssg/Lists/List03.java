package ssg.Lists;

import java.util.ArrayList;
import java.util.List;

public class List03 {

    public static void main(String[] args) {

        // bir listede ortalamanin ustunde olan element sayisini bulunuz

        List<Double> sayilar = new ArrayList<>();
        sayilar.add(1.0);
        sayilar.add(3.0);
        sayilar.add(5.0);
        sayilar.add(3.0);
        sayilar.add(5.0);
        sayilar.add(6.0);
        sayilar.add(1.0);
        sayilar.add(7.0);// 3.875

        double toplam= 0;
        for (Double w : sayilar) {
            toplam +=w;
        }
        double ortalama = toplam/sayilar.size();
        System.out.println(ortalama);


        List<Double> ortalamaninUstundekiSayilar= new ArrayList<>();

//        for (int i = 0; i <sayilar.size() ; i++) {
//            if (sayilar.get(i) < ortalama){
//                ortalamaninUstundekiSayilar.add(sayilar.get(i));
//            }
//        }

        for (Double w:sayilar){
            if (w>ortalama){
                ortalamaninUstundekiSayilar.add(w);
            }
        }

        System.out.println(ortalamaninUstundekiSayilar);//[5.0, 5.0, 6.0, 7.0]


    }
}
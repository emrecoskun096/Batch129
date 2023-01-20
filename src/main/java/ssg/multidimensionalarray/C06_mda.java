package ssg.multidimensionalarray;


import java.util.Arrays;

public class C06_mda {
    public static void main(String[] args) {
        /*
        soru 6) bir multi-dimensional array olusturun
        ve outer indexlerin inner indexlerini tek tek kontrol edip
        en buyuk degerlerini yazdırın
         */
        int sayilar[][] = {{11, 87, 65, 42}, {2, 7, 6, 9}, {1, 2, 3}};
        for (int i = 0; i < sayilar.length; i++) {
            Arrays.sort(sayilar[i]);
            System.out.println(sayilar[i][sayilar[i].length - 1]);


        }
        System.out.println(Arrays.deepToString(sayilar));


    }}




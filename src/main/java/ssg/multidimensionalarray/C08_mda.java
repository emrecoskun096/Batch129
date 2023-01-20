package ssg.multidimensionalarray;

import java.util.Arrays;

public class C08_mda {
    public static void main(String[] args) {
        /*
        8.soru Verilen multi dimensinional array
        in outer indexini bir soldaki konuma tasiyacak bir program yazin.
         */
        int sayilar[][]={{11,87,65,42},{2,7,6,9},{1,2,3}};

        for (int i = 0; i < sayilar.length; i++) {
            int temp=sayilar[i][0];
            for (int j = 0; j < sayilar[i].length-1; j++) {
                sayilar[i][j]=sayilar[i][j+1];

            }
            sayilar[i][sayilar[i].length-1]=temp;
        }
        System.out.println(Arrays.deepToString(sayilar));





    }
}
package adeneme;

import java.util.*;

public class deneme {
    public static void main(String[] args) {
 /*
1) Array listesindeki 2. en büyük sayıyı bulan Java Kodunu yazınız.

Array: [1232,2345,5467,678,3454,2312,3451]


       int num[] = {1232, 2345, 5467, 678, 3454, 2312, 3451};

        Arrays.sort(num);
        System.out.println(Arrays.toString(num)); //[678, 1232, 2312, 2345, 3451, 3454, 5467]

        System.out.println(num[num.length - 2]);

        int min = num[0];
        int max = num[0];
        int secmax = num[0];

        for (int w : num) {
            if (w < min) {
                min = w;

            } else if (w > max) {
                secmax = max;
                max = w;
            } else if (w > secmax) {
                secmax = w;

            }

        }
        System.out.println("min = " + min);
        System.out.println("max = " + max);
        System.out.println("secmax = " + secmax);

        2.)  Aranan değerin Array içerisinde kaçıncı eleman olduğunu bulan Java Kodu yazınız.
                  Array: [12,15,43,23,56,76,78,90,77,43]
                   Aranan değer:56

        int aranan = 56;

        int arr[] = {12, 15, 43, 23, 56, 76, 78, 90, 77, 43};
        List<Integer> brr = new ArrayList<>();

        for (int w : arr) {
            brr.add(w);
        }
        System.out.println(brr);

        for (Integer w : brr) {
            if (w == aranan) {
                System.out.println(aranan + " sayisi arrayin " + brr.indexOf(w) + ". elemani");
            }
        }
        int aranan1 = 56;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == aranan1) {
                System.out.println(aranan1 + " sayısı arrayin " + i + ". elemanı");
                break;
            }
        }


         3)   Asagidaki multi dimensional array'in ic array'lerindeki tum elemanlarin toplamini
         birer birer bulan ve herbir sonucu yeni bir array'in elemani yapan ve yeni array'i ekrana
         yazdiran bir program yaziniz {{1,2,3}, {4,5}, {6,7}}
         Ornek; {{1,2,3}, {4,5}, {6,7} } ==> 1+2+3=6 4+5=9 6+7=13 ==> output: {6, 9, 13}


        int zrr[][] = {{1, 2, 3}, {4, 5}, {6, 7}};
        int yzz[] = new int[zrr.length];
        int sum = 0;
        int idx = 0;
        for (int[] w : zrr) {
            sum = 0;

            for (int i = 0; i < w.length; i++) {
                sum += w[i];

            }
            yzz[idx] += sum;

            idx++;
        }
        System.out.println(Arrays.toString(yzz));





    4)    Sayinin Mükemmel sayı olup olmadığını kontrol eden Java kodunu yazın.

* Sayının kendisi hariç pozitif bölenlerinin toplamı o sayıya eşitse, herhangi bir sayı Mükemmel Sayı olarak bilinir.

Input :6
Output:
6 Mukemmel Sayidir.


        System.out.println("sayi giriniz");
        int sayi = input.nextInt();
        int toplam = 0;

        for (int i = 1; i < sayi; i++) {
            if (sayi % i == 0) {
                toplam += i;
            }
        }
        if (sayi == toplam) {
            System.out.println("mukemmel sayi");
        } else
            System.out.println("mukemmel degil");*/


        /*
         5)       Kullanicidan toplamak uzere pozitif sayilar isteyin, islemi bitirmek icin 0'a basmasini soyleyin.
                Kullanici yanlislikla negative sayi girerse o sayiyi dikkate almayin ve "Negatif sayi
            giremezsiniz" yazdirip basa donun
             Kullanici O'a bastiginda toplam kac pozitif sayi girdigini, yanlislikla kac negative sayi
           girdigini ve girdigi pozitif sayilarin toplaminin kac oldugunu yazdirin.

         */
        Scanner input = new Scanner(System.in);
        int sayi;
        int toplam = 0;
        int pozitif = 0;
        int negatif = 0;

        do {
            System.out.println("sayi giriniz bitirmek icin 0 a basiniz");
            sayi = input.nextInt();
            if (sayi>0){
                pozitif++;
                toplam+=sayi;

            }else if(sayi<0){
                negatif++;
                System.out.println("negatif sayi giremezsiniz");
            }


        } while (sayi!=0);
        System.out.println("toplam = " + toplam);
        System.out.println("pozitif = " + pozitif);
        System.out.println("negatif = " + negatif);


    }

}

package ssg.passByValueOverloading;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class C02_passByValue {
    public static void main(String[] args) {
        /*
        4 elemanli bir array olusturalim
        bu array'in 2. ve 4. elemanlarini
        100'den kucuk rastgele bir sayi ile degistirelim
        sonra ayri bir method'da ve yeni halini yazdiralim
         */
        int []arr={3,5,6,8};
        System.out.println(arr);//[I@7f63425a
        System.out.println("methoddan onceki hali : "+Arrays.toString(arr));//3,5,6,8
        //elemanDegistir(arr);
        // System.out.println("methoddan sonraki hali ve array degistir methodundan once : "+Arrays.toString(arr));
        arrayDegistir(arr);
        System.out.println("array degistir methodundan sonra : "+Arrays.toString(arr));


    }

    public static void arrayDegistir(int[] arr) {
        arr=new int[3];//[I@79698539
        Random rand=new Random();
        System.out.println(arr);
        arr[0]= 1;
        arr[1]= 2;
        arr[2]= 3;
        System.out.println("arraydegistir methodu icinde : "+Arrays.toString(arr));


    }

    /*public static void elemanDegistir(int[] arr) {
        Random rnd=new Random();
        arr [1]=0;
        arr [3]=11;
        System.out.println("methodun icinde : "+Arrays.toString(arr));

    }

     */
}
package day16multidimensionalarrays;

import java.util.Arrays;

public class C01_MultidimensionalArrays {

    public static void main(String[] args) {

        /*
        Bir Array'in icindeki data yine bir Array ise buna multidimensional Array denir.

         */

        //Multidimensional arrayler nasil olusturulur?
        int arr[][]=new int[3][2];//auter array==> 3
        //inner array = 2 olan bir multidimensional array olusturduk
        //Bu yontemle inner arrayler sabit olmak zorunda
        System.out.println(Arrays.toString(arr));//[[I@67b64c45, [I@4411d970, [I@6442b0a6]
        //Icindeki data non-primitive oldugu icin adresleri gorurum
        System.out.println(Arrays.toString(arr[1]));//[0, 0]
        System.out.println(Arrays.toString(arr[2]));//[0, 0]
        System.out.println(Arrays.deepToString(arr));// MUTIDIMENSIONAL ARRAYLER BU SEKILDE YAZDIRILIR
        //[[0, 0], [0, 0], [0, 0]]

        //Arraylere eleman eklemenin 2.Yontemi ile
        //hem declare edep hemde deger atama yontemi
        int arr2[][]={ {2,3} ,{9} ,{78,6,4,5} };
        System.out.println("Hem declare hemde deger atamasi ile "+Arrays.deepToString(arr2));//[[2, 3], [9], [78, 6, 4, 5]]
        System.out.println("Hem declare hemde deger atamasi 2.index  "+Arrays.toString(arr2[2]));//e [78, 6, 4, 5]
        System.out.println("Hem declare hemde deger atamasi 0.index "+Arrays.toString(arr2[0]));//[2, 3]
        System.out.println("Hem declare hemde deger atamasi 1.index "+Arrays.toString(arr2[1]));//[9]
        //Multidimensional Arraylere eleman nasil eklenir?

        arr[1][0] = 6;
        arr[0][0] = 3;
        arr[0][1] = -4;
        arr[1][1] = 18;
        arr[2][0] = -7;
        arr[2][1] = 0;

        System.out.println(Arrays.deepToString(arr));//[[3, -4], [6, 18], [-7, 0]]
        System.out.println(Arrays.toString(arr[1]));//[6, 18]
        System.out.println(arr[1][0]);//6

        //Ex : String bir Multidimensional Array olusturun
        //Icerisine datalari ekleyin
        //toplam eleman sayisini ekrana yazdirin
        String brr[][] = new String [3][2];
        brr[0][0]="a";
        brr[0][1]="b";

        brr[1][0]="c";
        brr[1][1]="d";

        brr[2][0]="e";
        brr[2][1]="f";
        System.out.println(Arrays.deepToString(brr));//[[a, b], [c, d], [e, f ]]

        int sum=0;//toplam kac daire oldugu bilgisi burada

        for (String[] w :       brr) {    // w=each(her bir) w=Array
            sum=sum+ w.length;

        }//for
        System.out.println(sum);//6
    }
}

package day16multidimensionalarrays;

public class C03_MultidimensionalArrays {

    // Soru 1 ) Asagidaki multi dimensional array’in
    // tum elemanlarinin carpimini ekrana yazdiran bir method yaziniz.
    public static void main(String[] args) {
        int arr[][] = {{1, 2, 3}, {4, 5, 6}};
        carpimYazdir(arr);
    }//main

    private static void carpimYazdir(int[][] arr) {

        int carpim=1;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0;  j<arr[i].length; j++){
                carpim*=arr[i][j] ;                   //  carpim = carpim * arr[i][j] ;
            }
        }
        System.out.println(carpim);//720



    }//carpim yazdir()
}//class

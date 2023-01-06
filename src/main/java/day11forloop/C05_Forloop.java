package day11forloop;

import java.util.Scanner;

public class C05_Forloop {

    public static void main(String[] args) {
        // 5'den 10'a kadar tamsayilarin toplamini bulan kodu yaziniz

        /*

           5    6   7   8   9   10
         */

        int sum= 0;

        for (int i = 5; i <11 ;                 i++) {
            sum=sum+i;
        }
        System.out.println("5'den 10'a kadar sum : "+sum);


        // 6'dan 3'e kadar olan tamsayilarin carpimini bulan kodu yaziniz

        int multiply = 1;

        for (int i = 6 ; i >2 ; i--) {
            multiply=multiply*i;
        }//for
        System.out.println("Multiply : "+multiply);//Multiply : 360

        //Bir tamsayinin rakamlarinin toplamini yazan kodu olusturunuz
        //2543 ==>2+5+4+3=14

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir tamsayi giriniz");
        int num = input.nextInt();
        num = Math.abs(num);

        int sonuc = 0;
        for (int i = num;     i >0 ;                            i=i/10) {
            sonuc=sonuc+i%10;

        }//for
        System.out.println(sonuc);


    }//main
}//class
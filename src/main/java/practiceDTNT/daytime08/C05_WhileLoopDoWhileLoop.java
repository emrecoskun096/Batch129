package practiceDTNT.daytime08;


public class C05_WhileLoopDoWhileLoop {

    public static void main(String[] args) {


        // 0'dan baslayip 6'ya kadar 1'er 1'er artarak yardiran kodu olusturunuz


        int i=0;

        while (i<3){


            System.out.print("i = " + i+" ");
            i++;
        }
        System.out.println();

        int b=0;

        do {
            System.out.print("b = "+b+" ");
            b++;
        }while (b<3);//kontrol en sonda yapildi


    }
}
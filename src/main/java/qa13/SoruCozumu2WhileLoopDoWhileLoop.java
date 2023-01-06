package qa13;

public class SoruCozumu2WhileLoopDoWhileLoop {
    public static void main(String[] args) {

        //example 1:   1 den 10 a kadar olan çift sayiarin tooplamini yapan kodu yaziniz.


        int toplam=0;

        for (int i = 1; i <11 ; i++) {
            if(i%2==0){

                toplam+=i;

            }

        }
        System.out.println("1 den 10 a kadar cift sayilarin top="+toplam);

        int top=0;
        int k=0;
        while (k<11){
            if (k%2==0){
                top+=k;


            }



            k++;
        }System.out.println(top);


        int sum=0;
        int z=1;
        do {
            if(z%2==0){
                sum+=z;


            }


            z++;
        }while(z<11);



        //example1:  3 basamakli 4 ve 6 ya bolunen sayma sayilarini buyukten kucuge siralayiniz.while ile

         int tp= 0;
        int counter=0;
        int y=999;
        while (y>=100){

            if(y%4==0 && y%6==0){
                System.out.print(y+" ");




             counter++;
            }

            y--;
        }
        System.out.println();
        System.out.println("4 ve 6 ya blunen "+counter+" sayi var");










































    }//main
}//class

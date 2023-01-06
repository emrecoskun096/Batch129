package ssg.nestedloop2;

public class NestedLoop04 {
    // soru 6 Asagidaki sekil cizen kodu yaziniz
    /*

     *
     * *
     * * *
     * * * *
     * * * * *
     * * * *
     * * *
     * *
     *


     */

    public static void main(String[] args) {

        int input =5;
        for (int i = 1; i <=5 ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
        for (int i = 1; i <=5 ; i++) {
            for (int j = 1; j <=input ; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }



//        for (int i=1; i<6; i++){
//            System.out.print("*"+" ");
//
//            for (int j =4; j>i; j--){
//                System.out.print("*"+" ");
//            }
//            System.out.println();
//        }


//        System.out.println();
//        for (int i = 1; i < 6; i++) {
//            for (int j = 0; j < i; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }


        for (int p = 0; p < 5; p++) {
            for (int m = 4; m > p; m--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }






}
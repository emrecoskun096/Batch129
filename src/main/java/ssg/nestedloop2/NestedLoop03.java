package ssg.nestedloop2;

public class NestedLoop03 {
    public static void main(String[] args) {

        /*
        Soru 2 ) Kullanicidan pozitif bir rakam girmesini isteyin ve girilen rakama gore asagidaki sekli cizdirin
         *
         * *
         * * *
         * * * *
         * * * * *
         */
  //      nested for loop ya diktorgen veya Ucgen formatinda olabilir
  //      diktorgen istedigimizde iki loop icin de bagimsiz en point belirleriz
  //      Ucgen sekli vermek icin inner loop’un end point’ini olarak outer degiskene bagli yapariz

  /*      for (int i = 1; i <=5 ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("*"+" ");
            }
            System.out.println();   */

/*Soru 3) Kullanicidan pozitif bir rakam girmesini isteyin ve girilen rakama gore asagidaki sekli cizdirin
        1
        22
        333
        4444
        55555
        */

        for (int i = 1; i <=5 ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(i);
            }
            System.out.println();
        }









    }

}

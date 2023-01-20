package ssg.multidimensionalarray;
public class C02_mda {
    public static void main(String[] args) {
        /*
        soru 2) verilen bir multi-dimensional array in
        tum elementlerini yazdiran bir method olusturun
         */
        int sayilar [][]={{0,1,2,3},{4,5,6}};

        elementYazdir(sayilar);


    }public static void elementYazdir(int [][]sayilar){
        for (int i = 0; i < sayilar.length ; i++) {
            for (int j = 0; j < sayilar[i].length; j++) {
                System.out.println(sayilar[i][j]);

            }

        }


    }
}
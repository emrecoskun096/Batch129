package ssg.multidimensionalarray;

public class C07_mda {
    /*
    soru 7) //Verilen bir multi dimensional array'in
    inner indexindeki elementlerinin ortalamasından büyük elementleri
    yazdıran bir kod yazınız.
     */
    public static void main(String[] args) {
        int sayilar[][] = {{11, 87, 65, 42}, {2, 7, 6, 9}, {1, 2, 3}};
        int ort = 0;
        int sum = 0;
        for (int i = 0; i < sayilar.length; i++) {
            for (int j = 0; j < sayilar[i].length; j++) {
                sum += sayilar[i][j];
                ort = sum / sayilar[i].length;


            }
            for (int j = 0; j < sayilar[i].length; j++) {
                if (ort < sayilar[i][j]) {
                    System.out.println(sayilar[i][j]);
                }

            }
            sum = 0;
            ort = 0;


        }
    }
    }



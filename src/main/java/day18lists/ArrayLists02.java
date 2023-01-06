package day18lists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayLists02 {

    public static void main(String[] args) {
        // Verilen bir Listteki elemanlari tekrarsiz olarak yazdirma

        List<Integer> a = new ArrayList<>();
        a.add(2);
        a.add(3);
        a.add(2);
        a.add(2);
        a.add(5);
        System.out.println("a = " + a);  //a = [2, 3, 2, 2, 5]

        List<Integer> yeniList = new ArrayList<>();
        //[2, 3, 2, 2, 5]
        for (Integer w : a) {
            if(!yeniList.contains(w)){
                yeniList.add(w);
            }
        }
        System.out.println("yeniList = " + yeniList);


        //Example 2: Musterinizin istedigi urunun stoklarinizda olup olmadigini
        //gosteren kodu yaziniz.
        //Stokta varsa o urunu "Ayrildi" ya ceviriniz yoksa o urunu  List'e ekleyiniz
        //           [A, K, R, S]  ==> R  ==> [A, K, Ayrildi, S]
        //           [A, K, R, S]  ==> X  ==> [A, K, R, S, X]

        Scanner input= new Scanner(System.in);
        List<String> c = new ArrayList<>();
        c.add("A");
        c.add("K");
        c.add("R");
        c.add("S");
        System.out.println("c = " + c);//c = [A, K, R, S]
        String urun ="";

        do {
            System.out.println("Lutfen istediginiz urunun harfini giriniz");
            urun= input.next().substring(0,1);

            if(c.contains(urun)){
                c.set(c.indexOf(urun),"Ayrildi");

            }else if(!urun.equals("Q")){
                c.add(urun);
            }
            System.out.println(c);

        }while (!urun.equals("Q"));
    }
}
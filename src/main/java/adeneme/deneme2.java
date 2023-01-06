package adeneme;

import java.lang.reflect.Array;
import java.util.*;

public class deneme2 {
    public static void main(String[] args) {
//iç arraylerinde ayni indekse sahip elemanlarin toplami
        int arr[][] = {{1, 2,}, {3, 4, 5}, {6}};
        int brr[][] = {{7, 8, 9}, {10, 11}, {12}};

/*
Kullanıcıdan bir isim ve bir karakter girmesini isteyin, ardından döngüleri kullanarak karakterin isimde kaç kez tekrarlandığını kontrol edin.
 char ch1= 'a' ;
String name =“John came late"
Expected Output: Number of a = 2
    */
        Scanner input = new Scanner(System.in);
        System.out.println("isim giriniz");
        String name = input.nextLine();
        System.out.println("karakter giriniz");
        String karakter = input.next();

        char ch = 'a';
        int counter = 0;
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == ch) {
                counter++;

            }

        }
        System.out.println(ch + " " + counter + " defa geciyor");


        String str = "Javaisalsoeasy";
        String tekrarli = "";
        for (int i = 0; i < str.length(); i++) {
            String ch1 = str.substring(i, i + 1);
            if (str.indexOf(ch1) != str.lastIndexOf(ch1)) {
                if (!tekrarli.contains(ch1)) {
                    tekrarli += ch1 + " ";
                }
            }
        }System.out.println(tekrarli);

        }//
    }

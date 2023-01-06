package advence_practice.day01;

import java.util.Scanner;

public class Q02_Variables_Hipotenus {
    public static void main(String[] args) {
        //Hipotenüs hesaplayan bir kod yazınız.
                Scanner input = new Scanner(System.in);
                System.out.println("1. dik kenar uzunlugunu giriniz.");
                int a = input.nextInt();
                System.out.println("2. dik kenar uzunlugunu giriniz.");
                int b = input.nextInt();

                double hipotenus = Math.sqrt(a*a+b*b);
                System.out.println("Hipotenus = " + hipotenus);


    }
}

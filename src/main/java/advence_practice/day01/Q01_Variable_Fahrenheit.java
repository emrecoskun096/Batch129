package advence_practice.day01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Q01_Variable_Fahrenheit {
    public static void main(String[] args) {

        // Fahrenheit değeri, Celsius değere çeviren kod yazınız.
        // formül: c = (f-32)*5/9

            Scanner input = new Scanner(System.in);
            System.out.println("Fahrenheit degeri giriniz.");
            double f = input.nextDouble();
            double c = (f - 32) * 5 / 9;
            System.out.println("Celcius: " + c);

            DecimalFormat format = new DecimalFormat("0.00");
            String formattedCelcius = format.format(c);
            System.out.println("formattedCelcius = " + formattedCelcius);

            //2.yol //System.out.printf("Formatli:  " + "%.2f",c);


    }
}

package advence_practice.day11;

import java.io.*;

public class TextOkumaYazma {
    //Bir text dosyasındaki her satırın kelime sayısını o dosyada her satırın sonuna yazdıran bir kod yazınız.

    public static void main(String[] args) throws IOException {
        // FileInputStream ile de yapilabilir.
        FileReader fr = new FileReader("C:/Users/SAMSUNG/Desktop/HelloWorld.txt");
        BufferedReader br = new BufferedReader(fr);
        String satir = br.readLine();

        String yeniDosya = "";

        while (satir != null) {

            yeniDosya += satir + "==>Satir kelime sayisi: " + satir.split(" ").length +"\n";
            satir = br.readLine();
        }
        System.out.println("yeniDosya = " + yeniDosya);
        br.close();

        FileWriter writer=new FileWriter("C:/Users/SAMSUNG/Desktop/HelloWorld.txt");
        writer.write(yeniDosya);
        writer.close();
    }
}

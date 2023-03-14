package hastane_projesi;

import java.util.Scanner;

public class HastaneRunner {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {


        showMenu();
    }

    public static void showMenu() {
        System.out.println("======QA13 TIP MERKEZİMİZE HOŞGELDİNİZ======");
        System.out.println("Yapmak istediğiniz işlemi seçiniz:");
        System.out.println("Doktor menüsü için 1'e\n" +
                "Hasta menüsü için 2'ye\n" +
                "Çıkış için 0'a basınız");
        int karar1 = input.nextInt();

        switch (karar1){
            case 1:
                Doktor.doktorMenusu();
                break;
            case 2:

            case 0:
                System.out.println("Tekrar bekleriz...");
            default:

        }
    }
}


package practiceDTNT.daytime14;
public class Runner {


    private static Hastane hastane = new Hastane();


    public static void main(String[] args) {

        String hastaDurumu = "Bas agrisi";
        String unvan = "Kalp Doktoru";
        String doktorBul="";



        System.out.println("Doktor ismi: " + hastane.getDoktor().getIsim());
        System.out.println("Doktor soy isim: " + hastane.getDoktor().getSoyIsim());
        System.out.println("Doktor unvani: " + hastane.getDoktor().getUnvan());

    }
    public  static void doktorBul(){

    }



}
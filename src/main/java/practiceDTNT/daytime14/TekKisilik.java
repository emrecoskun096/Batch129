package practiceDTNT.daytime14;

public class TekKisilik extends Otel{
    public static void main(String[] args) {
        TekKisilik musteri1 = new TekKisilik();
        System.out.println("musteri1 TV ucreti : "+musteri1.tv(5)+"$");

    }//main

    @Override
    public void kahvalti() {
        System.out.println("Sadece Sadwich");
    }

    public int tv(int saat){
        return saat*2; //saati 2 dolar
    }
}
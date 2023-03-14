package ssg.encapsulation;

public class ArabaRunner {
    public static void main(String[] args) {
        Araba arb1=new Araba();
        //arb1 objesi uzerinden marka variable'ina
        //ulasabildik, degistirebildik ve yazdirabildik
        arb1.marka="fiat";
        System.out.println(arb1.marka);
        //access modifier kullanarak marka variable'nia ulasabildik
        //yani access modifier ya hep ya hiç kullanir
        //tamamen serbest birakir ya da tamamen engeller

        //yakit turu degistirilemesin ama gorebileyim
        //model'i goremeyeyim ama degistirebileyim
        arb1.setModel("egea");//model olarak egea'yi atadik
        //model'i yazdirma imkanimiz yok cunku getter method'u yok
        System.out.println(arb1.getYakit());//yakit bilgisine ulastik
        //yakit turunu degistirme imkanimiz yok cunku setter method'u yok



    }
}
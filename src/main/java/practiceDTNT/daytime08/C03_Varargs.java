package practiceDTNT.daytime08;
public class C03_Varargs {

    public static void main(String[] args) {
        // Kac tane String verilirse verilsin
        // iclerinden en uzun olani yazdiran bir method olusturun
        String str1 = "Ali";
        String str2 = "Veli";
        String str3 = "Okan";
        String str4 = "Adnan";
        String str5 = "Sahsanem";

        enUzunIsim(str1, str2, str3, str4, str5);
    }//main

    private static void enUzunIsim(String... str) {
        String enUzunStr="";

        for ( String w :str
        ) {

            if(w.length()>enUzunStr.length()){
                enUzunStr=w;
            }
        }//foreach
        System.out.println("enUzunStr = " + enUzunStr);//Sahsanem

    }//method
}//class
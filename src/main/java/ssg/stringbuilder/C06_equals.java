package ssg.stringbuilder;

public class C06_equals {
    public static void main(String[] args) {
        String str="Java";
        StringBuilder sb1=new StringBuilder("Java");
        StringBuilder sb2=new StringBuilder("Java");

        System.out.println(sb1.equals(sb2));//false == gibi davranir
        System.out.println(sb1.equals(sb1));//true
        System.out.println(sb1.toString().equals(str));//true

        System.out.println(sb1.compareTo(sb2));

        /*
		compareTo() iki stringBuilder'i bastan baslayarak harf harf karsilastirir
        ilk harf ayni ise, ikincisine gecer
        ikinciler ayni ise 3.lere gecer ve ilk farkli olan harfe kadar gider
        farkli olan iki harfin ascii kodlari arasindaki farki verir
		cikti 0 ise iki stringBuilder ayni degerlere sahiptir
        */


    }
}
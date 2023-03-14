package ssg.stringbuilder;

public class C03_reverse {
    public static void main(String[] args) {
        //soru 3) verilen bir input'u tersine cevirip,
        //        donduren bir method olusturun
        StringBuilder sb=new StringBuilder("Java cok guzeldir");
        sb.reverse();
        System.out.println(sb);
        String str="java cok guzeldir";
        terscevir(str);






    }

    public static String terscevir(String str) {
        StringBuilder sb1=new StringBuilder(str);
        sb1.reverse();
        System.out.println(sb1);


        return sb1.toString();

    }
}
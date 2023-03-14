package ssg.stringbuilder;

public class C01_stringBuilder {
    public static void main(String[] args) {
        //soru 1) StringBuilder olusturma yontemlerine bakiniz.
        StringBuilder sb1=new StringBuilder();
        StringBuilder sb2=new StringBuilder("kedi, kopek");
        StringBuilder sb3=new StringBuilder(7);


        System.out.println(sb1.capacity());//16
        System.out.println(sb1.length());//0

        sb1.append("at");
        System.out.println(sb1.capacity());//16


        System.out.println(sb2.capacity());//27
        System.out.println(sb2.length());//11
        sb2.append("at");
        System.out.println(sb2.capacity());//27



        System.out.println(sb3.capacity());//7
        System.out.println(sb3.length());//0
        sb3.append("12345678");
        System.out.println(sb3.capacity());//16
        sb3.append("omer faruk akyol");
        System.out.println(sb3.capacity());//34



    }
}
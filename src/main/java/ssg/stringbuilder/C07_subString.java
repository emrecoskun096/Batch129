package ssg.stringbuilder;
public class C07_subString {
    public static void main(String[] args) {
        StringBuilder sb1=new StringBuilder("dunya cok guzel");
        System.out.println(sb1.substring(0, 5));
        System.out.println(sb1.subSequence(6, 9));
        System.out.println(sb1.substring(9));


    }
}
package ssg.stringbuilder;

public class C05_indexOf {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("Java cok guzeldir a");
        System.out.println(sb.indexOf("a",5));//
        sb.replace(0,8,"java cok");
        System.out.println(sb);
        sb.setCharAt(18,'!');
        System.out.println(sb);


    }
}
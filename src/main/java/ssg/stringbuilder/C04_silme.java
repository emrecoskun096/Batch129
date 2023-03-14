package ssg.stringbuilder;

public class C04_silme {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("hava cok guzel");
        sb.delete(5,8);
        System.out.println(sb);
        sb.deleteCharAt(4);
        System.out.println(sb);
        sb.delete(0,sb.length());
        System.out.println(sb);
        sb.append(1);
        System.out.println(sb);


    }
}
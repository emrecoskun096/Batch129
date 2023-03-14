package ssg.stringbuilder;

public class C02_ekleme {
    public static void main(String[] args) {
        //soru 2)StringBuilder Classindaki ekleme methodlarina bakiniz
        StringBuilder sb=new StringBuilder("java guzeldir");
        sb.append("! java cok guzeldir ",0,1);
        sb.insert(4," cok");

        System.out.println(sb);


    }
}
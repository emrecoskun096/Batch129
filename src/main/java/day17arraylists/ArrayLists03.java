package day17arraylists;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists03 {
    public static void main(String[] args) {


        List<String> cities = new ArrayList<>();
        cities.add("Miami");
        cities.add("Istanbul");
        cities.add("Kayseri");
        cities.add("Almaty");
        cities.add("Kayseri");
        System.out.println(cities);//[Miami, Istanbul, Kayseri, Almaty, Kayseri]

        //remove() methodu index ile kullanilirsa o index'te ki elemani siler.
        //remove() methodu index ile kullanilirsa size sildigi elemani verir.
        String n = cities.remove(1);
        System.out.println(n);//Istanbul
        System.out.println(cities);//[Miami, Kayseri, Almaty, Kayseri]

        //remove() methodu eleman ile kullanilirsa ilk gorunumu siler.
        //remove() methodu eleman ile kullanilirsa size o elemani silip silmedigini ifade eden
        //true veya false verir.
        //Eger eleman List'te var ise o elemani siler ve size true der.
        //Eger eleman List'te yok ise o elemani silemediginden  size false der.
        boolean p = cities.remove("Kayseri");
        System.out.println(p);//true
        System.out.println(cities);//[Miami, Almaty, Kayseri]



    }//
}
/*
package main.java.day17arraylists;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists03 {
    public static void main(String[] args) {
        List<String> cities = new ArrayList<>();
        cities.add("Miami");
        cities.add("Istanbul");
        cities.add("Kayseri");
        cities.add("Almaty");
        cities.add("Kayseri");
        System.out.println(cities);//[Miami, Istanbul, Kayseri, Almaty, Kayseri]


        String n = cities.remove(1);
        //remove() methodu index ile kullanilirsa o index'te ki elemani siler.

        System.out.println(n);//Istanbul  sildigi elemani gosterir Istanbul'u sildim
        //remove() methodu index ile kullanilirsa yazdirildiginda sildigi elemani verir.
        System.out.println(cities);//[Miami, Kayseri, Almaty, Kayseri]
        /*
         remove() methodu eleman ile kullanilirsa size o elemani silip silmedigini ifade eden
         true veya false verir.
         remove() methodu eleman ile kullanilirsa ilk gorunumu siler.
         Eger eleman List'te var ise o elemani siler ve size true der.
         Eger eleman List'te yok ise o elemani silemediginden  size false der.

         */

 /*   boolean p = cities.remove("Kayseri");
        System.out.println(p);//true

                boolean s = cities.remove("Kayseriye");
                System.out.println(s);//false
                System.out.println(cities);//[Miami, Almaty, Kayseri]
                }
                }*/
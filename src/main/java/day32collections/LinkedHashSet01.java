package day32collections;

import java.util.LinkedHashSet;

public class LinkedHashSet01 {
    public static void main(String[] args) {


//LinkedHashSet olusturma
        LinkedHashSet<String> artist = new LinkedHashSet<>();

        artist.add("Ajda");
        artist.add("Tom");
        artist.add("Brad");
        artist.add("Angelina");
        //"Set"ler tekarsiz elaman icerirler.
        //Siz ayni elemani tekrar tekrar eklerseniz java hata vermez, ama tekrarli elemani "Set"e sadece bir kere koyar.
        artist.add("Tom");

        System.out.println(artist);//[Ajda, Tom, Brad, Angelina]

        LinkedHashSet<String> actress = new LinkedHashSet<>();
        actress.add("Ajda");
        actress.add("Angelina");

        artist.removeAll(actress);
        System.out.println(artist);//[Tom, Brad]


    }

}

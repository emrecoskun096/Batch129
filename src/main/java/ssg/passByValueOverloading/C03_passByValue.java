package ssg.passByValueOverloading;
import java.util.ArrayList;
import java.util.List;

public class C03_passByValue {
    public static void main(String[] args) {
        /*
        bir list olusturalim iki ayri method'
         birinde sadece elemanlari degistirelim
        digerinde yeni bir list atayip,
         ayni sayida yeni eleman ekleyelim
        ve her iki method call'dan sonra kendi listemizi
         main method icerisinde kontrol edelim.
         */
        List<Integer>myList=new ArrayList<>();
        myList.add(8);
        myList.add(10);
        myList.add(12);
        System.out.println("eleman degistirme methodundan once : "+myList);//8,10,12
        elemanDegistir(myList);
        System.out.println("eleman degistir methodundan sonra : "+myList);//10,15
    }
    public static void elemanDegistir(List<Integer> myList) {
        myList.set(0,10);
        myList.set(1,15);
        myList.set(2,20);
        System.out.println(myList);//10,15,20
        myList.remove(2);
        System.out.println(myList);//15,15,0
        myList=new ArrayList<>();
        myList.add(7);
        myList.add(9);
        System.out.println(myList);//7,9

    }
}
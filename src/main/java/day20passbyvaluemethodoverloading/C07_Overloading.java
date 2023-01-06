package day20passbyvaluemethodoverloading;
public class C07_Overloading {
    public static void main(String[] args) {

        /*
        AYNI ISIMDE AYNI CLASSTA BIRDEN FAZLA METHOD OLUSTURABILIRMIYIZ ?
        Java ayni ismde ayni class'ta birden fazla method oldugunda
        icerisindeki Data type'ina , data sayisina ya da yerlerine gore
        en uygun olani secer.Eger bir classta isimleri ayni data typelari
        farkli metodlar olusturusak buna Method Overloading denir.
        Java hangi methodu kullanacagina karar verirken optimizasyona gider .
        En uygun olani en az AutoWidinig gerektireni secer




         */
        String str="Java ile guzel Dunya";
        System.out.println(str.substring(2));//va ile guzel Dunya
        System.out.println(str.replace("Java", "*"));//* ile guzel Dunya
        System.out.println(str.replace('J', '*'));//*ava ile guzel Dunya

        topla(3,5);//1
        topla(8.6,5);//2
        topla(2.4,6.8);//3
        //42-45.satiri kapatirsak
        // (3,5) girersek 33.ve 37.satirdaki methodlar arasinda secim yapamaz ve hata verir
        //Cunku her ikisinde de bir casting'e ihtiyac vardir.Java hangisini sececegini bilemez
        // ve kodu calistirmaz


    }//main
    private static void topla(double a, double b) {   //3
        System.out.println("iki double calisti "+(a+b));

    }
    private static void topla(double a, int b) {//2
        System.out.println("double,int calisti "+(a+b));

    }

    private static void topla(int a, int b) {   //1
        System.out.println("int, int calisti "+a+b);

    }
}
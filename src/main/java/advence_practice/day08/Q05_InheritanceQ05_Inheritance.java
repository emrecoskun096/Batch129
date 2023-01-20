package advence_practice.day08;

public class Q05_InheritanceQ05_Inheritance {

    public static void main(String[] args) {

        daireAlani(5);


    }

    static void daireAlani(int r) {
        Daire daireObj = new Daire();
        System.out.println(daireObj.carpma(daireObj.piSayisi, daireObj.karesiAl(r)));
    }
}

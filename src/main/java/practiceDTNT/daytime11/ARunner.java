package practiceDTNT.daytime11;
public class ARunner {


    public static void main(String[] args) {

        B b =new B();
        b.m();//Bad
        System.out.println(b.x);//20

        C c = new C();
        c.m();//Bad
        System.out.println(c.x);//10

        C d = new C();
        d.m();//Good
        System.out.println(d.x);//10

        D child = new D();
        System.out.println(child.x);//20
        System.out.println(child.sayi);//50
        child.m();//Bad

        C bebek=new D();
        System.out.println(bebek.x);//10
        bebek.m();//Bad



    }//main

}
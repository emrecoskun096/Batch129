package ssg.varargs;
public class Varargs01 {

    public static int x=14;


    public static void main(String[] args) {

        // birdan fazla sayilarin tolyan bi method olsutrun ...?

        add(3);
        add(3,4);
        add(5,6,7);
        add(5,6,7,8,9,10,19);

        System.out.println(x);
    }

    public static void add(int... a){
        int sum=0;
        for (int w: a){
            sum +=w;  // sum=sum+w
        }
        System.out.println(sum);

    }



}
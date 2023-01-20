package ssg.varargs;
public class NoVarargs01 {

    public static void main(String[] args) {

        // iki saynin toplyan bir method olsutrun

        ucSayiToplyanMethod(4,7,8);// 3 arguments
        ikiSayiToplyanMethod(5,7);// arguments
        display();// zero arguments

    }

    public static void ikiSayiToplyanMethod(int a , int b){// iki paremterli ..

        System.out.println(a + b);
    }
    public static void ucSayiToplyanMethod(int a , int b,int c){// iki paremterli ..

        System.out.println(a + b+c);
    }

    public static void display(){ // zero == o paraterli

    }
}
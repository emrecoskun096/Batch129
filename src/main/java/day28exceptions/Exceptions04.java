package day28exceptions;

public class Exceptions04 {

    public static void main(String[] args) {

        String[] arr = {"A", "G", "M", "L"};
        getElementFromArrray(arr,1 );
        getElementFromArrray(arr,5 );
        System.out.println("Hi!");
    }

    //Array'lerde olmayan bir index kullanildiginida java "ArrayIndexOutOfBoundsException" atar.
    public static void getElementFromArrray(String[] s ,int idx){

        try {
            String el = s[idx];
            System.out.println(el);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
            System.out.println(e.getCause());

        }


    }
}
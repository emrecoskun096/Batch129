package day11forloop;

public class C03_ForLoop {
    //INTERWIEW QUESTIONS
    public static void main(String[] args) {
        //String karakterleri teker teker yazdiran;
        //Eger 'a' karakterini gorurse yazdirmayi durduran kodu yaziniz

        String cumle="Ogrenmek yasamin tek kanitidir";

        for (int i = 0;     i <cumle.length();        i++) {
            if(cumle.charAt(i) == 'a'){
                break;
            }//if body
            System.out.print(cumle.charAt(i)+"  ");

        }


    }
}
















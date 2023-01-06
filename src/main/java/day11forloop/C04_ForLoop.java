package day11forloop;

public class C04_ForLoop {

    public static void main(String[] args) {
        //Ex : 1'den 100'e kadar 6 ile bolunenler haric tum tamsayilari
        //ekrana yazdiriniz

        for (int i = 1; i <101 ; i++) {

            if(i%6 == 0){
                continue;//bosver
            }//if body
            System.out.print(i+ " ");

        }//for body
        System.out.println();

        //Interwiew
        //Size verilen bir String'i ters ceviren kodu yaziniz
        String str="Mustafa";//afatsuM
        String ters= "";//yeni bir conteyner olusturduk

        for (int i = str.length()-1; i >-1 ; i--) {
            char harf=str.charAt(i);
            // ters=ters+harf;
            ters+=harf;

        }
        System.out.println(ters);




    }//main
}

/*
public static void main(String[] args) {

    //Interview Question

    //Example 2: Size verilen bir String'i ters ceviren kodu yaziniz

    String str = "Mustafa"; //afatsuM
    String reverseStr = "";

    for (int i = str.length() - 1; i > -1; i--) {
        reverseStr += str.charAt(i);
    }
    System.out.println(reverseStr);
}
 */














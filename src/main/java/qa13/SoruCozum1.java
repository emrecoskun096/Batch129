package qa13;

public class SoruCozum1 {
    public static void main(String[] args) {
       // 120'den 11'e kadar 4 ile bölünebilen ve 6 ile bölünebilen tüm tam sayıları aynı satırda iki
       // ardışık tam sayı arasında boşluk bırakarak yazınız.


        String s ="";
        for (int i =120; i>10 ; i--) {
            if(i%4==0 && i%6==0){
                s+=i+" ";
            }

        }
        System.out.println(s);

        //5 hariç 3'ten 9'a kadar olan tam sayıları yazdırmak için kod yazınız




        for (int i = 3; i <10 ; i++) {
            if(i==5){
                break;
            }
            System.out.print(i+" ");

        }
        System.out.println();

        //Bir String’ i tersine çevirmek için kod yazınız. Örnek; Mark ==> kraM

        String x="Mark";
        String ters="";

        for (int i =x.length()-1; i>=0 ; i--) {

            ters+=x.charAt(i);


        }
        System.out.println(ters);


        // Bir String’ de benzersiz(tekrarsız) karakterler yazdırmak için kod yazınız.
        //Örneğin; Hello ==> Heo

        String m="Hello";

        for (int i = 0; i < m.length() ; i++) {
            char n=m.charAt(i);
            if(m.indexOf(n)==m.lastIndexOf(n)){
                System.out.print(n);

            }





        }
        System.out.println();
        //Bir String de, ilk 'm' karakterinden önceki tüm karakterleri yazınız.
        //String s = "Christmas";

        String z="Chiristmas";
        String o="";

        for (int i = 0; i <z.length() ; i++) {
            char r=z.charAt(i);
            if(r=='m'){
                break;
            }
            o+=r;

        }
        System.out.println(o);

        // )Bir String ‘ in palindrom olup olmadığını kontrol etmek için kod yazınız. Bir String, tersi ile
        //aynıysa, buna palindrom denir. Örneğin; “anna”, “123321” palindromlardır

        String duz="runner";
        String ters1="";

        for (int i =duz.length()-1; i>=0 ; i--) {
            char ters2=duz.charAt(i);
            ters1+=ters2;




        }
        if (duz.equals(ters1)){
            System.out.println(duz+  "   palindromdur");

        }else
            System.out.println(duz + "   palinrom degildir");


        
        /*
            Example 1: Asagidaki ciktiyi verecek kodu yaziniz
                        Week: 1
                          Day: 1
                          Day: 2
                          Day: 3
                          .....
                        Week: 2
                          Day: 1
                          Day: 2
                          Day: 3
                          ....
        */

        for (int i = 1; i < 3; i++) {
            System.out.println("week:"+ i);
            for (int j = 1; j <4 ; j++) {
                System.out.println("day:"+ j);

                if(j==3){
                    System.out.println("**************");


            }

            }


            
        }








































    }
}

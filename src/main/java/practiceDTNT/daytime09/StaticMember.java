package practiceDTNT.daytime09;


public class StaticMember {//StaticUyeler

    //Ekran Ciktisi Nedir?
    static int x;
    int y;
    StaticMember(){//constructor
        x+=10;
        y++;
    }//const
    public static int karesiniAl(){
        return x*x;
    }
    public static void main(String[] args) {
        StaticMember sm1 = new StaticMember();
        StaticMember sm2 = new StaticMember();
        int z=sm1.karesiniAl();
        System.out.println("-x "+z+" -y"+sm2.y);//-x 400 -y1

    }//main


}//class{


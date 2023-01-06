package ssg.mehod;

import ssg.mehod.Okul;

public class Runner {
    public static void main(String[] args) {

        Okul obj=new Okul();
        System.out.println(obj.okulIsmi);
        System.out.println(obj.yil);
        System.out.println(obj.isActive);


        Okul.okulIsmi("Star okulu");
        System.out.println(obj.yilYazdir(2023));










    }

}







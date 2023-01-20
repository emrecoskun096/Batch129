package ssg.Lists;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Lists01 {

    public static void main(String[] args) {


//        ArrayList<Integer> list2= new ArrayList<Integer>();
//        Collection<Integer> list3= new ArrayList<Integer>();

        List<Integer> list= new ArrayList<>();

        list.add(15);
        list.add(16);
        list.add(17);
        list.add(18);
        list.add(19);
        list.add(20);

        System.out.println(list);//[15, 16, 17, 18, 19, 20]
        System.out.println(list.size());


        for (int i = 0; i <list.size() ; i++) {
            System.out.println(list.get(i));
        }
        System.out.println("-----------------");
        for (Integer w:list){
            System.out.println(w);
        }


    }
}